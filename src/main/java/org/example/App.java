/*
 *  UCF COP3330 Summer 2021 Assignment 9
 *  Copyright 2021 Steven Ortiz
 */

//You will need to purchase 2 gallons of paint to cover 360 square feet.
package org.example;
import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    private static int lengthint(){

        System.out.print("In feet, how long is the ceiling? ");
        String length = in.nextLine();
        return Integer.parseInt(length);

    }
    private static int widthint(){

        System.out.print("In feet, how wide is the ceiling? ");
        String widthint = in.nextLine();
        return Integer.parseInt(widthint);

    }
    public static void main(String[] args){

        double gallonsint = 350;

        int lengthint = lengthint();
        int widthint = widthint();

        int totalArea = lengthint * widthint;

        double paint = totalArea / gallonsint;

        int total = (int) Math.ceil(paint);

        System.out.println("You will need to purchase "+total+" gallons of paint to cover "+totalArea+" square feet");

    }
}