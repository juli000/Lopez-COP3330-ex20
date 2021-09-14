/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Julio Lopez
 */
package org.example;
import java.text.DecimalFormat;
import java.time.Year;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        System.out.println( "What is the order amount?" );
        Scanner s = new Scanner(System.in);
        String amount = s.nextLine();
        System.out.println("What is the state? ");
        String state = s.nextLine();
        Double a = Double.valueOf(amount);
        DecimalFormat d = new DecimalFormat("0.00");
        Double total = a;
        Double tax = a*.055;
        if(state.equals("WI")){
            System.out.println("The subtotal is $" + d.format(a));
            System.out.println("The tax is $" + d.format(tax));
            total = total + tax;
        }
        System.out.println("The total is $" + d.format(total));





    }
}
