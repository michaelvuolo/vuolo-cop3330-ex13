/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // read values
        System.out.print("Enter the principle: ");
        double principle = input.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        // calculate worth
        int worth = (int)Math.round(principle * (1 + (rate / 100 * years)));

        // output results
        System.out.print("After " + years + " years at " + rate + "%, the investment will be worth $" + worth + ".");
    }
}
