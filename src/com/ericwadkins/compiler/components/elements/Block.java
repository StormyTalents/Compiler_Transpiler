package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class Block extends Element implements Comparable {

    private static long BLOCK_COUNT = 0;

    public final long blockId;
    public final List<Element> elements = new ArrayList();

    public Block() { // Master block
        super(null);
        blockId = BLOCK_COUNT;
        BLOCK_COUNT++;
    }

    public Block(Token token) {
        super(token);
        blockId = BLOCK_COUNT;
        BLOCK_COUNT++;
    }

    public void add(Element element) {
        element.parent = this;
        if (element instanceof BlockElement) {
            ((BlockElement) element).block.parent = this;
        }
        elements.add(element);
    }

    public void addAll(List<Element> elementList) {
        for (int i = 0; i < elementList.size(); i++) {
            add(elementList.get(i));
        }
    }

    public List<Element> getElementsInScope() {
        List<Element> scope = new ArrayList<>();
        if (parent != null) {
            scope.addAll(parent.getElementsInScope());
        }
        scope.addAll(elements);
        return scope;
    }

    public List<Element> getPriorElements(Element element) {
        List<Element> seen = new ArrayList<>();
        boolean contains = false;
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) == element
                    || elements.get(i) instanceof BlockElement && ((BlockElement) elements.get(i)).block == element) {
                contains = true;
                break;
            }
        }
        if (contains) {
            if (parent != null) {
                seen.addAll(parent.getPriorElements(this));
            }
            for (int i = 0; i < elements.size(); i++) {
                seen.add(elements.get(i));
                if (elements.get(i) == element
                        || elements.get(i) instanceof BlockElement && ((BlockElement) elements.get(i)).block == element) {
                    break;
                }
            }
            return seen;
        }
        else {
            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i) instanceof Block) {
                    seen = ((Block) elements.get(i)).getPriorElements(element);
                    if (seen.size() > 0) return seen;
                }
                else if (elements.get(i) instanceof BlockElement
                        && ((BlockElement) elements.get(i)).block instanceof Block) {
                    seen = ((Block) ((BlockElement) elements.get(i)).block).getPriorElements(element);
                    if (seen.size() > 0) return seen;
                }
            }
            return new ArrayList<>();
        }
    }

    public long getID() {
        return blockId;
    }

    @Override
    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<Variable>();
        for (int i = 0; i < elements.size(); i++) {
            variables.addAll(elements.get(i).getVariables());
        }
        return variables;
    }

    public int getDepth() {
        if (parent == null) {
            return 1;
        }
        return parent.getDepth() + 1;
    }

    @Override
    public java.lang.String toString() {
        int depth = getDepth();
        java.lang.String s =  "{";
        for (int i = 0; i < elements.size(); i++) {
            s += "\n";
            for (int j = 0; j < depth; j++) {
                s += "    ";
            }
            s += elements.get(i);
        }
        s += "\n";
        for (int j = 0; j < depth - 1; j++) {
            s += "    ";
        }
        s += "}";
        return s;
    }

    @Override
    public int compareTo(Object o) {
        return (int) (getID() - ((Block) o).getID());
    }
}
