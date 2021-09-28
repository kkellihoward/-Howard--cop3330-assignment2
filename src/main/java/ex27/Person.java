/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */


package ex27;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Person {
    static String data = "";

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

            System.out.println("Enter the first name: ");
            String first = input.nextLine();

            System.out.println("Enter the last name: ");
            String last = input.nextLine();

            System.out.println("Enter the ZIP code: ");
            String zip = input.nextLine();

            System.out.println("Enter the employee ID: ");
            String ID = input.nextLine();

        validateInput(first, last, zip, ID);

    }


    public static void validateInput(String first, String last, String zip, String ID)
    {
        boolean f = validateFirstName(first);
        boolean l = validateLastName(last);
        boolean idFlag = validateEmployeeID(ID);
        boolean zipFlag = validateZipCode(zip);
        if (f && l && zipFlag && idFlag) {
            data = "There were no errors found.";
        }
        System.out.println(data);
    }

    public static boolean validateFirstName(String first)
    {
        boolean st = true;

        if (first.length() < 2)
        {
            data = data + "The first name must be at least 2 characters long.\n";
            st = false;
        }
        if (first.length() == 0)
        {
            data = data + "The first name must be filled in.\n";
        }
        return st;
    }

    public static boolean validateLastName(String last)
    {
        boolean st = true;
        if (last.length() < 2)
        {
            data = data + "The last name must be at least 2 characters long.\n";
            st = false;
        }
        if (last.length() == 0)
        {
            System.out.println("The last name must be filled in.");
        }
        return st;
    }

    public static boolean validateZipCode(String zip)
    {
        boolean st = true;
        try
        {
            Integer.parseInt(zip);
            if (zip.length() != 5)
            {
                data = data + "The zipcode must be a 5 digit number.\n";
                st = false;
            }
        }
            catch (Exception e)
            {
            data = data + "The zipcode must be a 5 digit number.\n";
            st = false;
            }
        return st;
    }


    public static boolean validateEmployeeID(String ID) {
        String identityNumber;
        identityNumber = "[A-Z]{2}[-][0-9]{4}";
        if (Pattern.matches(identityNumber, ID))
        {
            return true;
        }
        data = data + "The employee ID must be in the format of AA-1234.\n";
        return false;
    }

}