package parser;

import ast.*;

import java.util.ArrayList;
import java.util.List;

public class ASTVisitor extends PCFBaseVisitor<AST> {

    @Override
    public AST visitLit(PCFParser.LitContext ctx) {
        return new Lit(Integer.parseInt(ctx.getText()));
    }

    @Override
    public AST visitBinOp(PCFParser.BinOpContext ctx) {
        OP op;
        if (ctx.OP() == null) {
            op = OP.parseOP(ctx.OP2().getText());
        } else {
            op = OP.parseOP(ctx.OP().getText());
        }
        List<PCFParser.TermContext> ANTLRTerms = ctx.term();
        List<Term> terms = new ArrayList<>();
        for (PCFParser.TermContext ANTLRTerm : ANTLRTerms)
            terms.add((Term) visit(ANTLRTerm));
        return new BinOp(op, terms.get(0), terms.get(1));
    }

    @Override
    public AST visitCond(PCFParser.CondContext ctx) {
        List<PCFParser.TermContext> ANTLRTerms = ctx.term();
        List<Term> terms = new ArrayList<>();
        for (PCFParser.TermContext ANTLRTerm : ANTLRTerms)
            terms.add((Term) visit(ANTLRTerm));
        return new Cond(terms.get(0), terms.get(1), terms.get(2));
    }

    @Override
    public AST visitPar(PCFParser.ParContext ctx) {
        PCFParser.TermContext ANTLRTerms = ctx.term();
        return visit(ANTLRTerms);
    }


    @Override
    public AST visitVar(PCFParser.VarContext ctx) {
        String name = ctx.getText();
        return new Var(name);
    }

    @Override
    public AST visitLet(PCFParser.LetContext ctx) {
        Var var = new Var(ctx.ID().getText());
        List<PCFParser.TermContext> ANTLRTerms = ctx.term();
        List<Term> terms = new ArrayList<>();
        for (PCFParser.TermContext ANTLRTerm : ANTLRTerms)
            terms.add((Term) visit(ANTLRTerm));
        return new Let(var, terms.get(0), terms.get(1));
    }
}