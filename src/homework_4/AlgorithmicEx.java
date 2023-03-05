package homework_4;

import java.util.Random;

public class AlgorithmicEx {
    public static void main(String[] args) {
        AlgorithmicEx obj = new AlgorithmicEx();
        //1.
        System.out.println(obj.primeFactor(64));

        //2.
        System.out.println(obj.randomIsEven());

        //3.
        obj.random();

        //4.
        System.out.println(obj.rice(2,3,9));
    }

    /**
     * 1.1.	Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilos each),
     * write a method that returns true if it is possible to make a package with goal kilos of rice
     * @param small
     * @param big
     * @param goal
     * @return
     */
    boolean rice(int small, int big, int goal){
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

    /**
     * 2. Write a method that calculates the largest prime factor of a given number.
     * @param n
     * @return
     */
    int primeFactor(int n) {
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


    /**
     * 3.Write a program that generates a random number between 1 and 100
     * (you can use the Random ( ) method from the Math class.
     * the next step check whether it is an even or an odd number.
     * @return
     */
    boolean randomIsEven() {
        Random rd = new Random();
        int n = rd.nextInt(101);
        System.out.println("random number is: " + n);
        System.out.print("is even: ");
        return n % 2 == 0;
    }

    /**
     * 4.Write a program that will use the while loop to find the largest
     * and smallest number from the set of 10 randomly drawn integers from 1 to 100.
     */
    void random() {
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
