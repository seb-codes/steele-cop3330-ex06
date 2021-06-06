/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */
package org.example;

import java.util.Scanner;
import java.util.Calendar;

public class RetirementCalculator {
    public static void main(String[] args) {
        Scanner getAge = new Scanner(System.in);
        Scanner getOldAge = new Scanner(System.in);

        // let me know how old you are
        System.out.print("What is your current age? ");
        String age = getAge.nextLine();

        // let me when you plan to retire
        System.out.print("At what age would you like to retire? ");
        String oldage = getOldAge.nextLine();

        // Can an int even hold how old you are. probably not. but okay
        Integer age_num = Integer.parseInt(age);
        Integer oldage_num = Integer.parseInt(oldage);

        Integer years_left = oldage_num - age_num;

        System.out.println("You have "+ years_left + " years left until you can retire.");

        // Thanks google
        Calendar rightNow = Calendar.getInstance();
        Integer year = rightNow.get(Calendar.YEAR);
        System.out.println(year);

        // Do you really want to see this? I would cry.
        Integer ret_year = year + years_left;
        System.out.println("It's "+year+" , so you can retire in " + ret_year  +".");
    }
}
