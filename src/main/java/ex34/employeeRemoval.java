/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kelli Howard
 */



package ex34;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class employeeRemoval {

    public static void main(String[] args)
    {
        ArrayList<String> employeelist = new ArrayList<>(asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));
        printEmployees(employeelist);

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter an employee name to remove: ");
        String nameRemove = input.nextLine();

        employeelist.remove(nameRemove);

        System.out.println();
        printEmployees(employeelist);
    }
    public static void printEmployees(@NotNull ArrayList<String> employees)
    {
        System.out.println("There are "+employees.size()+" employees: ");
        for(String employee:employees)
        {
            System.out.println(employee);
        }
    }
}