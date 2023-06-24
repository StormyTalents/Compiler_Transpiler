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
public class Product extends BinaryOperation {

    public Product(Expression expression1, Expression expression2, Token token) {
        super(expression1, expression2, token);
    }

    @Override
    public java.lang.String toString() {
        return "(" + expression1 + " * " + expression2 + ")";
    }

}
