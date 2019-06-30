/*
8.  Даны два числа. Определить цифры, входящие
в запись как первого так и второго числа.
 */
package com.example.tasks.cycle;

import java.util.Scanner;

public class Cycle8 {

    @SuppressWarnings("resources")
    public static void main(String[] args) {

        int a, b, c, x, y, count = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("write a: ");
        a = s.nextInt();
        System.out.println("write b: ");
        b = s.nextInt();

        System.out.println("same digit is ");

        while (a > 0) {
            x = a % 10;
            c = b;
            while (c > 0) {
                y = c % 10;
                if (x == y) {
                    System.out.print(y + " | ");
                    count++;
                    break;
                }
                c = c / 10;
            }
            a = a / 10;
        }
        if (count == 0) {
            System.out.println("not");
        }
    }
}

