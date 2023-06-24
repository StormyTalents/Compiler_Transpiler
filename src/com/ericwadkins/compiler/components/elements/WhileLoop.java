package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.expressions.Expression;
import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class WhileLoop extends BlockElement {

    public final Expression condition;

    public WhileLoop(Expression condition, Block block, Token token) {
        super(block, token);
        this.condition = condition;
    }

    @Override
    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<Variable>();
        variables.addAll(condition.getVariables());
        variables.addAll(block.getVariables());
        return variables;
    }

    @Override
    public String toString() {
        return "while (" + (condition != null
                ? (condition.toString().startsWith("(") && condition.toString().endsWith(")")
                ? condition.toString().substring(1, condition.toString().length() - 1) : condition) : "") + ") " + block;
    }
}
