package com.ericwadkins.compiler.components.operations;

import com.ericwadkins.compiler.components.elements.Block;
import com.ericwadkins.compiler.components.expressions.Expression;
import com.ericwadkins.compiler.components.expressions.Type;
import org.antlr.v4.runtime.Token;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class Cast extends UnaryOperation {

    public final Type type;

    public Cast(Type type, Expression expression, Token token) {
        super(expression, token);
        this.type = type;
    }

    @Override
    public String toString() {
        return "(" + type + ") " + expression;
    }
}
