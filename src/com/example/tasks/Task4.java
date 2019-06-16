package com.example.tasks;

import java.util.Scanner;

public class Task4 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        double R, y, xd, z;
        int x;
        Scanner s = new Scanner(System.in);

        System.out.println("write double R (format nnn,ddd)");

        R = s.nextDouble();
        x = (int)R;
        xd =  (double)x / 1000;
        y = (R - x) *1000;
        z = Math.round(y) + xd;

        System.out.print("reverse value is ");
        System.out.printf("%8.3f", z);
    }
}
