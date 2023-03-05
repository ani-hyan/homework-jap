package homework_10.season;

import java.util.Scanner;

/**
 * Create an enum called "Season" that contains values for the
 * four seasons (e.g. Spring, Summer, Fall, Winter).
 * Each season should have an associated temperature range.
 * Write a program that prompts the user to enter a temperature,
 * and then prints the name of the season that corresponds to that temperature.
 */

public class TestSeason {
    public static void main(String[] args) {
        TestSeason ts = new TestSeason();
        ts.correspondingSeason();
    }
    public void correspondingSeason(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature ");
        double t = sc.nextDouble();
        if(t >= Season.SPRING.getLowest() && t <= Season.SPRING.getHighest()){
            System.out.println("Corresponding season is " + Season.SPRING.toString());
        }
        else if(t >= Season.SUMMER.getLowest() && t <= Season.SUMMER.getHighest()){
            System.out.println("Corresponding season is " + Season.SUMMER.toString());
        }
        else if(t >= Season.AUTUMN.getLowest() && t <= Season.AUTUMN.getHighest()){
            System.out.println("Corresponding season is " + Season.AUTUMN.toString());
        }
        else if(t >= Season.WINTER.getLowest() && t <= Season.WINTER.getHighest())
            System.out.println("Corresponding season is " + Season.WINTER.toString());
        else
            System.out.println("Unknown");
    }
}
