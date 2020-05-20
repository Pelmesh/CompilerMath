// Generated from E:/свнаю/ъохя/lab1/src/main/java/grammatics\Grammatics.g4 by ANTLR 4.8
package grammatics;



import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammaticsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammaticsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(GrammaticsParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(GrammaticsParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammaticsParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(GrammaticsParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(GrammaticsParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModMulDiv(GrammaticsParser.ModMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpr(GrammaticsParser.FloatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prim}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrim(GrammaticsParser.PrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(GrammaticsParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExrp}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExrp(GrammaticsParser.IntExrpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(GrammaticsParser.TypeConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(GrammaticsParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(GrammaticsParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(GrammaticsParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(GrammaticsParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(GrammaticsParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#create_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_int(GrammaticsParser.Create_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#create_const_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_const_int(GrammaticsParser.Create_const_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#create_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_float(GrammaticsParser.Create_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#create_const_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_const_float(GrammaticsParser.Create_const_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link GrammaticsParser#name_object_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectInt(GrammaticsParser.NameObjectIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectFloat}
	 * labeled alternative in {@link GrammaticsParser#name_object_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectFloat(GrammaticsParser.NameObjectFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(GrammaticsParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(GrammaticsParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(GrammaticsParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(GrammaticsParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(GrammaticsParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forCond}
	 * labeled alternative in {@link GrammaticsParser#condition_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCond(GrammaticsParser.ForCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link GrammaticsParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(GrammaticsParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link GrammaticsParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckType(GrammaticsParser.CheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GrammaticsParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#print_com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_com(GrammaticsParser.Print_comContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link GrammaticsParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintId(GrammaticsParser.PrintIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link GrammaticsParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintInt(GrammaticsParser.PrintIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link GrammaticsParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFloat(GrammaticsParser.PrintFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(GrammaticsParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(GrammaticsParser.Param_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link GrammaticsParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArg(GrammaticsParser.ParamCallArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link GrammaticsParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArgs(GrammaticsParser.ParamCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link GrammaticsParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(GrammaticsParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link GrammaticsParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(GrammaticsParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block_with_return(GrammaticsParser.Stat_block_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#return_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_id(GrammaticsParser.Return_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(GrammaticsParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link GrammaticsParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArg(GrammaticsParser.ParamArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link GrammaticsParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArgs(GrammaticsParser.ParamArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammaticsParser.TypeContext ctx);
}