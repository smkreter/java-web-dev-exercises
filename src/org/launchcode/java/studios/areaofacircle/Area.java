package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static double calcCircleArea(double radiusCircle){
        double areaCircle = radiusCircle * radiusCircle * 3.1415927;
        return areaCircle;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put in the circle area");
        double requestedRadius = input.nextDouble();
        System.out.println("The area of your circle is " + calcCircleArea(requestedRadius));
        /*
        System.out.println("Put in the circle area");
        double radiusCircle = input.nextDouble();
        double areaCircle = radiusCircle * radiusCircle * 3.1415927;
        System.out.println("The area of your circle is " + areaCircle);

         */
    }


}
