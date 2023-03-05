package homework_10.season;

import java.util.Scanner;

public enum Season {
    SPRING(12,29),
    SUMMER(29, 40),
    AUTUMN(8, 23),
    WINTER(-5,12 );

    private double lowest;
    private double highest;

     Season(double lowest, double highest){
        this.lowest = lowest;
        this.highest = highest;
    }
    public double getLowest(){
         return lowest;
    }

    public double getHighest(){
        return highest;
    }

}
