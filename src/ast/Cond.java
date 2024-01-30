package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;

public class Cond extends Term {
    public Term test;
    public Term branchTrue; // non zero
    public Term branchFalse;

    public Cond(Term test, Term branchTrue, Term branchFalse) {
        this.test = test;
        this.branchTrue = branchTrue;
        this.branchFalse = branchFalse;
    }

    @Override
    public Value interp(Env e) {
        Value value = test.interp(e); // evaluate test
        if (value instanceof IntVal) { // check it is an integer
            IntVal i = (IntVal) value;
            // unbox test
            if (i.value != 0) {
                return branchTrue.interp(e);
            } else {
                return branchFalse.interp(e);
            }
        }
        throw new IllegalArgumentException("Unexpected value: " + value);
    }
}
