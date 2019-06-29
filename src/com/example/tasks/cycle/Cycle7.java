/*
7. Для каждого натурального числа в промежутке от m до n вывести все делители,
кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */
package com.example.tasks.cycle;

import java.util.Scanner;

public class Cycle7 {

    @SuppressWarnings("resources")
    public static void main(String[] args) {

        int m, n, count;

        Scanner s = new Scanner(System.in);

        do {
            System.out.println("write m > 0: ");
            m = s.nextInt();
            System.out.println("write n more than m and > 0: ");
            n = s.nextInt();
        }while (n < m || n < 1 || m < 1);

        for(int i = m; i <= n; i++) {
            System.out.println("for number " + i + " dividers are");
            count = 0;

            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    System.out.println(j);
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("not");
            }
        }
    }
}