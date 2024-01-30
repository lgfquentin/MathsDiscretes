package ast;

import interp.Env;
import interp.Value;

public class Var extends Term{
    public String name;

    public Var(String name) {
        this.name = name;
    }

    @Override
    public Value interp(Env e) {
        if(e.lookup(name).isEmpty()){
            throw new RuntimeException("Variable " + name + " non définie");
        }
        return e.lookup(name).get();
    }
}
