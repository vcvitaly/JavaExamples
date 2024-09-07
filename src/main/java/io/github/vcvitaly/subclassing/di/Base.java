package io.github.vcvitaly.subclassing.di;

public abstract class Base {

    private final int i;

    public Base(int i) {
        this.i = i;
    }

    protected abstract int getInt();

    @Override
    public String toString() {
        return "%s{i=%d}".formatted(getClass().getSimpleName(), i);
    }
}
