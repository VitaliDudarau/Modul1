/*
2. Найти max{min(a, b), min(c, d)}.
 */
package com.example.tasks.branch;

import java.util.Scanner;

public class Branch2 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int a, b, c, d, min1, min2, max;

        Scanner s = new Scanner(System.in);
        System.out.println("write a: ");
        a = s.nextInt();
        System.out.println("write b: ");
        b = s.nextInt();
        System.out.println("write c: ");
        c = s.nextInt();
        System.out.println("write d: ");
        d = s.nextInt();

        if (a <= b) {
            min1 = a;
        }else {
            min1 = b;
        }

        if (c <= d) {
            min2 = c;
        }else {
            min2 = d;
        }

        if (min1 >= min2) {
            max = min1;
        }else {
            max = min2;
        }

        System.out.println("max value is " + max);
    }
}