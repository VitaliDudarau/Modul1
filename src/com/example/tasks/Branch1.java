/*
1. Даны два угла треугольника (в градусах). Определить,
существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */
package com.example.tasks;

import java.util.Scanner;

public class Branch1 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int a, b, c;

        Scanner s = new Scanner(System.in);
        System.out.println("write first angle of a triangle in degrees: ");
        a = s.nextInt();

        if (a > 178) {
            System.out.println("this triangle isn't");
        }else {
            System.out.println("write second angle of a triangle in degrees: ");
            b = s.nextInt();
            if ((a + b) > 179) {
                System.out.println("this triangle isn't");
            }else {
                if ((180-(a+b) ==90 || a ==90 || b == 90)) {
                    System.out.println("this triangle is and it's rectangular");
                }else {
                    System.out.println("this triangle is, but it isn't rectangular");
                }
            }
        }
    }
}
