/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */


package ex35;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class pickWinner
{
    public static void main(String[] args) {
        String str;
        ArrayList<String> names = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a name : ");
            str = scanner.nextLine();
            names.add(str);
        }while(!str.isEmpty());
        names.remove(names.size() - 1);
        System.out.println(MessageFormat.format("The winner is {0}", names.get(random.nextInt(names.size()))));
    }
}