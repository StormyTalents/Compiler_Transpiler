package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/14/16.
 */
public class StatementSet extends Element {

    public final List<Element> elements;

    public StatementSet(List<Element> elements, Token token) {
        super(token);
        this.elements = elements;
    }

    @Override
    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            variables.addAll(elements.get(i).getVariables());
        }
        return variables;
    }

    @Override
    public java.lang.String toString() {
        java.lang.String s = elements.get(0).toString();
        for (int i = 1; i < elements.size(); i++) {
            s += ", " + elements.get(i);
        }
        s += ";";
        return s;
    }
}
