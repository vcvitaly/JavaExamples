package io.github.vcvitaly;

public class ClassLoaderer {

    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoaderer.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getClass().getClassLoader());
    }
}
