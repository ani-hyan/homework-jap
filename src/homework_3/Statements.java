package homework_3;

import java.math.BigInteger;

public class Statements {
    public static void main(String[] args){
        System.out.println(isEven(67));
        System.out.println(isPositive(8));
        betweenTheRange(30);
        System.out.println(isDivisible(35));
        System.out.println(isSeven(173));
        System.out.println(isInsideTheCircle(6,9));
        theLargest(3,-1, 5);
        System.out.println(isLeapYear(404) + " leap");

        int x = 0;
        while(x++ < 10){
            if(x == 8)
                break;
        }
        System.out.println(x);

        x = 2;
        int y = 5;
        while (x < 10){
            x++;
        }

        x = 15;
        while (x < 10){
            x = x--;
        }
        System.out.println(x);
        numbers();
        firstDigit(567);

        x = 1;
        y = 0;
        while(x < 5 && y < 10){
            System.out.println("x + y = " + x+y);
            x++;
            y++;
        }

        square(4);
        System.out.println(sum(20));

       product(100);
       sumOfDigits(3674);

    }

    public static boolean isEven(int x){
        return (x%2 == 0);
    }

    public static boolean isPositive(int x){
        return x >= 0;
    }

    public static void betweenTheRange(int x){
        if(x < 8 && x > 5)
            System.out.println("is between 8 and 5");
        else if(x < 20 && x > 15)
            System.out.println("is between 20 and 15");
        else
            System.out.println("Outside");
    }

    public static boolean isDivisible(int x){
        return ((x % 5 == 0) && (x % 7 == 0));
    }

    public static boolean isSeven(int x){
        return (x / 10 % 10 == 7);
    }

    public static boolean isInsideTheCircle(int x, int y){
        return x*x + y*y < 25;
    }

    public static void theLargest(int x, int y, int z){
        if( x >= y && x >= z)
            System.out.println("the largest is: " + x);
        else if(y >= x && y >= z)
            System.out.println("the largest is: " + y);
        else
            System.out.println("the largest is: " + z);
    }

    public static boolean isLeapYear(int x){
        return ((x % 4 == 0) && (x % 100 != 0)) || (x % 400 == 0);
    }



    public static void numbers(){
        for(int i = 1; i <= 200; i++)
            System.out.print(i + ", ");
        System.out.println();
    }

    public static void firstDigit(int x){
        int first = 0;
        while(x > 0){
            first = x % 10;
            x /= 10;
        }
        System.out.println("first digit is: " + first);
    }

    public static void square(int x){
        for (int i = 0; i < x; i++) {
            for (int k = 0; k < x; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static int sum(int n){
        int sum = 0;
        for(int i = 5; i <= n; i+= 5){
            sum += i;
        }
        return sum;
    }
    public static void product(int n){
        BigInteger pr = new BigInteger("1");
        for(int i = 10; i <= n&& i < 99; i += 2){
            pr = pr.multiply(BigInteger.valueOf(i));
        }
        System.out.println("product is: " + pr);
    }
    public static void sumOfDigits(int x){
        int sum = 0;
        while(x != 0){
            sum += x % 10;
            x /= 10;
        }
        System.out.println("sum of digits: " + sum);
    }

}
