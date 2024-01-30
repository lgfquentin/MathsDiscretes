package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;

public class BinOp extends Term {
    public OP op;
    public Term term1;
    public Term term2;

    public BinOp(OP op, Term term1, Term term2) {
        this.op = op;
        this.term1 = term1;
        this.term2 = term2;
    }

    @Override
    public Value interp(Env e) {
        //fais en sorte que les deux termes s'additionnent
        Value v1 = term1.interp(e);
        Value v2 = term2.interp(e);
        if (v1 instanceof IntVal && v2 instanceof IntVal) {
            IntVal i1 = (IntVal) v1;
            IntVal i2 = (IntVal) v2;
            switch (op) {
                case PLUS:
                    return new IntVal(i1.value + i2.value);
                case MINUS:
                    return new IntVal(i1.value - i2.value);
                case TIMES:
                    return new IntVal(i1.value * i2.value);
                case DIVIDE:
                    if(i2.value == 0){
                        throw new IllegalArgumentException("Division par 0");
                    }
                    return new IntVal(i1.value / i2.value);
            }

        }
        throw new IllegalArgumentException("Unexpected operator: " + op);
    }
}
