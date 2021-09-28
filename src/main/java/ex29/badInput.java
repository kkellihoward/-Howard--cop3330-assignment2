/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */


package ex29;

import java.util.Scanner;
import java.lang.Integer;
public class badInput
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        boolean flag=false;
        while(true)
        {
            try
            {
                System.out.println("What is the rate of return? ");
                int r= Integer.parseInt(input.next());
                System.out.println("It will take "+(72/r)+" years to double your initial investment.");
                flag=true;
            }
            catch(ArithmeticException ex)
            {
                System.out.println("Sorry, please enter a number greater than 0");
            }

            catch(NumberFormatException ex)
            {
                System.out.println("Sorry, that is not a valid input, please enter numbers only");
            }

            if(flag)
            {
                return;
            }

        }
    }
}





