/*
8.  Даны два числа. Определить цифры, входящие
в запись как первого так и второго числа.
 */
package com.example.tasks.cycle;

import java.util.Scanner;

public class Cycle8 {

    @SuppressWarnings("resources")
    public static void main(String[] args) {

        int a, b, c, d, x, y, count = 0, count0 = 0, count1 = 0,
        count2 = 0, count3 = 0, count4 = 0, count5 = 0,
        count6 = 0, count7 = 0, count8 = 0, count9 = 0;

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
                    count++;
                    switch (y) {
                        case 0: count0++;
                                if (count0 > 1) {
                                   break;
                                }
                                System.out.print(y + " | ");
                                break;
                        case 1: count1++;
                                if (count1 > 1) {
                                    break;
                                }
                                System.out.print(y + " | ");
                                break;
                        case 2: count2++;
                                if (count2 > 1) {
                                    break;
                                }
                                System.out.print(y + " | ");
                                break;
                        case 3: count3++;
                                if (count3 > 1) {
                                    break;
                                }
                                System.out.print(y + " | ");
                                break;
                        case 4: count4++;
                                if (count4 > 1) {
                                    break;
                                }
                                System.out.print(y + " | ");
                                break;
                        case 5: count5++;
                                if (count5 > 1) {
                                    break;
                                }
                                System.out.print(y + " | ");
                                break;
                        case 6: count6++;
                                if (count6 > 1) {
                                    break;
                                }
                                System.out.print(y + " | ");
                                break;
                        case 7: count7++;
                                if (count7 > 1) {
                                    break;
                                }
                                System.out.print(y + " | ");
                                break;
                        case 8: count8++;
                                if (count8 > 1) {
                                    break;
                                }
                                System.out.print(y + " | ");
                                break;
                        case 9: count9++;
                                if (count9 > 1) {
                                    break;
                                }
                                System.out.print(y + " | ");
                                break;
                    }
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

