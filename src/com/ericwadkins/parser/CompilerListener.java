// Generated from Compiler.g4 by ANTLR 4.5.3

package com.ericwadkins.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilerParser}.
 */
public interface CompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompilerParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(CompilerParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(CompilerParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(CompilerParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(CompilerParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#basic_element}.
	 * @param ctx the parse tree
	 */
	void enterBasic_element(CompilerParser.Basic_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#basic_element}.
	 * @param ctx the parse tree
	 */
	void exitBasic_element(CompilerParser.Basic_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#block_element}.
	 * @param ctx the parse tree
	 */
	void enterBlock_element(CompilerParser.Block_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#block_element}.
	 * @param ctx the parse tree
	 */
	void exitBlock_element(CompilerParser.Block_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#statement_set}.
	 * @param ctx the parse tree
	 */
	void enterStatement_set(CompilerParser.Statement_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#statement_set}.
	 * @param ctx the parse tree
	 */
	void exitStatement_set(CompilerParser.Statement_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CompilerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CompilerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#declaration_set}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_set(CompilerParser.Declaration_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#declaration_set}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_set(CompilerParser.Declaration_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CompilerParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CompilerParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#flow_statement}.
	 * @param ctx the parse tree
	 */
	void enterFlow_statement(CompilerParser.Flow_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#flow_statement}.
	 * @param ctx the parse tree
	 */
	void exitFlow_statement(CompilerParser.Flow_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CompilerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CompilerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CompilerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CompilerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(CompilerParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(CompilerParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(CompilerParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(CompilerParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(CompilerParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(CompilerParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#direct_assign}.
	 * @param ctx the parse tree
	 */
	void enterDirect_assign(CompilerParser.Direct_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#direct_assign}.
	 * @param ctx the parse tree
	 */
	void exitDirect_assign(CompilerParser.Direct_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#sum_assign}.
	 * @param ctx the parse tree
	 */
	void enterSum_assign(CompilerParser.Sum_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#sum_assign}.
	 * @param ctx the parse tree
	 */
	void exitSum_assign(CompilerParser.Sum_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#difference_assign}.
	 * @param ctx the parse tree
	 */
	void enterDifference_assign(CompilerParser.Difference_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#difference_assign}.
	 * @param ctx the parse tree
	 */
	void exitDifference_assign(CompilerParser.Difference_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#product_assign}.
	 * @param ctx the parse tree
	 */
	void enterProduct_assign(CompilerParser.Product_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#product_assign}.
	 * @param ctx the parse tree
	 */
	void exitProduct_assign(CompilerParser.Product_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#quotient_assign}.
	 * @param ctx the parse tree
	 */
	void enterQuotient_assign(CompilerParser.Quotient_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#quotient_assign}.
	 * @param ctx the parse tree
	 */
	void exitQuotient_assign(CompilerParser.Quotient_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#modulus_assign}.
	 * @param ctx the parse tree
	 */
	void enterModulus_assign(CompilerParser.Modulus_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#modulus_assign}.
	 * @param ctx the parse tree
	 */
	void exitModulus_assign(CompilerParser.Modulus_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#power_assign}.
	 * @param ctx the parse tree
	 */
	void enterPower_assign(CompilerParser.Power_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#power_assign}.
	 * @param ctx the parse tree
	 */
	void exitPower_assign(CompilerParser.Power_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_left_assign}.
	 * @param ctx the parse tree
	 */
	void enterBit_left_assign(CompilerParser.Bit_left_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_left_assign}.
	 * @param ctx the parse tree
	 */
	void exitBit_left_assign(CompilerParser.Bit_left_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_right_assign}.
	 * @param ctx the parse tree
	 */
	void enterBit_right_assign(CompilerParser.Bit_right_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_right_assign}.
	 * @param ctx the parse tree
	 */
	void exitBit_right_assign(CompilerParser.Bit_right_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_and_assign}.
	 * @param ctx the parse tree
	 */
	void enterBit_and_assign(CompilerParser.Bit_and_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_and_assign}.
	 * @param ctx the parse tree
	 */
	void exitBit_and_assign(CompilerParser.Bit_and_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_xor_assign}.
	 * @param ctx the parse tree
	 */
	void enterBit_xor_assign(CompilerParser.Bit_xor_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_xor_assign}.
	 * @param ctx the parse tree
	 */
	void exitBit_xor_assign(CompilerParser.Bit_xor_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_or_assign}.
	 * @param ctx the parse tree
	 */
	void enterBit_or_assign(CompilerParser.Bit_or_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_or_assign}.
	 * @param ctx the parse tree
	 */
	void exitBit_or_assign(CompilerParser.Bit_or_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(CompilerParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(CompilerParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_statement(CompilerParser.Else_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_statement(CompilerParser.Else_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(CompilerParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(CompilerParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(CompilerParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(CompilerParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(CompilerParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(CompilerParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_loop(CompilerParser.Do_while_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_loop(CompilerParser.Do_while_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(CompilerParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(CompilerParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CompilerParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CompilerParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(CompilerParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(CompilerParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CompilerParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CompilerParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CompilerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CompilerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#postfix_call_subscript}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_call_subscript(CompilerParser.Postfix_call_subscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#postfix_call_subscript}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_call_subscript(CompilerParser.Postfix_call_subscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#prefix_unary}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_unary(CompilerParser.Prefix_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#prefix_unary}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_unary(CompilerParser.Prefix_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(CompilerParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(CompilerParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#pow_root}.
	 * @param ctx the parse tree
	 */
	void enterPow_root(CompilerParser.Pow_rootContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#pow_root}.
	 * @param ctx the parse tree
	 */
	void exitPow_root(CompilerParser.Pow_rootContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#mult_div_mod}.
	 * @param ctx the parse tree
	 */
	void enterMult_div_mod(CompilerParser.Mult_div_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#mult_div_mod}.
	 * @param ctx the parse tree
	 */
	void exitMult_div_mod(CompilerParser.Mult_div_modContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub(CompilerParser.Add_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub(CompilerParser.Add_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bitleft_right}.
	 * @param ctx the parse tree
	 */
	void enterBitleft_right(CompilerParser.Bitleft_rightContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bitleft_right}.
	 * @param ctx the parse tree
	 */
	void exitBitleft_right(CompilerParser.Bitleft_rightContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#less_greater}.
	 * @param ctx the parse tree
	 */
	void enterLess_greater(CompilerParser.Less_greaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#less_greater}.
	 * @param ctx the parse tree
	 */
	void exitLess_greater(CompilerParser.Less_greaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#equal_notequal}.
	 * @param ctx the parse tree
	 */
	void enterEqual_notequal(CompilerParser.Equal_notequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#equal_notequal}.
	 * @param ctx the parse tree
	 */
	void exitEqual_notequal(CompilerParser.Equal_notequalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bitand}.
	 * @param ctx the parse tree
	 */
	void enterBitand(CompilerParser.BitandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bitand}.
	 * @param ctx the parse tree
	 */
	void exitBitand(CompilerParser.BitandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bitxor}.
	 * @param ctx the parse tree
	 */
	void enterBitxor(CompilerParser.BitxorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bitxor}.
	 * @param ctx the parse tree
	 */
	void exitBitxor(CompilerParser.BitxorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bitor}.
	 * @param ctx the parse tree
	 */
	void enterBitor(CompilerParser.BitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bitor}.
	 * @param ctx the parse tree
	 */
	void exitBitor(CompilerParser.BitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(CompilerParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(CompilerParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(CompilerParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(CompilerParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CompilerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CompilerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CompilerParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CompilerParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CompilerParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CompilerParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(CompilerParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(CompilerParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(CompilerParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(CompilerParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(CompilerParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(CompilerParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(CompilerParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(CompilerParser.ArrayContext ctx);
}