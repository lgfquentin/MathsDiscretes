package interp;

import java.util.Optional;

public class EmptyEnv extends Env{
    @Override
    Binding last() {
        return null;
    }

    @Override
    Env previous() {
        return null;
    }

    @Override
    public Env add(String id, Value value) {
        return null;
    }

    @Override
    public Optional<Value> lookup(String id) {
        return Optional.empty();
    }
}
