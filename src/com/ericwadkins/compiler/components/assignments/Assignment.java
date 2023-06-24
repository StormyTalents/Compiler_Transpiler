package com.ericwadkins.compiler.components.assignments;

import com.ericwadkins.compiler.components.elements.Block;
import com.ericwadkins.compiler.components.elements.Element;
import com.ericwadkins.compiler.components.expressions.Expression;
import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class Assignment extends Element {

    public final Variable variable;
    public final Expression expression;

    public Assignment(Variable variable, Expression expression, Token token) {
        super(token);
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<>(expression.getVariables());
        variables.add(variable);
        return variables;
    }
}
