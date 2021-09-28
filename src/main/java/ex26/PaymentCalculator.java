/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */


package ex26;


import java.util.Scanner;

import static java.lang.Math.log;

public class PaymentCalculator
    {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("What is your balance? ");
            double b = input.nextDouble();

            System.out.print("What is the APR on the card (as a percent)? ");
            double apr = input.nextDouble();

            apr =(apr / 100);

            System.out.print("What is the monthly payment you can make? ");
            double p = input.nextDouble();

            int months = calculateMonthsUntilPaidOff(b, apr, p);

            System.out.println("It will take " + months + " months to pay off this card.");
    }

    public static int calculateMonthsUntilPaidOff(double b, double apr, double p) {

        double i = apr/365;

        return (int) Math.ceil((-1 / 30.0) * log(1 + b / p * (1 - Math.pow(1 + i, 30))) / log(1 + i));

    }

}