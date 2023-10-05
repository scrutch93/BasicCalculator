package com.pluralsight;

import java.util.Scanner;
public class BasicCalculator {

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = keyboard.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = keyboard.nextInt();


        System.out.println("Possible Calculations" );
        System.out.println(" (A)dd" );
        System.out.println(" (S)ubtract" );
        System.out.println(" (M)ultiply" );
        System.out.println(" (D)ivide" );
        String operation = keyboard.nextLine();
        System.out.println("Please select an option : " + operation );











    }






}
