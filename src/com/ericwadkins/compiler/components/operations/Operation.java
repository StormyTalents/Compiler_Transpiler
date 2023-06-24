package com.ericwadkins.compiler.components.operations;

import com.ericwadkins.compiler.components.elements.Block;
import com.ericwadkins.compiler.components.expressions.Expression;
import org.antlr.v4.runtime.Token;

/**
 * Created by ericwadkins on 8/11/16.
 */
public abstract class Operation extends Expression {

    public Operation(Token token) {
        super(token);
    }

}
