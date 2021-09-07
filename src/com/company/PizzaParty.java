package com.company;
import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {

        int people, pizzas, slices, total, quotient, remainder;
        Scanner sc=new Scanner(System.in);

        System.out.print("Number of people");
        people=sc.nextInt();

        System.out.print("Number of Pizzas");
        pizzas=sc.nextInt();

        System.out.print("Slices of pizza");
        slices=sc.nextInt();
        total=pizzas*slices;

        System.out.println(" " + people + " people with " + pizzas + " pizzas (" + total + "slices)");
        quotient = total / people;

        System.out.println("Each person gets " + quotient + " pieces of pizza");
        remainder = total % people;

        System.out.println("There are " + remainder + " leftover pieces");
    }
}