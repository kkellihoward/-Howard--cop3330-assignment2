/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */


package ex30;

public class multiplicationTable
{
    public static void main(String[] args)
    {
        int rows = 12, cols = 12;
        for(int i = 1;i<=rows;i++)
        {
            System.out.print(i + "\t");
            for(int j = 2;j<=cols;j++)
            {
                System.out.print((i*j) + "\t");
            }
            System.out.println();
        }
    }
}
