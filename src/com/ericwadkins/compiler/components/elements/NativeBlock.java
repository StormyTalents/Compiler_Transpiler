package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.expressions.Expression;
import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class NativeBlock extends Element {

    public final java.lang.String content;

    public NativeBlock(java.lang.String content, Token token) {
        super(token);
        this.content = content;
    }

    @Override
    public List<Variable> getVariables() {
        return new ArrayList<Variable>();
    }

    @Override
    public String toString() {
        return "native <{" + content + "}>";
    }

}
