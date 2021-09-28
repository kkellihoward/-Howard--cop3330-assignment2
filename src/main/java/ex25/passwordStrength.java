/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */

package ex25;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class passwordStrength
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password and I will tell you the strength of the entered password");
        String userinput = input.nextLine();
        passwordValidator(userinput);
    }

       public static void passwordValidator(@NotNull String userinput)
    {
        boolean hasLowerCase= false, hasUpperCase= false, hasNumber= false, specialChar = false;

        Set<Character> set = new HashSet<>(
                Arrays.asList('!', '@', '$', '#', '^', '%', '&', '*'));

        for(char p: userinput.toCharArray()) {
            if (Character.isLowerCase(p))
                hasLowerCase = true;

            if (Character.isUpperCase(p))
                hasUpperCase = true;

            if (Character.isDigit(p))
                hasNumber = true;

            if (set.contains(p))
                specialChar = true;


        }


        if (hasNumber && hasLowerCase || hasUpperCase && specialChar
                && (userinput.length() >= 8))
            System.out.println("Your password is very strong");

        else if ((hasLowerCase || hasUpperCase || specialChar)
                && (userinput.length() >= 8))
            System.out.println("Your password is strong");

        else if(hasLowerCase || hasUpperCase)
            System.out.print("Your password is weak");

        else if(hasNumber)
            System.out.print("Your password is very weak");

        else
            System.out.println("Invalid Input, please enter password");


    }


}
