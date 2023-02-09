package homework_5;

import java.util.Random;
import java.util.Scanner;

public class homework_5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        multTable();
        System.out.println(power());
        System.out.println(recursive(5, 0));
        System.out.println(reverse());
        System.out.println(isPrime());
        add();
        numberOf();
        largestSmallest();
        armstrong();
        System.out.println(sumOfSeries1());
        System.out.println(sumOfSeries2());
        guess();
        rectangle(5);
        triangle1(5);
        triangle2(5);
        triangle3(5);
        triangle4(5);
        triangle5(5);
        System.out.println(sin(1,10));
        System.out.println(cos(1,4));
    }

    public static void multTable(){
        int m = sc.nextInt();
        while(m < 0){
            System.out.println("enter positive number!");
            m = sc.nextInt();
        }

        for(int i = 1; i <= 10; i++)
            System.out.println(m + " * " + i + " = " + m*i);
    }

    public static int power(){
        System.out.println("enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = 1;
        if(b == 0)
            return 1;
        while(b > 0){
            k *= a;
            b--;
        }
        return k;
    }
    public static int recursive(int a, int b){
        if(b < 1)
            return 1;
        else
            return a * recursive(a, --b);
    }

    public static int reverse(){
        System.out.println("input your number: ");
        int a = sc.nextInt();
        int reverse = 0;
        while(a > 0){
            reverse = (reverse + a%10) * 10; //reverse = reverse * a/10 * 10
            a /= 10;
        }
        return reverse/10;
    }

    public static boolean isPrime(){
        System.out.println("checking if the number is prime: ");
        int n = sc.nextInt();
        int i = 2;
        while(i < n/2){
            if(n % i == 0)
                return false;
            i++;
        }
        return true;
    }

    public static void add(){
        boolean b = false;
        do{
            System.out.println("enter two numbers: ");
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(m+n);
            System.out.println("want to repeat?");
            b = sc.nextBoolean();
        }
        while (b == true);
    }

    public static void numberOf(){
        int n = 0;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        boolean b = false;
        do{
            System.out.println("enter the number: ");
            n = sc.nextInt();
            if(n > 0)
                positive++;
            else if (n < 0)
                negative++;
            else
                zero++;
            System.out.println("Continue? true/false");
        }
        while (b);
        System.out.println("positive: " + positive);
        System.out.println("negative: " + negative );
        System.out.println("zero: " + zero);
    }

    public static void largestSmallest(){
        boolean b = false;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int n = 0;

        do{
            System.out.println("enter the number: ");
            n = sc.nextInt();
            if(n < smallest)
                smallest = n;
            if(n > largest)
                largest = n;
            System.out.println("Continue? true/false");
            b = sc.nextBoolean();

        }while (b);
        System.out.println("largest: " + largest);
        System.out.println("smallest: " + smallest);

    }

    public static void armstrong(){
        for (int i = 0; i< 500; i++) {
            int check = 0;
            int  rem = 0;
            int sum = 0;
            check = i;
            for(check = i; check > 0; check /= 10){
                rem = check % 10;
                sum = sum + (rem * rem * rem);
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    public static double sumOfSeries1(){
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        double sum = 0;
        for(double i = 1; i <= n; i++){
            sum += 1/i;
        }
        return sum;
    }

    public static double sumOfSeries2(){
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        double sum = 0;
        for(double i = 1; i <= n; i+=2){
            sum += 1/i;
        }
        for(double i = 2; i <= n; i+=2){
            sum -= 1/i;
        }
        return sum;
    }

    public static void guess(){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int n = rd.nextInt();
        System.out.println(n);

        System.out.println("enter your guess: ");
        int m = sc.nextInt();
        do{
            if(m < n) {
                System.out.println("Too low, try again");
            }
            else if (m > n) {
                System.out.println("Too high, try again");
            }
            System.out.println("enter your guess: ");
            m = sc.nextInt();
        }while (m != n);
        System.out.println("Success!");
    }

    public static void rectangle(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void triangle1(int n){
        for(int i = 0; i <= n; i++){
            for(int k = 0; k < i; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void triangle2(int n){
        for (int i = 0; i<n; i++){
            for(int k = n-i; k > 0; k--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void triangle3(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangle4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = i; k>= 1; k--){
                System.out.print(i);
            }
            for(int l = 2; l <= i; l++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void triangle5(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = i; k>= 1; k--){
                System.out.print(k);
            }
            for(int l = 2; l <= i; l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }

    /*
    sinx = x - x^3/3! + x^5/5! - x^7/7!...
       */
    public static double sin(int x, int n){
        double result = 0.0;
        int sign = -1;

        for(int i = 1; i <= n; i += 2){
            double fact = 1;
            int power = 1;
            for(int k = 1; k <= i; k++){
                fact *= k;
                power *= x;
            }
            sign *= -1;
            result += sign * power/fact;
        }
        return result;
    }

    public static double cos(int x, int n){
        double result = 1;
        int sign = -1;

        for(int i = 2; i <= n; i += 2){
            double fact = 1;
            int power = 1;
            for(int k = 1; k <= i; k++){
                fact *= k;
                power *= x;
            }
            result += sign * power/fact;
            sign *= -1;
        }
        return result;
    }
}
