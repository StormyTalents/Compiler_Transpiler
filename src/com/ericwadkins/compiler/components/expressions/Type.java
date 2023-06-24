package com.ericwadkins.compiler.components.expressions;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class Type {

    public final java.lang.String type;
    public final boolean array;

    public Type(java.lang.String type, boolean array) {
        this.type = type;
        this.array = array;
    }

    public java.lang.String getType() {
        return type;
    }

    public boolean isArray() {
        return array;
    }

    @Override
    public java.lang.String toString() {
        return type + (array ? "[]" : "");
    }

}
