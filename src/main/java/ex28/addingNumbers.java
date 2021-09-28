/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */

package ex28;


import java.util.Scanner;

public class addingNumbers
{
    public static void main(String[] args)
    {
        {
            System.out.print("Enter 5 numbers: ");
        }

            Scanner input = new Scanner(System.in);

            int n = 0;

            for (int i = 0; i <5; i++)
                {
                    n += input.nextInt();
                }
        System.out.println("The sum of given 5 numbers is " + n);
    }
}

