package homework_10.day_of_week;

import java.util.Scanner;

/**
 * Create an enum called "DayOfWeek" that contains values
 * for the days of the week. Write a Java program that prompts
 * the user to enter a day of the week, and then prints whether
 * that day is a weekday or a weekend day.
 */
public class TestDayOfWeek {
    public static void main(String[] args) {
        System.out.println("Enter a day");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        if(str.equals(DayOfWeek.SUNDAY.toString()) || str.equals(DayOfWeek.SATURDAY.toString()))
            System.out.println(str + " is a weekend day");
        else
            System.out.println(str + " is a weekday");
    }
}
