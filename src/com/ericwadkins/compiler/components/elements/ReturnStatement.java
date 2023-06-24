package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.expressions.Expression;
import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class ReturnStatement extends Element {

    public final Expression expression;

    public ReturnStatement(Expression expression, Token token) {
        super(token);
        this.expression = expression;
    }

    @Override
    public List<Variable> getVariables() {
        return new ArrayList<Variable>(expression.getVariables());
    }

    @Override
    public String toString() {
        return "return " + expression + ";";
    }

}
