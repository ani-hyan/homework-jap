package homework_4;

import java.util.Random;

public class AlgorithmicEx {
    public static void main(String[] args) {
        System.out.println(primeFactor(64));
        System.out.println(randomIsEven());
        random();
        System.out.println(rice(2,3,9));
    }

    public static boolean rice(int small, int big, int goal){
        if(small + big*5 <  goal)
            return false;
        else if(big*5 >= goal){
            goal -= goal/5 * 5; //goal = goal - goal/5*5
            if(goal > small)
                return false;
            return true;
        }
        return true;
    }

    public static int primeFactor(int n) {
        if(n <= 1)
            return 1;
        int i = 2;
        int theLargest = 2;
        while (i <= n) {
            if (n % i == 0) {
                theLargest = i;
                n /= i;
                i--;
            }
            i++;
        }
        return theLargest;
    }


    public static boolean randomIsEven() {
        Random rd = new Random();
        int n = rd.nextInt(101);
        System.out.println("random number is: " + n);
        System.out.print("is even: ");
        return n % 2 == 0;
    }
    public static void random() {
        Random rd = new Random();
        int smallest = rd.nextInt(101);
        int largest = rd.nextInt(101);

        if (smallest > largest)
            smallest = smallest ^ largest ^ (largest = smallest);
        System.out.println("random n is: " + smallest);
        System.out.println("random n is: " + largest);

        int i = 0;
        while (i < 8) {
            int n = rd.nextInt(101);
            if (n < smallest )
                smallest = n;
            else if (n > largest)
                largest = n;
            i++;
            System.out.println("random n is: " + n);
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
