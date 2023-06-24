package com.ericwadkins.compiler.components.expressions;

import com.ericwadkins.compiler.components.elements.Block;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class Array extends Primitive {

    public final List<Expression> expressions;

    public Array(List<Expression> expressions, Token token) {
        super(token);
        this.expressions = new ArrayList(expressions);
    }

    @Override
    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<>();
        for (int i = 0; i < expressions.size(); i++) {
            variables.addAll(expressions.get(i).getVariables());
        }
        return variables;
    }

    @Override
    public java.lang.String toString() {
        java.lang.String string = "[";
        for (int i = 0; i < expressions.size(); i++) {
            string += expressions.get(i).toString() + (i < expressions.size() - 1 ? ", " : "");
        }
        string += "]";
        return string;
    }
}
