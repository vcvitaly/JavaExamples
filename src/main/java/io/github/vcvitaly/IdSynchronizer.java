package io.github.vcvitaly;

import java.util.Objects;

public class IdSynchronizer {

    public static void main(String[] args) {
        System.out.println(System.identityHashCode(123_456));
        System.out.println(System.identityHashCode(123_456));
    }
}
