/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */


package ex32;

import java.util.Scanner;

public class numberGame {
        public static void main(String[] args) {

            System.out.println("Let's play Guess the Number!");
            int secretNumber;
            int guess;
            Scanner input = new Scanner(System.in);
            secretNumber = (int) (Math.random() * 1000);

            while(true)
            {

                int total=0;
                System.out.print("Enter the difficulty level(1, 2, or  3): ");
                int level=input.nextInt();

                if(level==1)
                {
                    secretNumber = (int) (Math.random() * 10 + 1);
                    System.out.println("I have my number. Whats your guess between 1-10");
                }
                if(level==2)
                {
                    secretNumber = (int) (Math.random() * 100 + 1);
                    System.out.println("I have my number. Whats your guess between 1-100");
                }
                if(level==3)
                {
                    secretNumber = (int) (Math.random() * 1000 + 1);
                    System.out.println("I have my number. Whats your guess between 1-1000");
                }

                do
                {
                    guess = input.nextInt();
                    total++;
                    if (guess == secretNumber)
                    {
                        System.out.println("You got it in "+total+"  guesses!\n");
                    }
                    if (guess < secretNumber)
                        System.out.println("Too low. Guess again: ");
                    if (guess > secretNumber)
                        System.out.println("Too high. Guess again: ");

                }while (guess != secretNumber);
                System.out.print("Do you wish to play again (Y/N)?  ");
                char s=input.next().charAt(0);
                if(s=='Y' || s=='y')
                    return;
            }

        }
    }