package com.ericwadkins.compiler.components.expressions;

import com.ericwadkins.compiler.components.elements.Block;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class String extends Primitive {

    public final java.lang.String string;

    public String(java.lang.String string, Token token) {
        super(token);
        this.string = string;
    }

    @Override
    public List<Variable> getVariables() {
        return new ArrayList<Variable>();
    }

    @Override
    public java.lang.String toString() {
        return string;
    }

}
