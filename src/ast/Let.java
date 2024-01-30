package ast;

import interp.Env;
import interp.Value;

public class Let extends Term{
    public Var var;

    public Term term1;
    public Term term2;

    public Let(Var var, Term term1, Term term2) {
        this.var = var;
        this.term1 = term1;
        this.term2 = term2;
    }

    @Override
    public Value interp(Env e) {
        return null;
    }
}
