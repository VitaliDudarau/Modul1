/*
6. Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области,
и false — в противном случае:
 */
package com.example.tasks;

import java.util.Scanner;

public class Task6 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int x, y;
        boolean a;

        Scanner s = new Scanner(System.in);
        System.out.println("write y");
        y = s.nextInt();

        if(y < -3 || y > 4) {
            a = false;
            System.out.println(a);
        }else {
            System.out.println("write x");
            x = s.nextInt();
            if ((y <= 0 && x >= -4 && x <= 4) || (y > 0 && x >= -2 && x <= 2)) {
                a = true;
                System.out.println(a);
            }else {
                a = false;
                System.out.println(a);
            }
        }
    }
}
