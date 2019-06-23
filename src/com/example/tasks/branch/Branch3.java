/*
3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
Определить, будут ли они расположены на одной прямой.
 */
package com.example.tasks.branch;

import java.util.Scanner;

public class Branch3 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int x1, y1, x2, y2, x3, y3, a, b;

        Scanner s = new Scanner(System.in);
        System.out.println("write point A, coordinate x1: ");
        x1 = s.nextInt();
        System.out.println("write point A, coordinate y1: ");
        y1 = s.nextInt();
        System.out.println("write point B, coordinate x2: ");
        x2 = s.nextInt();
        System.out.println("write point B, coordinate y2: ");
        y2 = s.nextInt();
        System.out.println("write point B, coordinate x3: ");
        x3 = s.nextInt();
        System.out.println("write point A, coordinate y3: ");
        y3 = s.nextInt();

        a = (x1 - x3) * (y2 - y3);
        b = (x2 - x3) * (y1 - y3);

        if (a == b) {
            System.out.println("The points lie in the same straight");
        }else {
            System.out.println("The points DON'T lie in the same straight");
        }



        System.out.println("max value is ");
    }
}