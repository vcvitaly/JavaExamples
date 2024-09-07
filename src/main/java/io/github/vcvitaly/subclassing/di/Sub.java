package io.github.vcvitaly.subclassing.di;

public class Sub extends Base {

    public Sub() {
//        super(getInt());
        super(42);
    }

    @Override
    protected int getInt() {
        return 42;
    }

    public static void main(String[] args) {
        Base instance = new Sub();
        System.out.println(instance);
    }
}
