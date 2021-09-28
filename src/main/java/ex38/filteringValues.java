/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */

package ex38;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class filteringValues {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a list of numbers, separated by spaces: ");
            String data = input.nextLine();

            String[] list = data.split("");

            Integer[] evenList = filterEvenNumbers(list);


            System.out.print("The even numbers are ");
            for(int i = 0; evenList.length > i; i++){
                if(evenList.length - 1 > i){
                    System.out.print(evenList[i] + "");
                }
                else
                {
                    System.out.print(evenList[i] + ".");
                }
            }
        }

        public static Integer[] filterEvenNumbers(String[] list) {

            ArrayList<Integer> newList = new ArrayList<>();

            for (String s : list) {
                int num = parseInt(s);

                if (num % 2 == 0) {
                    newList.add(num);
                }
            }

            Integer[] arr = new Integer[newList.size()];
            arr = newList.toArray(arr);


            return arr;
        }
    }