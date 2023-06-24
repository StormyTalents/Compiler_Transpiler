package com.ericwadkins.compiler.components.expressions;

import com.ericwadkins.compiler.components.elements.Block;
import com.ericwadkins.compiler.components.elements.Element;
import org.antlr.v4.runtime.Token;

/**
 * Created by ericwadkins on 8/11/16.
 */
public abstract class Expression extends Element {

    public Type type = null;

    public Expression(Token token) {
        super(token);
    }

    public Type getType() {
        return new Type(type.getType(), type.isArray());
    }

    public void setType(Type type) {
        this.type = new Type(type.getType(), type.isArray());
    }

}
