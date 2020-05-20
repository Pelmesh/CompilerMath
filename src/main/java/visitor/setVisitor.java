package visitor;


import grammatics.GrammaticsBaseVisitor;
import grammatics.GrammaticsParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class setVisitor extends GrammaticsBaseVisitor<String> {
    private String className;
    private Map<String, Type> globalVariable = new HashMap<>();
    private Map<String, Type> localVariable = new HashMap<>();
    private Map<String, Type> functionNames = new HashMap<>();

    public setVisitor(String fileName) {
        String fileNameForClass = getStringWithFirstCapital(fileName);
        this.className = replaceDot(fileNameForClass);
    }

    private String getStringWithFirstCapital(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    private String replaceDot(String string) {
        return string.replaceAll("[.]", "_");
    }

    private boolean isGlobal(ParserRuleContext ctx) {
        return ctx.getParent().getParent() instanceof GrammaticsParser.ParseContext;
    }

    private void addVariableToList(ParserRuleContext ctx, String name, Type type) {
        if (isGlobal(ctx)) {
            globalVariable.put(name, type);
        } else {
            localVariable.put(name, type);
        }
    }

    private void addToLocalVariableList(String name, Type type) {
        localVariable.put(name, type);
    }

    private void clearLocalVariableList() {
        localVariable.clear();
    }

    private void addToFunctionList(String name, Type type) {
        functionNames.put(name, type);
    }

    private boolean notExistLocaleVariable(String name) {
        return !localVariable.containsKey(name);
    }

    @Override
    public String visitParse(GrammaticsParser.ParseContext ctx) {
        String text = "public class Main {\n";
        List<GrammaticsParser.CreateContext> createContextList = ctx.create();
        for (GrammaticsParser.CreateContext aCreateContextList : createContextList) {
            text += "static " + this.visit(aCreateContextList);
            text += "\n";
        }
        List<GrammaticsParser.FunctionContext> functionContextList = ctx.function();
        for (GrammaticsParser.FunctionContext aFunctionContextList : functionContextList) {
            text += this.visit(aFunctionContextList);
            text += "\n";
        }
        text += this.visit(ctx.main());
        text += "}\n";
        return text;
    }

    @Override
    public String visitMain(GrammaticsParser.MainContext ctx) {
        clearLocalVariableList();
        return "public static void main(String[]args) throws Exception{\n" +
                this.visit(ctx.start()) +
                "}\n";
    }

    @Override
    public String visitStart(GrammaticsParser.StartContext ctx) {
        String text = "";
        for (int children = 0; children < ctx.getChildCount(); children++) {
            text += "";
            text += this.visit(ctx.getChild(children));
            text += "\n";
        }
        return text;
    }


    @Override
    public String visitCreate_int(GrammaticsParser.Create_intContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)) {
            addVariableToList(ctx, name, Type.INTEGER);
            newVariable = Type.INTEGER.toString() + " ";
        }
        String nameObject = visit(ctx.expr());
        return newVariable + name + " = " + nameObject + ";";
    }

    @Override
    public String visitCreate_const_int(GrammaticsParser.Create_const_intContext ctx) {
        String newInt = visit(ctx.create_int());
        return "final" + " " + newInt;
    }

    @Override
    public String visitCreate_float(GrammaticsParser.Create_floatContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)) {
            addVariableToList(ctx, name, Type.FLOAT);
            newVariable = Type.FLOAT.toString() + " ";
        }
        String nameObject = visit(ctx.expr());
        return newVariable + name + " = " + nameObject + ";";
    }

    @Override
    public String visitCreate_const_float(GrammaticsParser.Create_const_floatContext ctx) {
        String newfloat = visit(ctx.create_float());
        return "final" + " " + newfloat;
    }

    @Override
    public String visitForCond(GrammaticsParser.ForCondContext ctx) {
        String id1 = ctx.ID(0).getText();
        String id2 = ctx.ID(1).getText();
        String expression = visit(ctx.expr());
        String condition = visit(ctx.condition());
        switch (ctx.oper.getType()) {
            case GrammaticsParser.INCR:
                return id1 + "=" + expression + "; " + condition + "; " + id2 + "++";
            case GrammaticsParser.DECR:
                return id1 + "=" + expression + "; " + condition + "; " + id2 + "--";
            default:
                throw new RuntimeException("Unknown operator: " + ctx.oper.getText());
        }
    }

    @Override
    public String visitNameObjectInt(GrammaticsParser.NameObjectIntContext ctx) {
        return ctx.INT().getText();
    }

    public String visitNameObjectFloat(GrammaticsParser.NameObjectFloatContext ctx) {
        return ctx.FLOAT().getText();
    }


    @Override
    public String visitPrint(GrammaticsParser.PrintContext ctx) {
        return "System.out.println(" + this.visit(ctx.print_expr()) + ");";
    }


    @Override
    public String visitPrintId(GrammaticsParser.PrintIdContext ctx) {
        return ctx.ID().toString();
    }

    @Override
    public String visitPrint_com(GrammaticsParser.Print_comContext ctx){
        return "System.out.println(\"" + ctx.ID().toString() + "\");";
    }

    @Override
    public String visitPrintInt(GrammaticsParser.PrintIntContext ctx) {
        return ctx.INT().getText();
    }

    @Override
    public String visitPrintFloat(GrammaticsParser.PrintFloatContext ctx) {
        return ctx.FLOAT().getText();
    }


    @Override
    public String visitStat_block(GrammaticsParser.Stat_blockContext ctx) {
        Map<String, Type> beforeStatBlock = new HashMap(localVariable);
        String block = "{\n" + this.visit(ctx.start()) + "}";
        localVariable = beforeStatBlock;
        return block;
    }


    @Override
    public String visitIf_stat(GrammaticsParser.If_statContext ctx) {
        String text = "";
        List<GrammaticsParser.Condition_blockContext> conditions = ctx.condition_block();
        for (int index = 0; index < conditions.size(); index++) {
            String conditionString = this.visit(conditions.get(index).condition());
            String negation = "";
            if (conditions.get(index).NEGATION() != null) {
                negation = "!";
            }
            text += "if (" + negation + conditionString + ")";
            text += this.visit(conditions.get(index).stat_block());
            if ((index + 1) < conditions.size()) {
                text += "else ";
            }
        }
        if (ctx.stat_block() != null) {
            text += "else" + this.visit(ctx.stat_block());
        }
        return text;
    }

    @Override
    public String visitCondition_block(GrammaticsParser.Condition_blockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitEqualityExpr(GrammaticsParser.EqualityExprContext ctx) {
        String left = ctx.ID().getText();
        String right = visit(ctx.expr());
        switch (ctx.op.getType()) {
            case GrammaticsParser.EQ:
                return left + "==" + right;
            case GrammaticsParser.NEQ:
                return left + "!=" + right;
            case GrammaticsParser.OANGLEBR:
                return left + "<" + right;
            case GrammaticsParser.CANGLEBR:
                return left + ">" + right;
            case GrammaticsParser.EQOANGLEBR:
                return left + "<=" + right;
            case GrammaticsParser.EQCANGLEBR:
                return left + ">=" + right;
            default:
                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
        }
    }


    @Override
    public String visitCheckType(GrammaticsParser.CheckTypeContext ctx) {
        String left = ctx.ID().getText();
        String right = ctx.type().getText();
        right = getStringWithFirstCapital(right);
        return left + ".getClass().getSimpleName().equals(\"" + right + "\")";
    }

    @Override
    public String visitWhile_stat(GrammaticsParser.While_statContext ctx) {
        return "while (" + this.visit(ctx.condition_block().condition()) + ")" +
                this.visit(ctx.condition_block().stat_block());
    }


    @Override
    public String visitFor_stat(GrammaticsParser.For_statContext ctx) {
        String cond = visit(ctx.condition_for());
        String forBlock = "for (" + cond + ")" + this.visit(ctx.stat_block());
        return forBlock;
    }


    @Override
    public String visitVoidFunction(GrammaticsParser.VoidFunctionContext ctx) {
        clearLocalVariableList();
        String name = ctx.ID().getText();
        addToFunctionList(name, Type.VOID);
        return "private static void " + name + this.visit(ctx.param()) + this.visit(ctx.stat_block());
    }

    @Override
    public String visitReturnFunction(GrammaticsParser.ReturnFunctionContext ctx) {
        clearLocalVariableList();
        String name = ctx.ID().getText();
        String returnType = ctx.type().getText();
        if (returnType.equals("integer")) {
            returnType = "int";
        }
        addToFunctionList(name, Type.getTypeByString(returnType));
        return "private static " + returnType + " " + name +
                this.visit(ctx.param()) +
                this.visit(ctx.stat_block_with_return());
    }


    @Override
    public String visitStat_block_with_return(GrammaticsParser.Stat_block_with_returnContext ctx) {
        return "{\n" + this.visit(ctx.start()) + this.visit(ctx.return_id()) + "}";
    }

    @Override
    public String visitReturn_id(GrammaticsParser.Return_idContext ctx) {
        String id = ctx.ID().getText();
        GrammaticsParser.ReturnFunctionContext context = (GrammaticsParser.ReturnFunctionContext) ctx.getParent().getParent();
        return "return " + id + ";\n";
    }

    @Override
    public String visitFunction_call(GrammaticsParser.Function_callContext ctx) {
        String name = ctx.ID().getText();
        return name + this.visit(ctx.param_call());
    }

    @Override
    public String visitCall(GrammaticsParser.CallContext ctx) {
        return ctx.ID().getText() + "(" + visit(ctx.expr()) + ")";
    }

    @Override
    public String visitParam_call(GrammaticsParser.Param_callContext ctx) {
        String args = "";
        if (ctx.arg_call() != null) {
            args = this.visit(ctx.arg_call());
        }
        return "(" + args + ");";
    }

    @Override
    public String visitParamCallArgs(GrammaticsParser.ParamCallArgsContext ctx) {
        return ctx.ID().getText() + ", " + this.visit(ctx.arg_call());
    }

    @Override
    public String visitParamCallArg(GrammaticsParser.ParamCallArgContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitParam(GrammaticsParser.ParamContext ctx) {
        String args = "";
        if (ctx.arg() != null) {
            args = this.visit(ctx.arg());
        }
        return "(" + args + ")";
    }

    @Override
    public String visitParamArgs(GrammaticsParser.ParamArgsContext ctx) {
        String type = ctx.type().getText();
        type = getStringWithFirstCapital(type);
        String name = ctx.ID().getText();
        addToLocalVariableList(name, Type.getTypeByString(type));
        return type + " " + name + ", " + this.visit(ctx.arg());
    }

    @Override
    public String visitParamArg(GrammaticsParser.ParamArgContext ctx) {
        String type = ctx.type().getText();
        type = getStringWithFirstCapital(type);
        String name = ctx.ID().getText();
        addToLocalVariableList(name, Type.getTypeByString(type));
        if (type.equals("Integer")) {
            return "int" + " " + name;
        } else return type + " " + name;
    }

    @Override
    public String visitAddSub(GrammaticsParser.AddSubContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        if (ctx.op.getType() == GrammaticsParser.ADD) return left + "+" + right;
        return left + "-" + right;
    }

    @Override
    public String visitUnary(GrammaticsParser.UnaryContext ctx) {
        String buff = visit(ctx.expr());
        if (ctx.op.getType() == GrammaticsParser.ADD) return "+" + buff;
        return "-" + buff;
    }

    @Override
    public String visitPowExpr(GrammaticsParser.PowExprContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        return left + "^" + right;
    }

    @Override
    public String visitAssignExpr(GrammaticsParser.AssignExprContext ctx) {
        String left = ctx.ID().getText();
        String right = visit(ctx.expr()); // get value of right subexpression
        return left + "=" + right + ";";
    }

    @Override
    public String visitPrim(GrammaticsParser.PrimContext ctx) {
        String buff = visit(ctx.expr());
        return "(" + buff + ")";
    }

    @Override
    public String visitModMulDiv(GrammaticsParser.ModMulDivContext ctx) {
        String left = visit(ctx.expr(0));  // get value of left subexpression
        String right = visit(ctx.expr(1));
        if (ctx.op.getType() == GrammaticsParser.MOD) return left + " %" + right;
        if (ctx.op.getType() == GrammaticsParser.MUL) return left + "*" + right;
        return left + "/" + right; // must be DIV
    }


    @Override
    public String visitFloatExpr(GrammaticsParser.FloatExprContext ctx) {
        String buff = this.visit(ctx.name_object_float());
        return buff + "f";
    }

    @Override
    public String visitIntExrp(GrammaticsParser.IntExrpContext ctx) {
        String buff = this.visit(ctx.name_object_int());
        return buff;
    }

    @Override
    public String visitIdExpr(GrammaticsParser.IdExprContext ctx) {
        String name = ctx.ID().getText();
        return name;
    }


    @Override
    public String visitTypeConversion(GrammaticsParser.TypeConversionContext ctx) {
        String type = "";
        String text = visit(ctx.expr());
        if (ctx.tp.getType() == GrammaticsParser.FLOAT_TYPE) type = "float";
        else type = "int";
        return "(" + type + ")" + text;
    }
}
