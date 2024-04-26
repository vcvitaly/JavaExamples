package io.github.vcvitaly;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(1)
public class TestOne {

    @Test
    void test1() {
        Context.ref.set("hello");
        System.out.println(Context.ref.get());
    }
}
