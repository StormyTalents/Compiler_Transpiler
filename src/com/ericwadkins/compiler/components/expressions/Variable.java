package com.ericwadkins.compiler.components.expressions;

import com.ericwadkins.compiler.components.elements.Block;
import org.antlr.v4.runtime.Token;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class Variable extends Expression {

    public final java.lang.String variable;

    public Variable(java.lang.String variable, Token token) {
        super(token);
        this.variable = variable;
    }

    @Override
    public List<Variable> getVariables() {
        return Arrays.asList(this);
    }

    @Override
    public java.lang.String toString() {
        return variable;
    }
}
