package com.ericwadkins.compiler.components.operations;

import com.ericwadkins.compiler.components.elements.Block;
import com.ericwadkins.compiler.components.expressions.Expression;
import org.antlr.v4.runtime.Token;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class Root extends BinaryOperation {

    public Root(Expression expression1, Expression expression2, Token token) {
        super(expression1, expression2, token);
    }

    @Override
    public String toString() {
        return "(" + expression1 + " // " + expression2 + ")";
    }

}
