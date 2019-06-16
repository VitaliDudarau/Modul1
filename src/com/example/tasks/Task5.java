/*
 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */
package com.example.tasks;

import java.util.Scanner;

public class Task5 {
        @SuppressWarnings("resource")
        public static void main(String[] args) {

            int t, b, c, d;

            Scanner s = new Scanner(System.in);
            System.out.println("write time in seconds");
            t = s.nextInt();

            b = t / 3600;
            c = (t%3600) / 60;
            d = t%60;

            System.out.println(b + " h. " + c + " m. " + d + " s. ");
        }
    }


