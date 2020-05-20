// Generated from E:/свнаю/ъохя/lab1/src/main/java/grammatics\Grammatics.g4 by ANTLR 4.8
package grammatics;



import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammaticsParser}.
 */
public interface GrammaticsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(GrammaticsParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(GrammaticsParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(GrammaticsParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(GrammaticsParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammaticsParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammaticsParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(GrammaticsParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(GrammaticsParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(GrammaticsParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(GrammaticsParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModMulDiv(GrammaticsParser.ModMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModMulDiv(GrammaticsParser.ModMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpr(GrammaticsParser.FloatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpr(GrammaticsParser.FloatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prim}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrim(GrammaticsParser.PrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prim}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrim(GrammaticsParser.PrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(GrammaticsParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(GrammaticsParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExrp}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExrp(GrammaticsParser.IntExrpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExrp}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExrp(GrammaticsParser.IntExrpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(GrammaticsParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(GrammaticsParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(GrammaticsParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(GrammaticsParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(GrammaticsParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(GrammaticsParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(GrammaticsParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(GrammaticsParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(GrammaticsParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GrammaticsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(GrammaticsParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(GrammaticsParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(GrammaticsParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#create_int}.
	 * @param ctx the parse tree
	 */
	void enterCreate_int(GrammaticsParser.Create_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#create_int}.
	 * @param ctx the parse tree
	 */
	void exitCreate_int(GrammaticsParser.Create_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#create_const_int}.
	 * @param ctx the parse tree
	 */
	void enterCreate_const_int(GrammaticsParser.Create_const_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#create_const_int}.
	 * @param ctx the parse tree
	 */
	void exitCreate_const_int(GrammaticsParser.Create_const_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#create_float}.
	 * @param ctx the parse tree
	 */
	void enterCreate_float(GrammaticsParser.Create_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#create_float}.
	 * @param ctx the parse tree
	 */
	void exitCreate_float(GrammaticsParser.Create_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#create_const_float}.
	 * @param ctx the parse tree
	 */
	void enterCreate_const_float(GrammaticsParser.Create_const_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#create_const_float}.
	 * @param ctx the parse tree
	 */
	void exitCreate_const_float(GrammaticsParser.Create_const_floatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link GrammaticsParser#name_object_int}.
	 * @param ctx the parse tree
	 */
	void enterNameObjectInt(GrammaticsParser.NameObjectIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link GrammaticsParser#name_object_int}.
	 * @param ctx the parse tree
	 */
	void exitNameObjectInt(GrammaticsParser.NameObjectIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameObjectFloat}
	 * labeled alternative in {@link GrammaticsParser#name_object_float}.
	 * @param ctx the parse tree
	 */
	void enterNameObjectFloat(GrammaticsParser.NameObjectFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameObjectFloat}
	 * labeled alternative in {@link GrammaticsParser#name_object_float}.
	 * @param ctx the parse tree
	 */
	void exitNameObjectFloat(GrammaticsParser.NameObjectFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(GrammaticsParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(GrammaticsParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(GrammaticsParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(GrammaticsParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(GrammaticsParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(GrammaticsParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(GrammaticsParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(GrammaticsParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(GrammaticsParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(GrammaticsParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forCond}
	 * labeled alternative in {@link GrammaticsParser#condition_for}.
	 * @param ctx the parse tree
	 */
	void enterForCond(GrammaticsParser.ForCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forCond}
	 * labeled alternative in {@link GrammaticsParser#condition_for}.
	 * @param ctx the parse tree
	 */
	void exitForCond(GrammaticsParser.ForCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link GrammaticsParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(GrammaticsParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link GrammaticsParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(GrammaticsParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link GrammaticsParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCheckType(GrammaticsParser.CheckTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link GrammaticsParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCheckType(GrammaticsParser.CheckTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GrammaticsParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GrammaticsParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#print_com}.
	 * @param ctx the parse tree
	 */
	void enterPrint_com(GrammaticsParser.Print_comContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#print_com}.
	 * @param ctx the parse tree
	 */
	void exitPrint_com(GrammaticsParser.Print_comContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printId}
	 * labeled alternative in {@link GrammaticsParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintId(GrammaticsParser.PrintIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link GrammaticsParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintId(GrammaticsParser.PrintIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link GrammaticsParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintInt(GrammaticsParser.PrintIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link GrammaticsParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintInt(GrammaticsParser.PrintIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link GrammaticsParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintFloat(GrammaticsParser.PrintFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link GrammaticsParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintFloat(GrammaticsParser.PrintFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(GrammaticsParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(GrammaticsParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#param_call}.
	 * @param ctx the parse tree
	 */
	void enterParam_call(GrammaticsParser.Param_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#param_call}.
	 * @param ctx the parse tree
	 */
	void exitParam_call(GrammaticsParser.Param_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link GrammaticsParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void enterParamCallArg(GrammaticsParser.ParamCallArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link GrammaticsParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void exitParamCallArg(GrammaticsParser.ParamCallArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link GrammaticsParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void enterParamCallArgs(GrammaticsParser.ParamCallArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link GrammaticsParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void exitParamCallArgs(GrammaticsParser.ParamCallArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link GrammaticsParser#function}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(GrammaticsParser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link GrammaticsParser#function}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(GrammaticsParser.VoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link GrammaticsParser#function}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunction(GrammaticsParser.ReturnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link GrammaticsParser#function}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunction(GrammaticsParser.ReturnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 */
	void enterStat_block_with_return(GrammaticsParser.Stat_block_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 */
	void exitStat_block_with_return(GrammaticsParser.Stat_block_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#return_id}.
	 * @param ctx the parse tree
	 */
	void enterReturn_id(GrammaticsParser.Return_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#return_id}.
	 * @param ctx the parse tree
	 */
	void exitReturn_id(GrammaticsParser.Return_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GrammaticsParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GrammaticsParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link GrammaticsParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterParamArg(GrammaticsParser.ParamArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link GrammaticsParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitParamArg(GrammaticsParser.ParamArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link GrammaticsParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterParamArgs(GrammaticsParser.ParamArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link GrammaticsParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitParamArgs(GrammaticsParser.ParamArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammaticsParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammaticsParser.TypeContext ctx);
}