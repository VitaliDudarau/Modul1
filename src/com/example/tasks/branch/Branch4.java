/*
4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие.
 */
package com.example.tasks.branch;

import java.util.Scanner;

public class Branch4 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int a, b, x, y, z;

        Scanner s = new Scanner(System.in);
        System.out.println("write the hole side a : ");
        a = s.nextInt();
        System.out.println("write the hole side b : ");
        b = s.nextInt();
        System.out.println("write the brick side x : ");
        x = s.nextInt();
        System.out.println("write the brick side y : ");
        y = s.nextInt();
        System.out.println("write the brick side z : ");
        z = s.nextInt();

        if ((a > x) && (b > y) || (a > x) && (b > z) || (a > y) && (b > z) ||
                (a > y) && (b > x) || (a > z) && (b > x) || (a > z) && (b > y)) {
            System.out.println("The brick can go through the hole");
        }else {
            System.out.println("The brick CAN'T go through the hole");
        }
    }
}
