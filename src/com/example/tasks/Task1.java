package com.example.tasks;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        double a, b, c, z;
        Scanner s = new Scanner(System.in);
        System.out.println("write a");
        a = s.nextDouble();
        System.out.println("write b");
        b = s.nextDouble();
        System.out.println("write c");
        c = s.nextDouble();
        z = ((a - 3) * b / 2) + c;
        System.out.println("final value is " + z);
    }
}