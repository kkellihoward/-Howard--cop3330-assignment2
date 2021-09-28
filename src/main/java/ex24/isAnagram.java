/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */


package ex24;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class isAnagram {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

            System.out.println("Enter two strings and I will say if they are anagrams:");

            System.out.println("Enter the first string:");
            String w1=input.next();

            System.out.println("Enter the second string");
            String w2=input.next();

            if(Anagram(w1,w2))
            {
                System.out.println(w1 + "and" + w2 + "are anagrams");
            }

            else
            {
                System.out.println(w1 + "and" + w2 + "are not anagrams");
            }
    }

        public static boolean Anagram(@NotNull String str1, @NotNull String str2)
    {
            if(str1.length()!=str2.length()) return false;
            int [] freq = new int[26];
            for(int i=0 ; i< str1.length(); i++)
            {
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
            }

            for(int x : freq)
            {
                if(x!=0) return false;
            }

            return true;
    }
}



