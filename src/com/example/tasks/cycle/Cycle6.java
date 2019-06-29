/*
6.  Вывести на экран соответствий между символами и
их численными обозначениями в памяти компьютера.
 */
package com.example.tasks.cycle;

public class Cycle6 {

    public static void main(String[] args) {

        char a;

        for(int i = 32; i <= 127; i++) {
            a = (char) i;
            System.out.println("character cod of symbol " + a + " = " + i);
        }
    }
}