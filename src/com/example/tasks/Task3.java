/*
 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦)∗ 𝑡𝑔 𝑥𝑦 / (𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦)
 */
package com.example.tasks;

import java.util.Scanner;

public class Task3 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int x, y;
        double xr, yr, z;

        Scanner s = new Scanner(System.in);
        System.out.println("write x in degrees");
        x = s.nextInt();
        System.out.println("write y in degrees");
        y = s.nextInt();

        if ((x == 30 && y == 60) || (x == 60 && y == 30) ||  (x == 45 && y == 45)
            || (x == 90 && y == 0) || (x == 0 && y == 90)) {
            System.out.println("division by 0");
        }else {
            xr = x * Math.PI / 180;
            yr = y * Math.PI / 180;
            z = (Math.sin(xr) + Math.cos(yr)) * Math.tan(xr * yr) / (Math.cos(xr) - Math.sin(yr));

            System.out.print("final value is ");
            System.out.printf("%8.4f", z);
        }
    }
}
