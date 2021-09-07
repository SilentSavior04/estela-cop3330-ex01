package com.company;

import java.awt.geom.Area;
import java.util.Scanner;

public class AreaofRectangleRm {
    public static void main(String[] args) {
        double length,width,area;

        Scanner  sc=new Scanner(System.in);

        System.out.print(" Length of room in feet ");
        length=sc.nextDouble();

        System.out.print(" Width of room in feet ");
        width=sc.nextDouble();

        area=length*width;

        System.out.println(" Dementions of "+length+" feet by "+width+" feet ");
        System.out.println(" The area is "+area+" square feet");

        area=area/10.764;

        System.out.println(" The area is "+area+" square meter(s) ");
    }
}
