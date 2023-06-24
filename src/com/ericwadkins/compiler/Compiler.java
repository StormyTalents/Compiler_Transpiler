package com.ericwadkins.compiler;

import com.ericwadkins.compiler.components.elements.Block;
import com.ericwadkins.compiler.components.elements.Element;
import com.ericwadkins.parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Trees;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ericwadkins on 8/10/16.
 */
public class Compiler {

    private static final boolean showTree = true;

    public static void main(String[] args) {

        try {
            String input = new String(Files.readAllBytes(Paths.get("test4.txt")))
                    .replaceAll("\\/\\*((?!\\*\\/).|\\s)*\\*\\/", "").replaceAll("\\/\\/.*", ""); // Removes comments
            System.out.println(input);
            System.out.println("==================================\n");

            CharStream stream = new ANTLRInputStream(input);
            CompilerLexer lexer = new CompilerLexer(stream);
            lexer.reportErrorsAsExceptions();
            TokenStream tokens = new CommonTokenStream(lexer);
            CompilerParser parser = new CompilerParser(tokens);
            parser.reportErrorsAsExceptions();

            try {
                ParseTree tree = parser.root();
                ParseTreeWalker walker = new ParseTreeWalker();
                CompilerListener listener = new CompilerMainListener(true);

                System.out.println("Parsing...\n########################################");
                long startParsing = System.nanoTime();
                walker.walk(listener, tree);
                long endParsing = System.nanoTime();
                System.out.println("########################################\n");

                List<Block> blocks = ((CompilerMainListener) listener).getBlocks();

                if (showTree) {
                    // show AST in GUI
                    JFrame frame = new JFrame("Antlr AST");
                    JPanel panel = new JPanel();
                    JScrollPane scroll = new JScrollPane(panel);
                    TreeViewer view = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                    view.setScale(0.75);
                    panel.add(view);
                    frame.add(scroll);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(1675,800);
                    frame.setVisible(true);
                }

                /*System.out.println("Compiling...\n########################################");
                long startCompiling = System.nanoTime();
                compile(blocks);
                long endCompiling = System.nanoTime();
                System.out.println("########################################\n");*/

                System.out.println("Parse time: " + (endParsing - startParsing) / 1000000.0 + " ms");
                //System.out.println("Compile time: " + (endCompiling - startCompiling) / 1000000.0 + " ms");


            } catch(Exception e) {
                System.out.println();
                System.out.println("** PARSING ERROR");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                throw e;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void compile(List<Block> blocks) {

        for (Block block : blocks) {
            System.out.println("Block " + block.getID() + ":");

            System.out.println("\tElements in scope:");
            List<Element> inScope = block.getElementsInScope();
            for (int i = 0; i < inScope.size(); i++) {
                System.out.println("\t\t" + inScope.get(i));
            }

            /*System.out.println("\tVariables in block and all children (use to see if non-block elements are using undeclared variables):");
            List<Variable> variables = block.getVariables();
            for (int i = 0; i < variables.size(); i++) {
                System.out.println("\t\t" + variables.get(i));
            }*/

            System.out.println("\tElements prior to block:");
            List<Element> seen = block.getPriorElements();
            for (int i = 0; i < seen.size(); i++) {
                System.out.println("\t\t" + seen.get(i));
            }

            System.out.println();
        }

    }

}
