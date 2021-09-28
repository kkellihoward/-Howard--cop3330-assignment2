/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */

package ex31;

import java.util.Scanner;

    public class heartRate
    {

        public static void main(String[] args)
        {

            Scanner input = new Scanner(System.in);

            int restingHR;
            int age;

            while(true)
            {
                System.out.println("Enter Your Resting Heart Rate: ");
                String rate = input.next();

                if(isNumber(rate))
                {
                    restingHR = Integer.parseInt(rate);
                    break;
                }
                else
                {
                    System.out.println("Invalid Heart Rate");
                }

            }

            while(true)
            {

                System.out.print("Enter Your Age: ");
                String number = input.next();


                if(isNumber(number))
                {
                    age = Integer.parseInt(number);
                    break;
                }
                else
                {
                    System.out.println("Invalid Age");
                }

            }


            System.out.println("Intensity\t"+ "|"+ "\tRate");
            System.out.println("------------|--------------");

            for(int intensity = 55 ; intensity <= 95 ; intensity += 5)
            {
                int Targetheartrate = ((220 - age - restingHR) * intensity/100) + restingHR;
                System.out.println(intensity+"%"+"\t\t\t"+"|\t"+Targetheartrate+" bpm");
            }
            input.close();

        }

        public static boolean isNumber(String input)
        {

            try
            {
                Integer.parseInt(input);
            }catch(Exception e)
            {
                return false;
            }
            return true;
        }

    }

