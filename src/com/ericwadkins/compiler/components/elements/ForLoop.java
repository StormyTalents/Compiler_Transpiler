package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.expressions.Expression;
import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class ForLoop extends BlockElement {

    public final Element initialization;
    public final Expression condition;
    public final Element update;

    public ForLoop(Element initialization, Expression condition, Element update, Block block, Token token) {
        super(block, token);
        this.initialization = initialization;
        this.condition = condition;
        this.update = update;
    }

    @Override
    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<Variable>();
        variables.addAll(initialization.getVariables());
        variables.addAll(condition.getVariables());
        variables.addAll(update.getVariables());
        variables.addAll(block.getVariables());
        return variables;
    }

    @Override
    public String toString() {
        return "for ("
                + (initialization != null ? initialization : ";")
                + (condition != null ? " " + (condition.toString().startsWith("(") && condition.toString().endsWith(")")
                ? condition.toString().substring(1, condition.toString().length() - 1) : condition) + ";" : ";")
                + (update != null ? " " + update.toString().replaceAll(";$", "") : "")
                + ") " + block;
    }
}
