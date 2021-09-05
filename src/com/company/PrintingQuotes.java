package com.company;

import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter quote:");
        String a = input.nextLine();
        System.out.println("Enter the auther:");
        String b = input.nextLine();
        System.out.println("" +a+ ""+"\n"+b);
    }
}
