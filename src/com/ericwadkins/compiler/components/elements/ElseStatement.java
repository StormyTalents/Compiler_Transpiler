package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class ElseStatement extends BlockElement {

    public ElseStatement(Block block, Token token) {
        super(block, token);
    }

    @Override
    public List<Variable> getVariables() {
        return new ArrayList<Variable>(block.getVariables());
    }

    @Override
    public java.lang.String toString() {
        return "else " + block;
    }
}
