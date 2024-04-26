package io.github.vcvitaly;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(2)
public class TestTwo {

    @Test
    void test2() {
        System.out.println(Context.ref.get());
    }
}
