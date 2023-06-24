package com.ericwadkins.compiler.components.expressions;

import com.ericwadkins.compiler.components.elements.Block;
import org.antlr.v4.runtime.Token;

/**
 * Created by ericwadkins on 8/11/16.
 */
public abstract class Primitive extends Expression {

    public Primitive(Token token) {
        super(token);
    }

}
