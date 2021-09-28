/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */

package ex33;

import java.util.Random;
import java.util.Scanner;

public class eightBall {
        public static void main(String[] args) {
            String[] list = {"Yes","No","Maybe","Ask again later","In the near future"};

            Random random = new Random();
            Scanner input= new Scanner(System.in);
            String repeat;
            do{

                System.out.print("What is your question? ");
                input.nextLine();
                System.out.println(list[random.nextInt(list.length)]);
                System.out.print("Would you like to ask another question? (Answer y or n): ");
                repeat = input.nextLine();
            }while (repeat.equalsIgnoreCase("y"));

        }
}


