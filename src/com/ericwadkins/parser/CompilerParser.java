// Generated from Compiler.g4 by ANTLR 4.5.3

package com.ericwadkins.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		NATIVE=46, RETURN=47, BREAK=48, CONTINUE=49, IF=50, ELSE=51, FOR=52, WHILE=53, 
		DO=54, TYPE=55, NUMBER=56, STRING=57, CHARACTER=58, BOOLEAN=59, VARIABLE=60, 
		WHITESPACE=61;
	public static final int
		RULE_root = 0, RULE_element = 1, RULE_basic_element = 2, RULE_block_element = 3, 
		RULE_statement_set = 4, RULE_statement = 5, RULE_declaration_set = 6, 
		RULE_declaration = 7, RULE_flow_statement = 8, RULE_block = 9, RULE_assignment = 10, 
		RULE_return_statement = 11, RULE_break_statement = 12, RULE_continue_statement = 13, 
		RULE_direct_assign = 14, RULE_sum_assign = 15, RULE_difference_assign = 16, 
		RULE_product_assign = 17, RULE_quotient_assign = 18, RULE_modulus_assign = 19, 
		RULE_power_assign = 20, RULE_bit_left_assign = 21, RULE_bit_right_assign = 22, 
		RULE_bit_and_assign = 23, RULE_bit_xor_assign = 24, RULE_bit_or_assign = 25, 
		RULE_if_statement = 26, RULE_else_if_statement = 27, RULE_else_statement = 28, 
		RULE_for_loop = 29, RULE_while_loop = 30, RULE_do_while_loop = 31, RULE_initialization = 32, 
		RULE_condition = 33, RULE_update = 34, RULE_function = 35, RULE_expression = 36, 
		RULE_postfix_call_subscript = 37, RULE_prefix_unary = 38, RULE_cast = 39, 
		RULE_pow_root = 40, RULE_mult_div_mod = 41, RULE_add_sub = 42, RULE_bitleft_right = 43, 
		RULE_less_greater = 44, RULE_equal_notequal = 45, RULE_bitand = 46, RULE_bitxor = 47, 
		RULE_bitor = 48, RULE_and = 49, RULE_or = 50, RULE_type = 51, RULE_variable = 52, 
		RULE_number = 53, RULE_string = 54, RULE_character = 55, RULE_bool = 56, 
		RULE_array = 57;
	public static final String[] ruleNames = {
		"root", "element", "basic_element", "block_element", "statement_set", 
		"statement", "declaration_set", "declaration", "flow_statement", "block", 
		"assignment", "return_statement", "break_statement", "continue_statement", 
		"direct_assign", "sum_assign", "difference_assign", "product_assign", 
		"quotient_assign", "modulus_assign", "power_assign", "bit_left_assign", 
		"bit_right_assign", "bit_and_assign", "bit_xor_assign", "bit_or_assign", 
		"if_statement", "else_if_statement", "else_statement", "for_loop", "while_loop", 
		"do_while_loop", "initialization", "condition", "update", "function", 
		"expression", "postfix_call_subscript", "prefix_unary", "cast", "pow_root", 
		"mult_div_mod", "add_sub", "bitleft_right", "less_greater", "equal_notequal", 
		"bitand", "bitxor", "bitor", "and", "or", "type", "variable", "number", 
		"string", "character", "bool", "array"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'{'", "'}'", "'='", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'**='", "'<<='", "'&='", "'^='", "'|='", "'('", "')'", "'++'", 
		"'--'", "'['", "']'", "'+'", "'-'", "'!'", "'~'", "'**'", "'//'", "'*'", 
		"'/'", "'%'", "'<<'", "'>>'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
		"'==='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'[]'", "'native'", "'return'", 
		"'break'", "'continue'", "'if'", "'else'", "'for'", "'while'", "'do'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "NATIVE", 
		"RETURN", "BREAK", "CONTINUE", "IF", "ELSE", "FOR", "WHILE", "DO", "TYPE", 
		"NUMBER", "STRING", "CHARACTER", "BOOLEAN", "VARIABLE", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public void reportErrorsAsExceptions() {
	        // To prevent default report to standard error, add this line:
	        removeErrorListeners();
	        
	        addErrorListener(new BaseErrorListener() {
	            public void syntaxError(Recognizer<?, ?> recognizer,
	                                    Object offendingSymbol,
	                                    int line, int charPositionInLine,
	                                    String msg, RecognitionException e) {

	                //throw new ParseCancellationException(msg, e);
	                System.err.println("Invalid character: '" + ((CommonToken) offendingSymbol).getText() + "' on line: " + line + ", index: " + charPositionInLine);
	                System.err.println(msg);
	                System.exit(1);
	            }
	        });
	    }

	public CompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CompilerParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TYPE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(116);
				element();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public Basic_elementContext basic_element() {
			return getRuleContext(Basic_elementContext.class,0);
		}
		public Block_elementContext block_element() {
			return getRuleContext(Block_elementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				basic_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				block_element();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_elementContext extends ParserRuleContext {
		public Statement_setContext statement_set() {
			return getRuleContext(Statement_setContext.class,0);
		}
		public Declaration_setContext declaration_set() {
			return getRuleContext(Declaration_setContext.class,0);
		}
		public Flow_statementContext flow_statement() {
			return getRuleContext(Flow_statementContext.class,0);
		}
		public Basic_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBasic_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBasic_element(this);
		}
	}

	public final Basic_elementContext basic_element() throws RecognitionException {
		Basic_elementContext _localctx = new Basic_elementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_basic_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			switch (_input.LA(1)) {
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case NUMBER:
			case STRING:
			case CHARACTER:
			case BOOLEAN:
			case VARIABLE:
				{
				setState(128);
				statement_set();
				}
				break;
			case TYPE:
				{
				setState(129);
				declaration_set();
				}
				break;
			case RETURN:
			case BREAK:
			case CONTINUE:
				{
				setState(130);
				flow_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(133);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_elementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Else_if_statementContext else_if_statement() {
			return getRuleContext(Else_if_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBlock_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBlock_element(this);
		}
	}

	public final Block_elementContext block_element() throws RecognitionException {
		Block_elementContext _localctx = new Block_elementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block_element);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				if_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				else_if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				do_while_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_setContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterStatement_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitStatement_set(this);
		}
	}

	public final Statement_setContext statement_set() throws RecognitionException {
		Statement_setContext _localctx = new Statement_setContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			statement();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(146);
				match(T__1);
				setState(147);
				statement();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_setContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public Declaration_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDeclaration_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDeclaration_set(this);
		}
	}

	public final Declaration_setContext declaration_set() throws RecognitionException {
		Declaration_setContext _localctx = new Declaration_setContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			type();
			setState(158);
			declaration();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(159);
				match(T__1);
				setState(160);
				declaration();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Direct_assignContext direct_assign() {
			return getRuleContext(Direct_assignContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				direct_assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flow_statementContext extends ParserRuleContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Flow_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFlow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFlow_statement(this);
		}
	}

	public final Flow_statementContext flow_statement() throws RecognitionException {
		Flow_statementContext _localctx = new Flow_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_flow_statement);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				return_statement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				break_statement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				continue_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__2);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TYPE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(176);
				element();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Direct_assignContext direct_assign() {
			return getRuleContext(Direct_assignContext.class,0);
		}
		public Sum_assignContext sum_assign() {
			return getRuleContext(Sum_assignContext.class,0);
		}
		public Difference_assignContext difference_assign() {
			return getRuleContext(Difference_assignContext.class,0);
		}
		public Product_assignContext product_assign() {
			return getRuleContext(Product_assignContext.class,0);
		}
		public Quotient_assignContext quotient_assign() {
			return getRuleContext(Quotient_assignContext.class,0);
		}
		public Modulus_assignContext modulus_assign() {
			return getRuleContext(Modulus_assignContext.class,0);
		}
		public Power_assignContext power_assign() {
			return getRuleContext(Power_assignContext.class,0);
		}
		public Bit_left_assignContext bit_left_assign() {
			return getRuleContext(Bit_left_assignContext.class,0);
		}
		public Bit_right_assignContext bit_right_assign() {
			return getRuleContext(Bit_right_assignContext.class,0);
		}
		public Bit_and_assignContext bit_and_assign() {
			return getRuleContext(Bit_and_assignContext.class,0);
		}
		public Bit_xor_assignContext bit_xor_assign() {
			return getRuleContext(Bit_xor_assignContext.class,0);
		}
		public Bit_or_assignContext bit_or_assign() {
			return getRuleContext(Bit_or_assignContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				direct_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				sum_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				difference_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				product_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				quotient_assign();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				modulus_assign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				power_assign();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(191);
				bit_left_assign();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(192);
				bit_right_assign();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(193);
				bit_and_assign();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(194);
				bit_xor_assign();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(195);
				bit_or_assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CompilerParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(RETURN);
			setState(199);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CompilerParser.BREAK, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBreak_statement(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(CompilerParser.CONTINUE, 0); }
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitContinue_statement(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(CONTINUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Direct_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Direct_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDirect_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDirect_assign(this);
		}
	}

	public final Direct_assignContext direct_assign() throws RecognitionException {
		Direct_assignContext _localctx = new Direct_assignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_direct_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			variable();
			setState(206);
			match(T__4);
			setState(207);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sum_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Sum_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterSum_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitSum_assign(this);
		}
	}

	public final Sum_assignContext sum_assign() throws RecognitionException {
		Sum_assignContext _localctx = new Sum_assignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sum_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			variable();
			setState(210);
			match(T__5);
			setState(211);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Difference_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Difference_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_difference_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDifference_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDifference_assign(this);
		}
	}

	public final Difference_assignContext difference_assign() throws RecognitionException {
		Difference_assignContext _localctx = new Difference_assignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_difference_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			variable();
			setState(214);
			match(T__6);
			setState(215);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Product_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Product_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterProduct_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitProduct_assign(this);
		}
	}

	public final Product_assignContext product_assign() throws RecognitionException {
		Product_assignContext _localctx = new Product_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_product_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			variable();
			setState(218);
			match(T__7);
			setState(219);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quotient_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Quotient_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotient_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterQuotient_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitQuotient_assign(this);
		}
	}

	public final Quotient_assignContext quotient_assign() throws RecognitionException {
		Quotient_assignContext _localctx = new Quotient_assignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_quotient_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			variable();
			setState(222);
			match(T__8);
			setState(223);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Modulus_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Modulus_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulus_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterModulus_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitModulus_assign(this);
		}
	}

	public final Modulus_assignContext modulus_assign() throws RecognitionException {
		Modulus_assignContext _localctx = new Modulus_assignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_modulus_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			variable();
			setState(226);
			match(T__9);
			setState(227);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Power_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Power_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterPower_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitPower_assign(this);
		}
	}

	public final Power_assignContext power_assign() throws RecognitionException {
		Power_assignContext _localctx = new Power_assignContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_power_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			variable();
			setState(230);
			match(T__10);
			setState(231);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_left_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bit_left_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_left_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_left_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_left_assign(this);
		}
	}

	public final Bit_left_assignContext bit_left_assign() throws RecognitionException {
		Bit_left_assignContext _localctx = new Bit_left_assignContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bit_left_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			variable();
			setState(234);
			match(T__11);
			setState(235);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_right_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bit_right_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_right_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_right_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_right_assign(this);
		}
	}

	public final Bit_right_assignContext bit_right_assign() throws RecognitionException {
		Bit_right_assignContext _localctx = new Bit_right_assignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bit_right_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			variable();
			setState(238);
			match(T__11);
			setState(239);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_and_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bit_and_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_and_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_and_assign(this);
		}
	}

	public final Bit_and_assignContext bit_and_assign() throws RecognitionException {
		Bit_and_assignContext _localctx = new Bit_and_assignContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bit_and_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			variable();
			setState(242);
			match(T__12);
			setState(243);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_xor_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bit_xor_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_xor_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_xor_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_xor_assign(this);
		}
	}

	public final Bit_xor_assignContext bit_xor_assign() throws RecognitionException {
		Bit_xor_assignContext _localctx = new Bit_xor_assignContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bit_xor_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			variable();
			setState(246);
			match(T__13);
			setState(247);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_or_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bit_or_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_or_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_or_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_or_assign(this);
		}
	}

	public final Bit_or_assignContext bit_or_assign() throws RecognitionException {
		Bit_or_assignContext _localctx = new Bit_or_assignContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bit_or_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			variable();
			setState(250);
			match(T__14);
			setState(251);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CompilerParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(IF);
			setState(254);
			match(T__15);
			setState(255);
			expression(0);
			setState(256);
			match(T__16);
			setState(257);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_if_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CompilerParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(CompilerParser.IF, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterElse_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitElse_if_statement(this);
		}
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_else_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ELSE);
			setState(260);
			match(IF);
			setState(261);
			match(T__15);
			setState(263);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(262);
				expression(0);
				}
			}

			setState(265);
			match(T__16);
			setState(266);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CompilerParser.ELSE, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(ELSE);
			setState(269);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CompilerParser.FOR, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(FOR);
			setState(272);
			match(T__15);
			setState(274);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << TYPE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(273);
				initialization();
				}
			}

			setState(276);
			match(T__0);
			setState(278);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(277);
				condition();
				}
			}

			setState(280);
			match(T__0);
			setState(282);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << TYPE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(281);
				update();
				}
			}

			setState(284);
			match(T__16);
			setState(285);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CompilerParser.WHILE, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(WHILE);
			setState(288);
			match(T__15);
			setState(290);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(289);
				condition();
				}
			}

			setState(292);
			match(T__16);
			setState(293);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CompilerParser.DO, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CompilerParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDo_while_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDo_while_loop(this);
		}
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_do_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(DO);
			setState(296);
			element();
			setState(297);
			match(WHILE);
			setState(298);
			match(T__15);
			setState(300);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(299);
				condition();
				}
			}

			setState(302);
			match(T__16);
			setState(303);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializationContext extends ParserRuleContext {
		public Statement_setContext statement_set() {
			return getRuleContext(Statement_setContext.class,0);
		}
		public Declaration_setContext declaration_set() {
			return getRuleContext(Declaration_setContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitInitialization(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_initialization);
		try {
			setState(307);
			switch (_input.LA(1)) {
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case NUMBER:
			case STRING:
			case CHARACTER:
			case BOOLEAN:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				statement_set();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				declaration_set();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public Statement_setContext statement_set() {
			return getRuleContext(Statement_setContext.class,0);
		}
		public Declaration_setContext declaration_set() {
			return getRuleContext(Declaration_setContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitUpdate(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_update);
		try {
			setState(313);
			switch (_input.LA(1)) {
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case NUMBER:
			case STRING:
			case CHARACTER:
			case BOOLEAN:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				statement_set();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				declaration_set();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			type();
			setState(316);
			variable();
			{
			setState(317);
			match(T__15);
			setState(330);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(318);
						type();
						setState(319);
						variable();
						setState(320);
						match(T__1);
						}
						} 
					}
					setState(326);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(327);
				type();
				setState(328);
				variable();
				}
			}

			setState(332);
			match(T__16);
			}
			setState(334);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Prefix_unaryContext prefix_unary() {
			return getRuleContext(Prefix_unaryContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public Pow_rootContext pow_root() {
			return getRuleContext(Pow_rootContext.class,0);
		}
		public Mult_div_modContext mult_div_mod() {
			return getRuleContext(Mult_div_modContext.class,0);
		}
		public Add_subContext add_sub() {
			return getRuleContext(Add_subContext.class,0);
		}
		public Bitleft_rightContext bitleft_right() {
			return getRuleContext(Bitleft_rightContext.class,0);
		}
		public Less_greaterContext less_greater() {
			return getRuleContext(Less_greaterContext.class,0);
		}
		public Equal_notequalContext equal_notequal() {
			return getRuleContext(Equal_notequalContext.class,0);
		}
		public BitandContext bitand() {
			return getRuleContext(BitandContext.class,0);
		}
		public BitxorContext bitxor() {
			return getRuleContext(BitxorContext.class,0);
		}
		public BitorContext bitor() {
			return getRuleContext(BitorContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public Postfix_call_subscriptContext postfix_call_subscript() {
			return getRuleContext(Postfix_call_subscriptContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(337);
				match(T__15);
				setState(338);
				expression(0);
				setState(339);
				match(T__16);
				}
				break;
			case 2:
				{
				setState(341);
				number();
				}
				break;
			case 3:
				{
				setState(342);
				string();
				}
				break;
			case 4:
				{
				setState(343);
				character();
				}
				break;
			case 5:
				{
				setState(344);
				bool();
				}
				break;
			case 6:
				{
				setState(345);
				array();
				}
				break;
			case 7:
				{
				setState(346);
				variable();
				}
				break;
			case 8:
				{
				setState(347);
				prefix_unary();
				setState(348);
				expression(13);
				}
				break;
			case 9:
				{
				setState(350);
				cast();
				setState(351);
				expression(12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(401);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(355);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(356);
						pow_root();
						setState(357);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(359);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(360);
						mult_div_mod();
						setState(361);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(363);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(364);
						add_sub();
						setState(365);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(368);
						bitleft_right();
						setState(369);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(371);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(372);
						less_greater();
						setState(373);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(375);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(376);
						equal_notequal();
						setState(377);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(379);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(380);
						bitand();
						setState(381);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(383);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(384);
						bitxor();
						setState(385);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(387);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(388);
						bitor();
						setState(389);
						expression(4);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(391);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(392);
						and();
						setState(393);
						expression(3);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(395);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(396);
						or();
						setState(397);
						expression(2);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(399);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(400);
						postfix_call_subscript();
						}
						break;
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Postfix_call_subscriptContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Postfix_call_subscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_call_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterPostfix_call_subscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitPostfix_call_subscript(this);
		}
	}

	public final Postfix_call_subscriptContext postfix_call_subscript() throws RecognitionException {
		Postfix_call_subscriptContext _localctx = new Postfix_call_subscriptContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_postfix_call_subscript);
		int _la;
		try {
			int _alt;
			setState(425);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(T__18);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(T__15);
				setState(418);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
					{
					setState(414);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(409);
							expression(0);
							setState(410);
							match(T__1);
							}
							} 
						}
						setState(416);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					}
					setState(417);
					expression(0);
					}
				}

				setState(420);
				match(T__16);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				match(T__19);
				setState(422);
				expression(0);
				setState(423);
				match(T__20);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_unaryContext extends ParserRuleContext {
		public Prefix_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterPrefix_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitPrefix_unary(this);
		}
	}

	public final Prefix_unaryContext prefix_unary() throws RecognitionException {
		Prefix_unaryContext _localctx = new Prefix_unaryContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_prefix_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitCast(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__15);
			setState(430);
			type();
			setState(431);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pow_rootContext extends ParserRuleContext {
		public Pow_rootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterPow_root(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitPow_root(this);
		}
	}

	public final Pow_rootContext pow_root() throws RecognitionException {
		Pow_rootContext _localctx = new Pow_rootContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_pow_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mult_div_modContext extends ParserRuleContext {
		public Mult_div_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_div_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterMult_div_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitMult_div_mod(this);
		}
	}

	public final Mult_div_modContext mult_div_mod() throws RecognitionException {
		Mult_div_modContext _localctx = new Mult_div_modContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mult_div_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_subContext extends ParserRuleContext {
		public Add_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterAdd_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitAdd_sub(this);
		}
	}

	public final Add_subContext add_sub() throws RecognitionException {
		Add_subContext _localctx = new Add_subContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_add_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitleft_rightContext extends ParserRuleContext {
		public Bitleft_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitleft_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBitleft_right(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBitleft_right(this);
		}
	}

	public final Bitleft_rightContext bitleft_right() throws RecognitionException {
		Bitleft_rightContext _localctx = new Bitleft_rightContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_bitleft_right);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__31) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Less_greaterContext extends ParserRuleContext {
		public Less_greaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterLess_greater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitLess_greater(this);
		}
	}

	public final Less_greaterContext less_greater() throws RecognitionException {
		Less_greaterContext _localctx = new Less_greaterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_less_greater);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equal_notequalContext extends ParserRuleContext {
		public Equal_notequalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_notequal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterEqual_notequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitEqual_notequal(this);
		}
	}

	public final Equal_notequalContext equal_notequal() throws RecognitionException {
		Equal_notequalContext _localctx = new Equal_notequalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_equal_notequal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitandContext extends ParserRuleContext {
		public BitandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBitand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBitand(this);
		}
	}

	public final BitandContext bitand() throws RecognitionException {
		BitandContext _localctx = new BitandContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_bitand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitxorContext extends ParserRuleContext {
		public BitxorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitxor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBitxor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBitxor(this);
		}
	}

	public final BitxorContext bitxor() throws RecognitionException {
		BitxorContext _localctx = new BitxorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_bitxor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitorContext extends ParserRuleContext {
		public BitorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBitor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBitor(this);
		}
	}

	public final BitorContext bitor() throws RecognitionException {
		BitorContext _localctx = new BitorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_bitor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__41);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CompilerParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(TYPE);
			setState(457);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(456);
				match(T__44);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(CompilerParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CompilerParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CompilerParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(CompilerParser.CHARACTER, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitCharacter(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(CHARACTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(CompilerParser.BOOLEAN, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(T__19);
			setState(479);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(470);
						expression(0);
						setState(471);
						match(T__1);
						}
						} 
					}
					setState(477);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(478);
				expression(0);
				}
			}

			setState(481);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 36:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		case 11:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u01e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\7\2x\n\2"+
		"\f\2\16\2{\13\2\3\2\3\2\3\3\3\3\5\3\u0081\n\3\3\4\3\4\3\4\5\4\u0086\n"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0092\n\5\3\6\3\6\3\6\7"+
		"\6\u0097\n\6\f\6\16\6\u009a\13\6\3\7\3\7\5\7\u009e\n\7\3\b\3\b\3\b\3\b"+
		"\7\b\u00a4\n\b\f\b\16\b\u00a7\13\b\3\t\3\t\5\t\u00ab\n\t\3\n\3\n\3\n\5"+
		"\n\u00b0\n\n\3\13\3\13\7\13\u00b4\n\13\f\13\16\13\u00b7\13\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c7\n\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u010a\n\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\5\37\u0115\n\37\3\37\3\37\5\37\u0119\n\37\3"+
		"\37\3\37\5\37\u011d\n\37\3\37\3\37\3\37\3 \3 \3 \5 \u0125\n \3 \3 \3 "+
		"\3!\3!\3!\3!\3!\5!\u012f\n!\3!\3!\3!\3\"\3\"\5\"\u0136\n\"\3#\3#\3$\3"+
		"$\5$\u013c\n$\3%\3%\3%\3%\3%\3%\3%\7%\u0145\n%\f%\16%\u0148\13%\3%\3%"+
		"\3%\5%\u014d\n%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\5&\u0164\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\7&\u0194\n&\f&\16&\u0197\13&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\7\'\u019f\n\'\f\'\16\'\u01a2\13\'\3\'\5\'\u01a5\n\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u01ac\n\'\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\5\65"+
		"\u01cc\n\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3;\7;\u01dc"+
		"\n;\f;\16;\u01df\13;\3;\5;\u01e2\n;\3;\3;\3;\2\3J<\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rt\2\t\4\2\24\25\30\33\3\2\34\35\3\2\36 \3\2\30\31\3\2!\"\3\2#&\3\2\'"+
		")\u01ee\2y\3\2\2\2\4\u0080\3\2\2\2\6\u0085\3\2\2\2\b\u0091\3\2\2\2\n\u0093"+
		"\3\2\2\2\f\u009d\3\2\2\2\16\u009f\3\2\2\2\20\u00aa\3\2\2\2\22\u00af\3"+
		"\2\2\2\24\u00b1\3\2\2\2\26\u00c6\3\2\2\2\30\u00c8\3\2\2\2\32\u00cb\3\2"+
		"\2\2\34\u00cd\3\2\2\2\36\u00cf\3\2\2\2 \u00d3\3\2\2\2\"\u00d7\3\2\2\2"+
		"$\u00db\3\2\2\2&\u00df\3\2\2\2(\u00e3\3\2\2\2*\u00e7\3\2\2\2,\u00eb\3"+
		"\2\2\2.\u00ef\3\2\2\2\60\u00f3\3\2\2\2\62\u00f7\3\2\2\2\64\u00fb\3\2\2"+
		"\2\66\u00ff\3\2\2\28\u0105\3\2\2\2:\u010e\3\2\2\2<\u0111\3\2\2\2>\u0121"+
		"\3\2\2\2@\u0129\3\2\2\2B\u0135\3\2\2\2D\u0137\3\2\2\2F\u013b\3\2\2\2H"+
		"\u013d\3\2\2\2J\u0163\3\2\2\2L\u01ab\3\2\2\2N\u01ad\3\2\2\2P\u01af\3\2"+
		"\2\2R\u01b3\3\2\2\2T\u01b5\3\2\2\2V\u01b7\3\2\2\2X\u01b9\3\2\2\2Z\u01bb"+
		"\3\2\2\2\\\u01bd\3\2\2\2^\u01bf\3\2\2\2`\u01c1\3\2\2\2b\u01c3\3\2\2\2"+
		"d\u01c5\3\2\2\2f\u01c7\3\2\2\2h\u01c9\3\2\2\2j\u01cd\3\2\2\2l\u01cf\3"+
		"\2\2\2n\u01d1\3\2\2\2p\u01d3\3\2\2\2r\u01d5\3\2\2\2t\u01d7\3\2\2\2vx\5"+
		"\4\3\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7"+
		"\2\2\3}\3\3\2\2\2~\u0081\5\6\4\2\177\u0081\5\b\5\2\u0080~\3\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\5\3\2\2\2\u0082\u0086\5\n\6\2\u0083\u0086\5\16\b\2"+
		"\u0084\u0086\5\22\n\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\3\2\2\u0088\7\3\2\2\2\u0089"+
		"\u0092\5\66\34\2\u008a\u0092\58\35\2\u008b\u0092\5:\36\2\u008c\u0092\5"+
		"<\37\2\u008d\u0092\5> \2\u008e\u0092\5@!\2\u008f\u0092\5H%\2\u0090\u0092"+
		"\5\24\13\2\u0091\u0089\3\2\2\2\u0091\u008a\3\2\2\2\u0091\u008b\3\2\2\2"+
		"\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0090\3\2\2\2\u0092\t\3\2\2\2\u0093\u0098\5\f\7\2\u0094"+
		"\u0095\7\4\2\2\u0095\u0097\5\f\7\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\13\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009e\5\26\f\2\u009c\u009e\5J&\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\r\3\2\2\2\u009f\u00a0\5h\65\2\u00a0\u00a5\5\20\t"+
		"\2\u00a1\u00a2\7\4\2\2\u00a2\u00a4\5\20\t\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\17\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\5j\66\2\u00a9\u00ab\5\36\20\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\21\3\2\2\2\u00ac\u00b0\5\30\r"+
		"\2\u00ad\u00b0\5\32\16\2\u00ae\u00b0\5\34\17\2\u00af\u00ac\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\23\3\2\2\2\u00b1\u00b5\7\5\2"+
		"\2\u00b2\u00b4\5\4\3\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00b9\7\6\2\2\u00b9\25\3\2\2\2\u00ba\u00c7\5\36\20\2\u00bb\u00c7\5 \21"+
		"\2\u00bc\u00c7\5\"\22\2\u00bd\u00c7\5$\23\2\u00be\u00c7\5&\24\2\u00bf"+
		"\u00c7\5(\25\2\u00c0\u00c7\5*\26\2\u00c1\u00c7\5,\27\2\u00c2\u00c7\5."+
		"\30\2\u00c3\u00c7\5\60\31\2\u00c4\u00c7\5\62\32\2\u00c5\u00c7\5\64\33"+
		"\2\u00c6\u00ba\3\2\2\2\u00c6\u00bb\3\2\2\2\u00c6\u00bc\3\2\2\2\u00c6\u00bd"+
		"\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6"+
		"\u00c1\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c5\3\2\2\2\u00c7\27\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9\u00ca"+
		"\5J&\2\u00ca\31\3\2\2\2\u00cb\u00cc\7\62\2\2\u00cc\33\3\2\2\2\u00cd\u00ce"+
		"\7\63\2\2\u00ce\35\3\2\2\2\u00cf\u00d0\5j\66\2\u00d0\u00d1\7\7\2\2\u00d1"+
		"\u00d2\5J&\2\u00d2\37\3\2\2\2\u00d3\u00d4\5j\66\2\u00d4\u00d5\7\b\2\2"+
		"\u00d5\u00d6\5J&\2\u00d6!\3\2\2\2\u00d7\u00d8\5j\66\2\u00d8\u00d9\7\t"+
		"\2\2\u00d9\u00da\5J&\2\u00da#\3\2\2\2\u00db\u00dc\5j\66\2\u00dc\u00dd"+
		"\7\n\2\2\u00dd\u00de\5J&\2\u00de%\3\2\2\2\u00df\u00e0\5j\66\2\u00e0\u00e1"+
		"\7\13\2\2\u00e1\u00e2\5J&\2\u00e2\'\3\2\2\2\u00e3\u00e4\5j\66\2\u00e4"+
		"\u00e5\7\f\2\2\u00e5\u00e6\5J&\2\u00e6)\3\2\2\2\u00e7\u00e8\5j\66\2\u00e8"+
		"\u00e9\7\r\2\2\u00e9\u00ea\5J&\2\u00ea+\3\2\2\2\u00eb\u00ec\5j\66\2\u00ec"+
		"\u00ed\7\16\2\2\u00ed\u00ee\5J&\2\u00ee-\3\2\2\2\u00ef\u00f0\5j\66\2\u00f0"+
		"\u00f1\7\16\2\2\u00f1\u00f2\5J&\2\u00f2/\3\2\2\2\u00f3\u00f4\5j\66\2\u00f4"+
		"\u00f5\7\17\2\2\u00f5\u00f6\5J&\2\u00f6\61\3\2\2\2\u00f7\u00f8\5j\66\2"+
		"\u00f8\u00f9\7\20\2\2\u00f9\u00fa\5J&\2\u00fa\63\3\2\2\2\u00fb\u00fc\5"+
		"j\66\2\u00fc\u00fd\7\21\2\2\u00fd\u00fe\5J&\2\u00fe\65\3\2\2\2\u00ff\u0100"+
		"\7\64\2\2\u0100\u0101\7\22\2\2\u0101\u0102\5J&\2\u0102\u0103\7\23\2\2"+
		"\u0103\u0104\5\4\3\2\u0104\67\3\2\2\2\u0105\u0106\7\65\2\2\u0106\u0107"+
		"\7\64\2\2\u0107\u0109\7\22\2\2\u0108\u010a\5J&\2\u0109\u0108\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7\23\2\2\u010c\u010d\5"+
		"\4\3\2\u010d9\3\2\2\2\u010e\u010f\7\65\2\2\u010f\u0110\5\4\3\2\u0110;"+
		"\3\2\2\2\u0111\u0112\7\66\2\2\u0112\u0114\7\22\2\2\u0113\u0115\5B\"\2"+
		"\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118"+
		"\7\3\2\2\u0117\u0119\5D#\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011c\7\3\2\2\u011b\u011d\5F$\2\u011c\u011b\3\2\2"+
		"\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\23\2\2\u011f"+
		"\u0120\5\4\3\2\u0120=\3\2\2\2\u0121\u0122\7\67\2\2\u0122\u0124\7\22\2"+
		"\2\u0123\u0125\5D#\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0127\7\23\2\2\u0127\u0128\5\4\3\2\u0128?\3\2\2\2\u0129"+
		"\u012a\78\2\2\u012a\u012b\5\4\3\2\u012b\u012c\7\67\2\2\u012c\u012e\7\22"+
		"\2\2\u012d\u012f\5D#\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0131\7\23\2\2\u0131\u0132\7\3\2\2\u0132A\3\2\2\2\u0133"+
		"\u0136\5\n\6\2\u0134\u0136\5\16\b\2\u0135\u0133\3\2\2\2\u0135\u0134\3"+
		"\2\2\2\u0136C\3\2\2\2\u0137\u0138\5J&\2\u0138E\3\2\2\2\u0139\u013c\5\n"+
		"\6\2\u013a\u013c\5\16\b\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c"+
		"G\3\2\2\2\u013d\u013e\5h\65\2\u013e\u013f\5j\66\2\u013f\u014c\7\22\2\2"+
		"\u0140\u0141\5h\65\2\u0141\u0142\5j\66\2\u0142\u0143\7\4\2\2\u0143\u0145"+
		"\3\2\2\2\u0144\u0140\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\5h"+
		"\65\2\u014a\u014b\5j\66\2\u014b\u014d\3\2\2\2\u014c\u0146\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7\23\2\2\u014f\u0150\3"+
		"\2\2\2\u0150\u0151\5\4\3\2\u0151I\3\2\2\2\u0152\u0153\b&\1\2\u0153\u0154"+
		"\7\22\2\2\u0154\u0155\5J&\2\u0155\u0156\7\23\2\2\u0156\u0164\3\2\2\2\u0157"+
		"\u0164\5l\67\2\u0158\u0164\5n8\2\u0159\u0164\5p9\2\u015a\u0164\5r:\2\u015b"+
		"\u0164\5t;\2\u015c\u0164\5j\66\2\u015d\u015e\5N(\2\u015e\u015f\5J&\17"+
		"\u015f\u0164\3\2\2\2\u0160\u0161\5P)\2\u0161\u0162\5J&\16\u0162\u0164"+
		"\3\2\2\2\u0163\u0152\3\2\2\2\u0163\u0157\3\2\2\2\u0163\u0158\3\2\2\2\u0163"+
		"\u0159\3\2\2\2\u0163\u015a\3\2\2\2\u0163\u015b\3\2\2\2\u0163\u015c\3\2"+
		"\2\2\u0163\u015d\3\2\2\2\u0163\u0160\3\2\2\2\u0164\u0195\3\2\2\2\u0165"+
		"\u0166\f\r\2\2\u0166\u0167\5R*\2\u0167\u0168\5J&\16\u0168\u0194\3\2\2"+
		"\2\u0169\u016a\f\f\2\2\u016a\u016b\5T+\2\u016b\u016c\5J&\r\u016c\u0194"+
		"\3\2\2\2\u016d\u016e\f\13\2\2\u016e\u016f\5V,\2\u016f\u0170\5J&\f\u0170"+
		"\u0194\3\2\2\2\u0171\u0172\f\n\2\2\u0172\u0173\5X-\2\u0173\u0174\5J&\13"+
		"\u0174\u0194\3\2\2\2\u0175\u0176\f\t\2\2\u0176\u0177\5Z.\2\u0177\u0178"+
		"\5J&\n\u0178\u0194\3\2\2\2\u0179\u017a\f\b\2\2\u017a\u017b\5\\/\2\u017b"+
		"\u017c\5J&\t\u017c\u0194\3\2\2\2\u017d\u017e\f\7\2\2\u017e\u017f\5^\60"+
		"\2\u017f\u0180\5J&\b\u0180\u0194\3\2\2\2\u0181\u0182\f\6\2\2\u0182\u0183"+
		"\5`\61\2\u0183\u0184\5J&\7\u0184\u0194\3\2\2\2\u0185\u0186\f\5\2\2\u0186"+
		"\u0187\5b\62\2\u0187\u0188\5J&\6\u0188\u0194\3\2\2\2\u0189\u018a\f\4\2"+
		"\2\u018a\u018b\5d\63\2\u018b\u018c\5J&\5\u018c\u0194\3\2\2\2\u018d\u018e"+
		"\f\3\2\2\u018e\u018f\5f\64\2\u018f\u0190\5J&\4\u0190\u0194\3\2\2\2\u0191"+
		"\u0192\f\20\2\2\u0192\u0194\5L\'\2\u0193\u0165\3\2\2\2\u0193\u0169\3\2"+
		"\2\2\u0193\u016d\3\2\2\2\u0193\u0171\3\2\2\2\u0193\u0175\3\2\2\2\u0193"+
		"\u0179\3\2\2\2\u0193\u017d\3\2\2\2\u0193\u0181\3\2\2\2\u0193\u0185\3\2"+
		"\2\2\u0193\u0189\3\2\2\2\u0193\u018d\3\2\2\2\u0193\u0191\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196K\3\2\2\2"+
		"\u0197\u0195\3\2\2\2\u0198\u01ac\7\24\2\2\u0199\u01ac\7\25\2\2\u019a\u01a4"+
		"\7\22\2\2\u019b\u019c\5J&\2\u019c\u019d\7\4\2\2\u019d\u019f\3\2\2\2\u019e"+
		"\u019b\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a5\5J&\2\u01a4\u01a0"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01ac\7\23\2\2"+
		"\u01a7\u01a8\7\26\2\2\u01a8\u01a9\5J&\2\u01a9\u01aa\7\27\2\2\u01aa\u01ac"+
		"\3\2\2\2\u01ab\u0198\3\2\2\2\u01ab\u0199\3\2\2\2\u01ab\u019a\3\2\2\2\u01ab"+
		"\u01a7\3\2\2\2\u01acM\3\2\2\2\u01ad\u01ae\t\2\2\2\u01aeO\3\2\2\2\u01af"+
		"\u01b0\7\22\2\2\u01b0\u01b1\5h\65\2\u01b1\u01b2\7\23\2\2\u01b2Q\3\2\2"+
		"\2\u01b3\u01b4\t\3\2\2\u01b4S\3\2\2\2\u01b5\u01b6\t\4\2\2\u01b6U\3\2\2"+
		"\2\u01b7\u01b8\t\5\2\2\u01b8W\3\2\2\2\u01b9\u01ba\t\6\2\2\u01baY\3\2\2"+
		"\2\u01bb\u01bc\t\7\2\2\u01bc[\3\2\2\2\u01bd\u01be\t\b\2\2\u01be]\3\2\2"+
		"\2\u01bf\u01c0\7*\2\2\u01c0_\3\2\2\2\u01c1\u01c2\7+\2\2\u01c2a\3\2\2\2"+
		"\u01c3\u01c4\7,\2\2\u01c4c\3\2\2\2\u01c5\u01c6\7-\2\2\u01c6e\3\2\2\2\u01c7"+
		"\u01c8\7.\2\2\u01c8g\3\2\2\2\u01c9\u01cb\79\2\2\u01ca\u01cc\7/\2\2\u01cb"+
		"\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cci\3\2\2\2\u01cd\u01ce\7>\2\2\u01ce"+
		"k\3\2\2\2\u01cf\u01d0\7:\2\2\u01d0m\3\2\2\2\u01d1\u01d2\7;\2\2\u01d2o"+
		"\3\2\2\2\u01d3\u01d4\7<\2\2\u01d4q\3\2\2\2\u01d5\u01d6\7=\2\2\u01d6s\3"+
		"\2\2\2\u01d7\u01e1\7\26\2\2\u01d8\u01d9\5J&\2\u01d9\u01da\7\4\2\2\u01da"+
		"\u01dc\3\2\2\2\u01db\u01d8\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01e2\5J&\2\u01e1\u01dd\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2"+
		"\2\u01e3\u01e4\7\27\2\2\u01e4u\3\2\2\2 y\u0080\u0085\u0091\u0098\u009d"+
		"\u00a5\u00aa\u00af\u00b5\u00c6\u0109\u0114\u0118\u011c\u0124\u012e\u0135"+
		"\u013b\u0146\u014c\u0163\u0193\u0195\u01a0\u01a4\u01ab\u01cb\u01dd\u01e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}