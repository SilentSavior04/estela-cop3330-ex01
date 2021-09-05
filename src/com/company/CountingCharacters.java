package com.company;
import java.util.Scanner;

public class CountingCharacters {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
     System.out.print("What is the input string? ");
     String str=input.nextLine();
     int count=0;

    for(int i = 0; i < str.length(); i++){
    if(str.charAt(i) != ' ')
    count++;
}
System.out.println("\n"+str+" has " +count+ "characters.");
}
}