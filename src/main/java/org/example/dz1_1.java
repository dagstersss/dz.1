package org.example;

import java.util.Scanner;

public class dz1_1 {
    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //321
        //123

        //a b c
        //a = 3 b = 2 -> a = 2 b = 3
        if (a > b) {
            //надо поменять местами a и b
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = c;
            c = b;
            b = temp;
        }
        if (a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}