package io.github.vcvitaly.subclassing.simple;

public class Sub extends Base {

    @Override
    protected int getInt() {
        return 42;
    }

    public static void main(String[] args) {
        Base instance = new Sub();
        System.out.println(instance);
    }
}
