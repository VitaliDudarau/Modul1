/*
5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
a(n) = 1 / (2 ^ n) + 1 / (3 ^ n)
 */
package com.example.tasks.cycle;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cycle5 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int n;
        double e, c, d;
        BigDecimal a, b;
        BigDecimal sum = new BigDecimal("0");

        Scanner s = new Scanner(System.in);
        System.out.println("write count n: ");
        n = s.nextInt();
        System.out.println("write number e: ");
        e = s.nextDouble();

        for(int i = 0; i < n; i++) {
            a = BigDecimal.valueOf(1);
            b = BigDecimal.valueOf(1);
            c = Math.pow(2, i);
            d = Math.pow (3, i);
            a = a.divide(BigDecimal.valueOf(c), 20, BigDecimal.ROUND_HALF_UP);
            b = b.divide(BigDecimal.valueOf(d), 20, BigDecimal.ROUND_HALF_UP);
            a = a.add(b);

                if(a.compareTo(BigDecimal.valueOf(e)) >= -1) {
                    sum = sum.add(a);
                }else {
                    break;
                }
        }
        System.out.println("sum = " + sum);
    }
}