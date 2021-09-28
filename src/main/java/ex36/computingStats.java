/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */


package ex36;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;


public class computingStats
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String number;

        do
        {
            System.out.println("Enter a number: ");
            number = input.next();

            if (!number.equals("done"))
            {
                try
                {
                    int num = Integer.parseInt(number);
                    numbers.add(num);
                }
                catch (NumberFormatException ex)
                {
                    //number not added to list
                }
            }
        }

        while (!number.equals("done"));

        StringJoiner joiner = new StringJoiner(",");
        for (Integer integer : numbers) {
            String s = String.valueOf(integer);
            joiner.add(s);
        }
        System.out.printf("Numbers: %s%n", joiner);

        System.out.println(MessageFormat.format("The average is {0}", average(numbers)));

        System.out.println(MessageFormat.format("The minimum is {0}", min(numbers)));

        System.out.println(MessageFormat.format("The maximum is {0}", max(numbers)));

        System.out.println(MessageFormat.format("The standard deviation is {0}", String.format("%.2f", std(numbers))));


    }


    public static double average(ArrayList<Integer> numbers) {
        int total = numbers.stream().mapToInt(number -> number).sum();
        return (double)(total)/numbers.size();
    }



    public static int max(ArrayList<Integer> numbers) {
        int max= numbers.get(0);

        for(int number: numbers)
        {
            if(number > max)
            {
                max = number;
            }
        }

        return max;
    }


    public static int min(ArrayList<Integer> numbers)
    {
        int min= numbers.get(0);

        for(int number: numbers)
        {
            if(number < min)
            {
                min = number;
            }
        }

        return min;
    }


    public static double std(ArrayList<Integer> numbers) {
        double mean = average(numbers);

        double sum;
        sum = 0;
        sum += numbers.stream().mapToInt(num -> num).mapToDouble(num -> Math.pow((num - mean), 2)).sum();

        return Math.sqrt(sum/numbers.size());
    }

}