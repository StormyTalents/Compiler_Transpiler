package com.ericwadkins.compiler.components.assignments;

import com.ericwadkins.compiler.components.elements.Block;
import com.ericwadkins.compiler.components.expressions.Expression;
import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class DifferenceAssignment extends Assignment {

    public DifferenceAssignment(Variable variable, Expression expression, Token token) {
        super(variable, expression, token);
    }

    @Override
    public java.lang.String toString() {
        return variable + " -= " + expression;
    }

}
