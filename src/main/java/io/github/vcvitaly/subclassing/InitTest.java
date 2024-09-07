package io.github.vcvitaly.subclassing;

public class InitTest {

    private final int i;

    public InitTest() {
        i = getInt();
    }

    private int getInt() {
        return 42;
    }

    @Override
    public String toString() {
        return "InitTest{" +
                "i=" + i +
                '}';
    }

    public static void main(String[] args) {
        InitTest initTest = new InitTest();
        System.out.println(initTest);
    }
}
