/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */


package ex37;

import java.util.*;
import java.util.ArrayList;
import java.util.Random;


class passwordGenerator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        List<Character> special = new ArrayList<>();
        String specialChars = "!@#&()–[{}]:;'?/*$^+=<>";

        Random random = new Random();

        for (char character : specialChars.toCharArray())
        {
            special.add(character);
        }

        String nums = "0123456789";
        for (char character : specialChars.toCharArray())
        {
            special.add(character);
        }
        List<Character> numbers = new ArrayList<>();
        for (char character : nums.toCharArray())
        {
            numbers.add(character);
        }

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        List<Character> alphabets = new ArrayList<>();
        for (char character : letters.toCharArray())
        {
            alphabets.add(character);
        }

        System.out.print("What's the minimum length? ");
        int length = scan.nextInt();

        System.out.print("How many special characters? ");
        int specialChar = scan.nextInt();

        System.out.print("How many numbers? ");
        int numAmount = scan.nextInt();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length - specialChar - numAmount; i++)
        {
            password.append(alphabets.get(random.nextInt(alphabets.size())));
        }

        for (int i = 0; i < specialChar; i++)
        {
            password.append(special.get(random.nextInt(special.size())));
        }

        for (int i = 0; i < numAmount; i++)
        {
            password.append(numbers.get(random.nextInt(numbers.size())));
        }
        char[] arr = password.toString().toCharArray();
        for (int i = arr.length - 1; i > 0; i--)
        {
            int j = random.nextInt(i + 1);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        password = new StringBuilder(new String(arr));

        System.out.println("Your password is " + password);
    }
}