package com.company;
import java.util.Scanner;

public class PaintCalc {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and width of the ceiling in feet");

        float length = sc.nextFloat();
        float width = sc.nextFloat();
        float area = length*width;

        int result = (int) Math.ceil(area / 350);
        System.out.println("You need to purchase "+result+" gallons of paint to cover "+area+" square feet");
    }
}