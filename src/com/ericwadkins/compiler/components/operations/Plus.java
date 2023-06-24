package com.ericwadkins.compiler.components.operations;

import com.ericwadkins.compiler.components.elements.Block;
import com.ericwadkins.compiler.components.expressions.Expression;
import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class Plus extends UnaryOperation {

    public Plus(Expression expression, Token token) {
        super(expression, token);
    }

    @Override
    public String toString() {
        return "+" + expression;
    }

}
