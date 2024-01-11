// Generated from Phase3.g by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Phase3Parser}.
 */
public interface Phase3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#pogram}.
	 * @param ctx the parse tree
	 */
	void enterPogram(Phase3Parser.PogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#pogram}.
	 * @param ctx the parse tree
	 */
	void exitPogram(Phase3Parser.PogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(Phase3Parser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(Phase3Parser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#constValue}.
	 * @param ctx the parse tree
	 */
	void enterConstValue(Phase3Parser.ConstValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#constValue}.
	 * @param ctx the parse tree
	 */
	void exitConstValue(Phase3Parser.ConstValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(Phase3Parser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(Phase3Parser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#arithmatic}.
	 * @param ctx the parse tree
	 */
	void enterArithmatic(Phase3Parser.ArithmaticContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#arithmatic}.
	 * @param ctx the parse tree
	 */
	void exitArithmatic(Phase3Parser.ArithmaticContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(Phase3Parser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(Phase3Parser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Phase3Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Phase3Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(Phase3Parser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(Phase3Parser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#condStmt}.
	 * @param ctx the parse tree
	 */
	void enterCondStmt(Phase3Parser.CondStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#condStmt}.
	 * @param ctx the parse tree
	 */
	void exitCondStmt(Phase3Parser.CondStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Phase3Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Phase3Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Phase3Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Phase3Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Phase3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Phase3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Phase3Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Phase3Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#varDeclCnt}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclCnt(Phase3Parser.VarDeclCntContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#varDeclCnt}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclCnt(Phase3Parser.VarDeclCntContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(Phase3Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(Phase3Parser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Phase3Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Phase3Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Phase3Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Phase3Parser.BlockContext ctx);
}