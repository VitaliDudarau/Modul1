/*
1. Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */
package com.example.tasks.cycle;

import java.util.Scanner;
import java.math.BigInteger;

public class Cycle1 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int a, n = 0;
        BigInteger sum = new BigInteger("0");

        Scanner s = new Scanner(System.in);
        System.out.println("write a: ");
        a = s.nextInt();

        while (n < a) {
            n += 1 ;
            sum = sum.add(BigInteger.valueOf(n));
        }

        System.out.println("sum of numbers is " + sum);
    }
}