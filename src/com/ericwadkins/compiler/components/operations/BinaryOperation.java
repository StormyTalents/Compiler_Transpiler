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
public abstract class BinaryOperation extends Operation {

    public final Expression expression1;
    public final Expression expression2;

    public BinaryOperation(Expression expression1, Expression expression2, Token token) {
        super(token);
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<Variable>(expression1.getVariables());
        variables.addAll(expression2.getVariables());
        return variables;
    }

}
