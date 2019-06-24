/*
3. Найти сумму квадратов первых ста чисел.
 */
package com.example.tasks.cycle;

import java.math.BigInteger;

public class Cycle3 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int a = 100, n = 0;
        double m;
        BigInteger sum = new BigInteger("0");

        while (n < a) {
            n += 1;
            m = Math.pow(n, 2);
            sum = sum.add(BigInteger.valueOf((int) m));
        }
        System.out.println("sum of numbers is " + sum);
    }
}