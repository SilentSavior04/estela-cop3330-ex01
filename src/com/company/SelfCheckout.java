package com.company;
import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {
        float[] price = new float[3];
        float[] quantity;
        quantity = new float[3];
        float subtotal = 0;

        Scanner sc=new Scanner(System.in);
        for(int i = 0; i < 3; i++){

            System.out.printf("Enter the price of item %d: ", (i+1));
            price[i] = sc.nextInt();

            System.out.printf("Enter the quantity of items %d: ", (i+1));
            quantity[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            subtotal += price[i] * quantity[i];
        }

        System.out.println("Subtotal: $" + String.format("%.2f",subtotal));
        System.out.println("Tax: $" + (subtotal * 0.055));
        System.out.println("Total: $" + (subtotal + (subtotal * 0.055)));
    }
}