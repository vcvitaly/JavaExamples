package io.github.vcvitaly.subclassing.simple;

public abstract class Base {

    private final int i;

    public Base() {
        this.i = getInt();
    }

    protected abstract int getInt();

    @Override
    public String toString() {
        return "%s{i=%d}".formatted(getClass().getSimpleName(), i);
    }
}
