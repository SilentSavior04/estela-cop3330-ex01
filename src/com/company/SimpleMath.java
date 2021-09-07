package com.company;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First Number ");
        int num1 = sc.nextInt();

        System.out.println("Second Number ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    }
}
