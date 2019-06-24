/*
4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
package com.example.tasks.cycle;

import java.math.BigInteger;

public class Cycle4 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int a = 200, n = 0;
        double m;
        BigInteger mul = new BigInteger("1");

        while (n < a) {
            n += 1;
            m = Math.pow(n, 2);
            mul = mul.multiply(BigInteger.valueOf((int) m));
        }
        System.out.println("multiply of squares of numbers is " + mul);
    }
}