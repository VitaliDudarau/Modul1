/*
5.  Вычислить значение функции:
F(x) = {(x ^ 2 - 3 * x + 9), если x <= 3;
        (1 / ((x ^ 3) + 6)), если x > 3 }
 */
package com.example.tasks.branch;

import java.util.Scanner;

public class Branch5 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        double x, y, a, b;

        Scanner s = new Scanner(System.in);
        System.out.println("write x : ");
        x = s.nextDouble();

        a = Math.pow(x, 2) - 3 * x + 9;
        b = 1 / (Math.pow(x, 3) + 6);

        if (x <= 3) {
            System.out.print("first value is ");
            System.out.printf("%8.4f", a);
        }else {
            System.out.print("second value is ");
            System.out.printf("%8.4f", b);
        }
    }
}