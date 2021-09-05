package com.company;
import java.util.Scanner;

public class MadLib {
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter Noun: ");
        String noun = keyboardInput.nextLine();
        System.out.print("Enter a Verb : ");
        String Verb = keyboardInput.nextLine();
        System.out.print("Enter Adjective: ");
        String Adjective = keyboardInput.nextLine();
        System.out.print("Enter Adverb: ");
        String Adverb = keyboardInput.nextLine();

        System.out.println("Do you " +Verb +" your" + Adjective +" "+ noun +" "+ Adverb+" ? That's kind of dumb, if I'm  honest.");
    }
}
