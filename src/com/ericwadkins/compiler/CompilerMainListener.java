
package com.ericwadkins.compiler;

import com.ericwadkins.compiler.components.elements.*;
import com.ericwadkins.compiler.components.expressions.*;
import com.ericwadkins.compiler.components.expressions.Boolean;
import com.ericwadkins.compiler.components.expressions.Character;
import com.ericwadkins.compiler.components.expressions.Number;
import com.ericwadkins.compiler.components.expressions.String;
import com.ericwadkins.compiler.components.operations.*;
import com.ericwadkins.compiler.components.assignments.*;
import com.ericwadkins.parser.CompilerListener;
import com.ericwadkins.parser.CompilerParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * This class provides an empty implementation of {@link CompilerListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */

public class CompilerMainListener implements CompilerListener {

    public final Stack<Object> stack = new Stack<>();
    public final Stack<Block> blocks = new Stack<>();
    public final List<Block> blockList = new ArrayList<>();

    private final boolean debug;

    public CompilerMainListener(boolean debug) {
        this.debug = debug;
        blocks.add(new Block());
    }

    public List<Block> getBlocks() {
        return new ArrayList<>(blockList);
    }

	@Override public void enterRoot(CompilerParser.RootContext ctx) { }

	@Override public void exitRoot(CompilerParser.RootContext ctx) {
        if (debug) System.out.println("\nExiting root");

        Block masterBlock = blocks.get(0);
        List<Element> elements = new ArrayList<>();
        while (!stack.empty()) {
            elements.add((Element) stack.pop());
        }
        Collections.reverse(elements);
        masterBlock.addAll(elements);

        blockList.add(masterBlock);
        Collections.sort(blockList);

        if (debug) System.out.println(masterBlock);
    }

	@Override public void enterElement(CompilerParser.ElementContext ctx) { }

	@Override public void exitElement(CompilerParser.ElementContext ctx) { }

    @Override public void enterBasic_element(CompilerParser.Basic_elementContext ctx) { }

    @Override public void exitBasic_element(CompilerParser.Basic_elementContext ctx) { }

    @Override public void enterStatement_set(CompilerParser.Statement_setContext ctx) { }

    @Override
    public void exitStatement_set(CompilerParser.Statement_setContext ctx) {
        if (debug) System.out.println("\nExiting StatementSet");

        int statementCount = ctx.statement().size();
        List<Element> elements = new ArrayList<>();
        for (int i = 0; i < statementCount; i++) {
            elements.add((Element) stack.pop());
        }
        Collections.reverse(elements);

        StatementSet statementSet = new StatementSet(elements, ctx.getStart());
        stack.push(statementSet);

        if (debug) System.out.println(statementSet);
    }

    @Override public void enterStatement(CompilerParser.StatementContext ctx) { }

    @Override public void exitStatement(CompilerParser.StatementContext ctx) { }

    @Override public void enterFlow_statement(CompilerParser.Flow_statementContext ctx) { }

    @Override public void exitFlow_statement(CompilerParser.Flow_statementContext ctx) { }

    @Override public void enterBlock_element(CompilerParser.Block_elementContext ctx) { }

    @Override public void exitBlock_element(CompilerParser.Block_elementContext ctx) { }

    @Override public void enterBlock(CompilerParser.BlockContext ctx) {
        if (debug) System.out.println("\nEntering Block");

        blocks.push(new Block(ctx.getStart()));
    }

	@Override public void exitBlock(CompilerParser.BlockContext ctx) {
        if (debug) System.out.println("\nExiting Block");

        Block block = blocks.pop();
        List<Element> elements = new ArrayList<>();
        for (int i = 0; i < ctx.element().size(); i++) {
            elements.add((Element) stack.pop());
        }
        Collections.reverse(elements);
        block.addAll(elements);

        stack.add(block);
        blockList.add(block);

        if (debug) System.out.println(block);
    }

    @Override public void enterDeclaration_set(CompilerParser.Declaration_setContext ctx) { }

    @Override
    public void exitDeclaration_set(CompilerParser.Declaration_setContext ctx) {
        if (debug) System.out.println("\nExiting DeclarationSet");

        int elementCount = ctx.declaration().size();
        List<Element> elements = new ArrayList<>();
        for (int i = 0; i < elementCount; i++) {
            elements.add((Element) stack.pop());
        }
        Collections.reverse(elements);

        Type type = (Type) stack.pop();

        DeclarationSet declarationSet = new DeclarationSet(type, elements, ctx.getStart());
        stack.push(declarationSet);

        if (debug) System.out.println(declarationSet);
    }

    @Override public void enterDeclaration(CompilerParser.DeclarationContext ctx) { }

    @Override
    public void exitDeclaration(CompilerParser.DeclarationContext ctx) {

    }

    /*@Override public void enterNative_block(CompilerParser.Native_blockContext ctx) { }

    @Override
    public void exitNative_block(CompilerParser.Native_blockContext ctx) {
        if (debug) System.out.println("\nExiting NativeBlock");

        java.lang.String content = ctx.getText().replaceFirst("^.*<\\{", "").replaceFirst("}>$", "");

        NativeBlock nativeBlock = new NativeBlock(content, ctx.getStart());
        stack.push(nativeBlock);

        if (debug) System.out.println(nativeBlock);
    }*/

	@Override public void enterAssignment(CompilerParser.AssignmentContext ctx) { }

	@Override public void exitAssignment(CompilerParser.AssignmentContext ctx) { }

    @Override public void enterDirect_assign(CompilerParser.Direct_assignContext ctx) { }

    @Override public void exitDirect_assign(CompilerParser.Direct_assignContext ctx) {
        if (debug) System.out.println("\nExiting DirectAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        DirectAssignment directAssignment = new DirectAssignment(variable, expression, ctx.getStart());
        stack.push(directAssignment);

        if (debug) System.out.println(directAssignment);
    }

    @Override public void enterSum_assign(CompilerParser.Sum_assignContext ctx) { }

    @Override public void exitSum_assign(CompilerParser.Sum_assignContext ctx) {
        if (debug) System.out.println("\nExiting SumAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        SumAssignment sumAssignment = new SumAssignment(variable, expression, ctx.getStart());
        stack.push(sumAssignment);

        if (debug) System.out.println(sumAssignment);
    }

    @Override public void enterDifference_assign(CompilerParser.Difference_assignContext ctx) { }

    @Override public void exitDifference_assign(CompilerParser.Difference_assignContext ctx) {
        if (debug) System.out.println("\nExiting DifferenceAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        DifferenceAssignment differenceAssignment = new DifferenceAssignment(variable, expression, ctx.getStart());
        stack.push(differenceAssignment);

        if (debug) System.out.println(differenceAssignment);
    }

    @Override public void enterProduct_assign(CompilerParser.Product_assignContext ctx) { }

    @Override public void exitProduct_assign(CompilerParser.Product_assignContext ctx) {
        if (debug) System.out.println("\nExiting ProductAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        ProductAssignment productAssignment = new ProductAssignment(variable, expression, ctx.getStart());
        stack.push(productAssignment);

        if (debug) System.out.println(productAssignment);
    }

    @Override public void enterQuotient_assign(CompilerParser.Quotient_assignContext ctx) { }

    @Override public void exitQuotient_assign(CompilerParser.Quotient_assignContext ctx) {
        if (debug) System.out.println("\nExiting QuotientAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        QuotientAssignment quotientAssignment = new QuotientAssignment(variable, expression, ctx.getStart());
        stack.push(quotientAssignment);

        if (debug) System.out.println(quotientAssignment);
    }

    @Override public void enterModulus_assign(CompilerParser.Modulus_assignContext ctx) { }

    @Override public void exitModulus_assign(CompilerParser.Modulus_assignContext ctx) {
        if (debug) System.out.println("\nExiting ModulusAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        ModulusAssignment modulusAssignment = new ModulusAssignment(variable, expression, ctx.getStart());
        stack.push(modulusAssignment);

        if (debug) System.out.println(modulusAssignment);
    }

    @Override public void enterPower_assign(CompilerParser.Power_assignContext ctx) { }

    @Override public void exitPower_assign(CompilerParser.Power_assignContext ctx) {
        if (debug) System.out.println("\nExiting PowerAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        PowerAssignment powerAssignment = new PowerAssignment(variable, expression, ctx.getStart());
        stack.push(powerAssignment);

        if (debug) System.out.println(powerAssignment);
    }

    @Override public void enterBit_left_assign(CompilerParser.Bit_left_assignContext ctx) { }

    @Override public void exitBit_left_assign(CompilerParser.Bit_left_assignContext ctx) {
        if (debug) System.out.println("\nExiting BitwiseLeftAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        BitwiseLeftAssignment bitLeftAssignment = new BitwiseLeftAssignment(variable, expression, ctx.getStart());
        stack.push(bitLeftAssignment);

        if (debug) System.out.println(bitLeftAssignment);
    }

    @Override public void enterBit_right_assign(CompilerParser.Bit_right_assignContext ctx) { }

    @Override public void exitBit_right_assign(CompilerParser.Bit_right_assignContext ctx) {
        if (debug) System.out.println("\nExiting BitwiseRightAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        BitwiseRightAssignment bitRightAssignment = new BitwiseRightAssignment(variable, expression, ctx.getStart());
        stack.push(bitRightAssignment);

        if (debug) System.out.println(bitRightAssignment);
    }

    @Override public void enterBit_and_assign(CompilerParser.Bit_and_assignContext ctx) { }

    @Override public void exitBit_and_assign(CompilerParser.Bit_and_assignContext ctx) {
        if (debug) System.out.println("\nExiting BitwiseAndAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        BitwiseAndAssignment bitAndAssignment = new BitwiseAndAssignment(variable, expression, ctx.getStart());
        stack.push(bitAndAssignment);

        if (debug) System.out.println(bitAndAssignment);
    }

    @Override public void enterBit_xor_assign(CompilerParser.Bit_xor_assignContext ctx) { }

    @Override public void exitBit_xor_assign(CompilerParser.Bit_xor_assignContext ctx) {
        if (debug) System.out.println("\nExiting BitwiseXorAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        BitwiseXorAssignment bitXorAssignment = new BitwiseXorAssignment(variable, expression, ctx.getStart());
        stack.push(bitXorAssignment);

        if (debug) System.out.println(bitXorAssignment);
    }

    @Override public void enterBit_or_assign(CompilerParser.Bit_or_assignContext ctx) { }

    @Override public void exitBit_or_assign(CompilerParser.Bit_or_assignContext ctx) {
        if (debug) System.out.println("\nExiting BitwiseOrAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        BitwiseOrAssignment bitOrAssignment = new BitwiseOrAssignment(variable, expression, ctx.getStart());
        stack.push(bitOrAssignment);

        if (debug) System.out.println(bitOrAssignment);
    }

	@Override public void enterIf_statement(CompilerParser.If_statementContext ctx) { }

	@Override public void exitIf_statement(CompilerParser.If_statementContext ctx) {
        if (debug) System.out.println("\nExiting IfStatement");

        Element element = (Element) stack.pop();
        Expression expression = (Expression) stack.pop();
        Block block;
        if (!(element instanceof Block)) {
            block = new Block(ctx.getStart());
            block.add(element);
            blockList.add(block);
        }
        else {
            block = (Block) element;
        }

        IfStatement ifStatement = new IfStatement(expression, block, ctx.getStart());
        stack.push(ifStatement);

        if (debug) System.out.println(ifStatement);
    }

	@Override public void enterElse_if_statement(CompilerParser.Else_if_statementContext ctx) { }

	@Override public void exitElse_if_statement(CompilerParser.Else_if_statementContext ctx) {
        if (debug) System.out.println("\nExiting ElseIfStatement");

        Element element = (Element) stack.pop();
        Expression expression = (Expression) stack.pop();
        Block block;
        if (!(element instanceof Block)) {
            block = new Block(ctx.getStart());
            block.add(element);
            blockList.add(block);
        }
        else {
            block = (Block) element;
        }

        ElseIfStatement elseIfStatement = new ElseIfStatement(expression, block, ctx.getStart());
        stack.push(elseIfStatement);

        if (debug) System.out.println(elseIfStatement);
    }

	@Override public void enterElse_statement(CompilerParser.Else_statementContext ctx) { }

	@Override public void exitElse_statement(CompilerParser.Else_statementContext ctx) {
        if (debug) System.out.println("\nExiting ElseStatement");

        Element element = (Element) stack.pop();
        Block block;
        if (!(element instanceof Block)) {
            block = new Block(ctx.getStart());
            block.add(element);
            blockList.add(block);
        }
        else {
            block = (Block) element;
        }

        ElseStatement elseStatement = new ElseStatement(block, ctx.getStart());
        stack.push(elseStatement);

        if (debug) System.out.println(elseStatement);
    }

    @Override public void enterFor_loop(CompilerParser.For_loopContext ctx) { }

    @Override
    public void exitFor_loop(CompilerParser.For_loopContext ctx) {
        System.out.println("\nExiting ForLoop");

        Element element = (Element) stack.pop();
        Block block;
        if (!(element instanceof Block)) {
            block = new Block(ctx.getStart());
            block.add(element);
            blockList.add(block);
        }
        else {
            block = (Block) element;
        }

        Element update = null;
        if (ctx.update() != null) {
            update = (Element) stack.pop();
        }

        Expression condition = null;
        if (ctx.condition() != null) {
            condition = (Expression) stack.pop();
        }

        Element initialization = null;
        if (ctx.initialization() != null) {
            initialization = (Element) stack.pop();
        }

        ForLoop forLoop = new ForLoop(initialization, condition, update, block, ctx.getStart());
        stack.push(forLoop);

        if (debug) System.out.println(forLoop);
    }

    @Override public void enterWhile_loop(CompilerParser.While_loopContext ctx) { }

    @Override
    public void exitWhile_loop(CompilerParser.While_loopContext ctx) {
        System.out.println("\nExiting WhileLoop");

        Element element = (Element) stack.pop();
        Block block;
        if (!(element instanceof Block)) {
            block = new Block(ctx.getStart());
            block.add(element);
            blockList.add(block);
        }
        else {
            block = (Block) element;
        }

        Expression condition = null;
        if (ctx.condition() != null) {
            condition = (Expression) stack.pop();
        }

        WhileLoop whileLoop = new WhileLoop(condition, block, ctx.getStart());
        stack.push(whileLoop);

        if (debug) System.out.println(whileLoop);
    }

    @Override public void enterDo_while_loop(CompilerParser.Do_while_loopContext ctx) { }

    @Override
    public void exitDo_while_loop(CompilerParser.Do_while_loopContext ctx) {
        System.out.println("\nExiting DoWhileLoop");

        Expression condition = null;
        if (ctx.condition() != null) {
            condition = (Expression) stack.pop();
        }

        Element element = (Element) stack.pop();
        Block block;
        if (!(element instanceof Block)) {
            block = new Block(ctx.getStart());
            block.add(element);
            blockList.add(block);
        }
        else {
            block = (Block) element;
        }

        DoWhileLoop doWhileLoop = new DoWhileLoop(condition, block, ctx.getStart());
        stack.push(doWhileLoop);

        if (debug) System.out.println(doWhileLoop);
    }

    @Override public void enterInitialization(CompilerParser.InitializationContext ctx) { }

    @Override public void exitInitialization(CompilerParser.InitializationContext ctx) { }

    @Override public void enterCondition(CompilerParser.ConditionContext ctx) { }

    @Override public void exitCondition(CompilerParser.ConditionContext ctx) { }

    @Override public void enterUpdate(CompilerParser.UpdateContext ctx) { }

    @Override public void exitUpdate(CompilerParser.UpdateContext ctx) { }

    @Override public void enterFunction(CompilerParser.FunctionContext ctx) { }

	@Override public void exitFunction(CompilerParser.FunctionContext ctx) {
        if (debug) System.out.println("\nExiting Function");

        int parameterCount = ctx.type().size() - 1;

        Element element = (Element) stack.pop();
        Block block;
        if (!(element instanceof Block)) {
            block = new Block(ctx.getStart());
            block.add(element);
            blockList.add(block);
        }
        else {
            block = (Block) element;
        }

        List<Type> types = new ArrayList<>();
        List<Variable> variables = new ArrayList<>();
        for (int i = 0; i < parameterCount; i++) {
            variables.add((Variable) stack.pop());
            types.add((Type) stack.pop());
        }
        Collections.reverse(types);
        Collections.reverse(variables);

        Variable variable = (Variable) stack.pop();
        Type type = (Type) stack.pop();

        Function function = new Function(type, variable, types, variables, block, ctx.getStart());
        stack.push(function);

        if (debug) System.out.println(function);
    }

    @Override public void enterReturn_statement(CompilerParser.Return_statementContext ctx) { }

    @Override public void exitReturn_statement(CompilerParser.Return_statementContext ctx) {
        if (debug) System.out.println("\nExiting ReturnStatement");

        Expression expression = (Expression) stack.pop();

        ReturnStatement returnStatement = new ReturnStatement(expression, ctx.getStart());
        stack.push(returnStatement);

        if (debug) System.out.println(returnStatement);
    }

    @Override public void enterBreak_statement(CompilerParser.Break_statementContext ctx) { }

    @Override
    public void exitBreak_statement(CompilerParser.Break_statementContext ctx) {
        if (debug) System.out.println("\nExiting BreakStatement");

        BreakStatement breakStatement = new BreakStatement(ctx.getStart());
        stack.push(breakStatement);

        if (debug) System.out.println(breakStatement);
    }

    @Override public void enterContinue_statement(CompilerParser.Continue_statementContext ctx) { }

    @Override
    public void exitContinue_statement(CompilerParser.Continue_statementContext ctx) {
        if (debug) System.out.println("\nExiting ContinueStatement");

        ContinueStatement continueStatement = new ContinueStatement(ctx.getStart());
        stack.push(continueStatement);

        if (debug) System.out.println(continueStatement);
    }

    @Override public void enterExpression(CompilerParser.ExpressionContext ctx) { }

	@Override public void exitExpression(CompilerParser.ExpressionContext ctx) {
        if (ctx.postfix_call_subscript() != null) {
            if (ctx.postfix_call_subscript().getText().equals("++")) {
                if (debug) System.out.println("\nExiting PostfixIncrement");

                PostfixIncrement postfixIncrement =
                        new PostfixIncrement((Expression) stack.pop(), ctx.getStart());
                stack.push(postfixIncrement);

                if (debug) System.out.println(postfixIncrement);
            }
            else if (ctx.postfix_call_subscript().getText().equals("--")) {
                if (debug) System.out.println("\nExiting PostfixDecrement");

                PostfixDecrement postfixDecrement =
                        new PostfixDecrement((Expression) stack.pop(), ctx.getStart());
                stack.push(postfixDecrement);

                if (debug) System.out.println(postfixDecrement);
            }
            else if (ctx.postfix_call_subscript().getText().startsWith("(")) {
                if (debug) System.out.println("\nExiting Call");

                int expressionCount = ctx.postfix_call_subscript().expression().size();
                List<Expression> expressions = new ArrayList<>();
                for (int i = 0; i < expressionCount; i++) {
                    expressions.add((Expression) stack.pop());
                }
                Collections.reverse(expressions);
                Expression expression = (Expression) stack.pop();

                Call call = new Call(expression, expressions, ctx.getStart());
                stack.push(call);

                if (debug) System.out.println(call);
            }
            else if (ctx.postfix_call_subscript().getText().startsWith("[")) {
                if (debug) System.out.println("\nExiting Subscript");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Subscript subscript = new Subscript(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(subscript);

                if (debug) System.out.println(subscript);
            }
        }
        else if (ctx.prefix_unary() != null) {
            if (ctx.prefix_unary().getText().equals("++")) {
                if (debug) System.out.println("\nExiting PrefixIncrement");

                PrefixIncrement prefixIncrement =
                        new PrefixIncrement((Expression) stack.pop(), ctx.getStart());
                stack.push(prefixIncrement);

                if (debug) System.out.println(prefixIncrement);
            }
            else if (ctx.prefix_unary().getText().equals("--")) {
                if (debug) System.out.println("\nExiting PrefixDecrement");

                PrefixDecrement prefixDecrement =
                        new PrefixDecrement((Expression) stack.pop(), ctx.getStart());
                stack.push(prefixDecrement);

                if (debug) System.out.println(prefixDecrement);
            }
            else if (ctx.prefix_unary().getText().equals("+")) {
                if (debug) System.out.println("\nExiting Plus");

                Plus plus = new Plus((Expression) stack.pop(), ctx.getStart());
                stack.push(plus);

                if (debug) System.out.println(plus);
            }
            else if (ctx.prefix_unary().getText().equals("-")) {
                if (debug) System.out.println("\nExiting Minus");

                Minus minus = new Minus((Expression) stack.pop(), ctx.getStart());
                stack.push(minus);

                if (debug) System.out.println(minus);
            }
            else if (ctx.prefix_unary().getText().equals("!")) {
                if (debug) System.out.println("\nExiting Not");

                Not not = new Not((Expression) stack.pop(), ctx.getStart());
                stack.push(not);

                if (debug) System.out.println(not);
            }
            else if (ctx.prefix_unary().getText().equals("~")) {
                if (debug) System.out.println("\nExiting BitwiseNot");

                BitwiseNot bitwiseNot = new BitwiseNot((Expression) stack.pop(), ctx.getStart());
                stack.push(bitwiseNot);

                if (debug) System.out.println(bitwiseNot);
            }
        }
        else if (ctx.cast() != null) {
            if (ctx.cast().getText().startsWith("(")) {
                if (debug) System.out.println("\nExiting Cast");

                Expression expression = (Expression) stack.pop();
                Type type = (Type) stack.pop();

                Cast cast = new Cast(type, expression, ctx.getStart());
                stack.push(cast);

                if (debug) System.out.println(cast);
            }
        }
        else if (ctx.pow_root() != null) {
            if (ctx.pow_root().getText().equals("**")) {
                if (debug) System.out.println("\nExiting Power");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Power power = new Power(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(power);

                if (debug) System.out.println(power);
            }
            else if (ctx.pow_root().getText().equals("//")) {
                if (debug) System.out.println("\nExiting Root");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Root root = new Root(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(root);

                if (debug) System.out.println(root);
            }
        }
        else if (ctx.mult_div_mod() != null) {
            if (ctx.mult_div_mod().getText().equals("*")) {
                if (debug) System.out.println("\nExiting Product");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Product product = new Product(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(product);

                if (debug) System.out.println(product);
            }
            else if (ctx.mult_div_mod().getText().equals("/")) {
                if (debug) System.out.println("\nExiting Quotient");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Quotient quotient = new Quotient(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(quotient);

                if (debug) System.out.println(quotient);
            }
            else if (ctx.mult_div_mod().getText().equals("%")) {
                if (debug) System.out.println("\nExiting Remainder");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Remainder remainder = new Remainder(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(remainder);

                if (debug) System.out.println(remainder);
            }
        }
        else if (ctx.add_sub() != null) {
            if (ctx.add_sub().getText().equals("+")) {
                if (debug) System.out.println("\nExiting Sum");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Sum sum = new Sum(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(sum);

                if (debug) System.out.println(sum);
            }
            else if (ctx.add_sub().getText().equals("-")) {
                if (debug) System.out.println("\nExiting Difference");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Difference difference =
                        new Difference(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(difference);

                if (debug) System.out.println(difference);
            }
        }
        else if (ctx.bitleft_right() != null) {
            if (ctx.bitleft_right().getText().equals("<<")) {
                if (debug) System.out.println("\nExiting BitwiseLeftShift");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                BitwiseLeftShift bitwiseLeftShift =
                        new BitwiseLeftShift(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(bitwiseLeftShift);

                if (debug) System.out.println(bitwiseLeftShift);
            }
            else if (ctx.bitleft_right().getText().equals(">>")) {
                if (debug) System.out.println("\nExiting BitwiseRightShift");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                BitwiseRightShift bitwiseRightShift =
                        new BitwiseRightShift(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(bitwiseRightShift);

                if (debug) System.out.println(bitwiseRightShift);
            }
        }
        else if (ctx.less_greater() != null) {
            if (ctx.less_greater().getText().equals("<")) {
                if (debug) System.out.println("\nExiting LessThan");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                LessThan lessThan = new LessThan(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(lessThan);

                if (debug) System.out.println(lessThan);
            }
            else if (ctx.less_greater().getText().equals("<=")) {
                if (debug) System.out.println("\nExiting LessThanOrEqual");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                LessThanOrEqual lessThanOrEqual =
                        new LessThanOrEqual(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(lessThanOrEqual);

                if (debug) System.out.println(lessThanOrEqual);
            }
            else if (ctx.less_greater().getText().equals(">")) {
                if (debug) System.out.println("\nExiting GreaterThan");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                GreaterThan greaterThan =
                        new GreaterThan(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(greaterThan);

                if (debug) System.out.println(greaterThan);
            }
            else if (ctx.less_greater().getText().equals(">=")) {
                if (debug) System.out.println("\nExiting GreaterThanOrEqual");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                GreaterThanOrEqual greaterThanOrEqual =
                        new GreaterThanOrEqual(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(greaterThanOrEqual);

                if (debug) System.out.println(greaterThanOrEqual);
            }
        }
        else if (ctx.equal_notequal() != null) {
            if (ctx.equal_notequal().getText().equals("==")) {
                if (debug) System.out.println("\nExiting Equal");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Equal equal = new Equal(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(equal);

                if (debug) System.out.println(equal);
            }
            else if (ctx.equal_notequal().getText().equals("!=")) {
                if (debug) System.out.println("\nExiting NotEqual");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                NotEqual notEqual = new NotEqual(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(notEqual);

                if (debug) System.out.println(notEqual);
            }
            else if (ctx.equal_notequal().getText().equals("===")) {
                if (debug) System.out.println("\nExiting ReferenceEqual");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                ReferenceEqual referenceEqual =
                        new ReferenceEqual(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(referenceEqual);

                if (debug) System.out.println(referenceEqual);
            }
        }
        else if (ctx.bitand() != null) {
            if (ctx.bitand().getText().equals("&")) {
                if (debug) System.out.println("\nExiting BitwiseAnd");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                BitwiseAnd bitwiseAnd =
                        new BitwiseAnd(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(bitwiseAnd);

                if (debug) System.out.println(bitwiseAnd);
            }
        }
        else if (ctx.bitxor() != null) {
            if (ctx.bitxor().getText().equals("^")) {
                if (debug) System.out.println("\nExiting BitwiseXor");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                BitwiseXor bitwiseXor =
                        new BitwiseXor(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(bitwiseXor);

                if (debug) System.out.println(bitwiseXor);
            }
        }
        else if (ctx.bitor() != null) {
            if (ctx.bitor().getText().equals("|")) {
                if (debug) System.out.println("\nExiting BitwiseOr");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                BitwiseOr bitwiseOr = new BitwiseOr(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(bitwiseOr);

                if (debug) System.out.println(bitwiseOr);
            }
        }
        else if (ctx.and() != null) {
            if (ctx.and().getText().equals("&&")) {
                if (debug) System.out.println("\nExiting And");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                And and = new And(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(and);

                if (debug) System.out.println(and);
            }
        }
        else if (ctx.or() != null) {
            if (ctx.or().getText().equals("||")) {
                if (debug) System.out.println("\nExiting Or");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Or or = new Or(expressions.get(0), expressions.get(1), ctx.getStart());
                stack.push(or);

                if (debug) System.out.println(or);
            }
        }
    }

    @Override public void enterPostfix_call_subscript(CompilerParser.Postfix_call_subscriptContext ctx) { }

    @Override public void exitPostfix_call_subscript(CompilerParser.Postfix_call_subscriptContext ctx) { }

    @Override public void enterPrefix_unary(CompilerParser.Prefix_unaryContext ctx) { }

    @Override public void exitPrefix_unary(CompilerParser.Prefix_unaryContext ctx) { }

    @Override public void enterCast(CompilerParser.CastContext ctx) { }

    @Override public void exitCast(CompilerParser.CastContext ctx) { }

    @Override public void enterPow_root(CompilerParser.Pow_rootContext ctx) { }

    @Override public void exitPow_root(CompilerParser.Pow_rootContext ctx) { }

    @Override public void enterMult_div_mod(CompilerParser.Mult_div_modContext ctx) { }

    @Override public void exitMult_div_mod(CompilerParser.Mult_div_modContext ctx) { }

    @Override public void enterAdd_sub(CompilerParser.Add_subContext ctx) { }

    @Override public void exitAdd_sub(CompilerParser.Add_subContext ctx) { }

    @Override public void enterBitleft_right(CompilerParser.Bitleft_rightContext ctx) { }

    @Override public void exitBitleft_right(CompilerParser.Bitleft_rightContext ctx) { }

    @Override public void enterLess_greater(CompilerParser.Less_greaterContext ctx) { }

    @Override public void exitLess_greater(CompilerParser.Less_greaterContext ctx) { }

    @Override public void enterEqual_notequal(CompilerParser.Equal_notequalContext ctx) { }

    @Override public void exitEqual_notequal(CompilerParser.Equal_notequalContext ctx) { }

    @Override public void enterBitand(CompilerParser.BitandContext ctx) { }

    @Override public void exitBitand(CompilerParser.BitandContext ctx) { }

    @Override public void enterBitxor(CompilerParser.BitxorContext ctx) { }

    @Override public void exitBitxor(CompilerParser.BitxorContext ctx) { }

    @Override public void enterBitor(CompilerParser.BitorContext ctx) { }

    @Override public void exitBitor(CompilerParser.BitorContext ctx) { }

    @Override public void enterAnd(CompilerParser.AndContext ctx) { }

    @Override public void exitAnd(CompilerParser.AndContext ctx) { }

    @Override public void enterOr(CompilerParser.OrContext ctx) { }

    @Override public void exitOr(CompilerParser.OrContext ctx) { }

    @Override public void enterType(CompilerParser.TypeContext ctx) { }

	@Override public void exitType(CompilerParser.TypeContext ctx) {
        if (debug) System.out.println("\nExiting Type");

        boolean array = false;
        if (ctx.getText().endsWith("[]")) {
            array = true;
        }

        Type type = new Type(ctx.TYPE().getText(), array);
        stack.push(type);

        if (debug) System.out.println(type);
    }

	@Override public void enterVariable(CompilerParser.VariableContext ctx) { }

	@Override public void exitVariable(CompilerParser.VariableContext ctx) {
        if (debug) System.out.println("\nExiting Variable");

        Variable variable = new Variable(ctx.VARIABLE().getText(), ctx.getStart());
        stack.push(variable);

        if (debug) System.out.println(variable);
    }

	@Override public void enterNumber(CompilerParser.NumberContext ctx) { }

	@Override public void exitNumber(CompilerParser.NumberContext ctx) {
        if (debug) System.out.println("\nExiting Number");

        Number number = new Number(ctx.NUMBER().getText(), ctx.getStart());
        stack.push(number);

        if (debug) System.out.println(number);
    }

	@Override public void enterString(CompilerParser.StringContext ctx) { }

	@Override public void exitString(CompilerParser.StringContext ctx) {
        if (debug) System.out.println("\nExiting String");

        String string = new String(ctx.STRING().getText(), ctx.getStart());
        stack.push(string);

        if (debug) System.out.println(string);
    }

	@Override public void enterCharacter(CompilerParser.CharacterContext ctx) { }

	@Override public void exitCharacter(CompilerParser.CharacterContext ctx) {
        if (debug) System.out.println("\nExiting Character");

        Character character = new Character(ctx.CHARACTER().getText(), ctx.getStart());
        stack.push(character);

        if (debug) System.out.println(character);
    }

    @Override public void enterBool(CompilerParser.BoolContext ctx) { }

    @Override
    public void exitBool(CompilerParser.BoolContext ctx) {
        if (debug) System.out.println("\nExiting Boolean");

        Boolean bool = new Boolean(ctx.BOOLEAN().getText(), ctx.getStart());
        stack.push(bool);

        if (debug) System.out.println(bool);
    }

    @Override public void enterArray(CompilerParser.ArrayContext ctx) { }

	@Override public void exitArray(CompilerParser.ArrayContext ctx) {
        if (debug) System.out.println("\nExiting Array");

        List<CompilerParser.ExpressionContext> expressionContexts = ctx.expression();
        List<Expression> expressions = new ArrayList<>();
        for (int i = 0; i < expressionContexts.size(); i++) {
            expressions.add((Expression) stack.pop());
        }
        Collections.reverse(expressions);

        Array array = new Array(expressions, ctx.getStart());
        stack.push(array);

        if (debug) System.out.println(array);
    }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }

	@Override public void exitEveryRule(ParserRuleContext ctx) {
        //if (debug) System.out.println(stack);
        //if (debug) System.out.println(ctx.start);
    }

	@Override public void visitTerminal(TerminalNode node) { }

	@Override public void visitErrorNode(ErrorNode node) { }
}