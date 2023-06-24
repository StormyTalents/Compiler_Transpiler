package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.assignments.Assignment;
import com.ericwadkins.compiler.components.expressions.Type;
import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class DeclarationSet extends Element {

    public final Type type;
    public final List<Element> elements;

    public DeclarationSet(Type type, List<Element> elements, Token token) {
        super(token);
        this.type = type;
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
    public String toString() {
        String s = type + " " + elements.get(0).toString();
        for (int i = 1; i < elements.size(); i++) {
            s += ", " + elements.get(i);
        }
        s += ";";
        return s;
    }
}
