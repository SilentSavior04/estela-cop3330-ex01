package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int current_year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What age do you plan to retire? ");
        int retire_age = in.nextInt();

        System.out.print("What is your current age? ");
        int age = in.nextInt();

        int years_left = retire_age - age;
        System.out.println("You have " + years_left + " years left until you can retire");

        int retire_year = current_year + years_left;
        System.out.println("It's " + current_year + ", so you may retire in " + retire_year + ".");



    }
}
