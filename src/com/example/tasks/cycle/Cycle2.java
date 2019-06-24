/*
2.  Вычислить значения функции на отрезке [а,b] c шагом h:
    {x, если x > 2;
     -x, если x <= 2}
 */
package com.example.tasks.cycle;

import java.util.Scanner;
import java.math.BigDecimal;

public class Cycle2 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int a, b;
        double h;
        BigDecimal x, y;

        Scanner s = new Scanner(System.in);
        System.out.println("write bottom line a: ");
        a = s.nextInt();
        System.out.println("write upper line b: ");
        b = s.nextInt();
        System.out.println("write step value h: ");
        h = s.nextDouble();

        x = BigDecimal.valueOf(a);

        while (x.compareTo(BigDecimal.valueOf(b)) < 1 ) {
            if (x.compareTo(BigDecimal.valueOf(2)) == 1) {
                y = x;
            }else {
                y = x.multiply(BigDecimal.valueOf(-1));
            }
            System.out.print("when x = ");
            System.out.printf("%6.2f", x);
            System.out.print(" value y = ");
            System.out.printf("%6.2f", y);
            System.out.println("");
            x = x.add(BigDecimal.valueOf(h));
        }
    }
}