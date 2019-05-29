package com.exemple.tasks;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int a, b, c;
        double x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.println("write a");
        a = s.nextInt();
        if (a == 0) {
            System.out.println("division by 0");
        }else {
            System.out.println("write b");
            b = s.nextInt();
            System.out.println("write c");
            c = s.nextInt();
            x = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / (2 * a));
            y = Math.pow(a, 3) * c - Math.pow(b, -2);
            z = x - y;
            System.out.println("final value is " + z);
        }
    }
}

