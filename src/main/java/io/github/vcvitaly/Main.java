package io.github.vcvitaly;

import java.math.BigInteger;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            final long l = rand.nextLong();
            BigInteger res = BigInteger.valueOf(l).multiply(BigInteger.valueOf(l));
            System.out.println(res);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}