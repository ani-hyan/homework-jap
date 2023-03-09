package homework_11;

import java.io.*;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws Exception {
        Exceptions obj = new Exceptions();

//        1.
        obj.reciprocal();

//        2.
        obj.sumOfIntegers();

//        3.
        obj.division();

//        4.
        obj.fileContent();

//        5.
        obj.squareRoot();

//        7.
        obj.getAge();

//        9.
        obj.quotient();
    }


    /**
     * 1. Write a program that reads an integer from the user
     * and prints its reciprocal.
     * If the user enters 0, the program should throw an exception
     * and print an error message
     */
    void reciprocal() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer -> ");
        int number  = sc.nextInt();
        if(number == 0)
            throw new ArithmeticException("Can't compute reciprocal of 0");
        else
            System.out.println("Reciprocal is: " + 1.0/number);
    }

    /**
     * 2.	Write a program that accepts an array of integers from the user
     * and calculates the sum of its elements. If the user enters a non-integer value,
     * the program should throw an exception and print an error message
     * @throws Exception
     */
    void sumOfIntegers() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of integers -> ");
        int size = sc.nextInt();
        int sum = 0;
        System.out.println("Input integers for the array ");
        for (int i = 0; i < size; i++){
            try{
                sum += sc.nextInt();
            }
            catch (Exception e){
                throw new Exception("Can only accept integer values");
            }
        }
        System.out.println("Sum of elements: " + sum);
    }

    /**
     * 3. Write a program that reads two numbers from the user and divides them.
     * If the user enters 0 as the second number, the program should
     * throw an exception and print an error message
     * @throws ArithmeticException
     */
    void division() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number -> ");
        double n1 = sc.nextDouble();
        System.out.print("Input second number -> ");
        double n2 = sc.nextDouble();
        if(n2 == 0)
            throw new Exception("Error: Second number can't be 0");
        else
            System.out.println(n1 + "/" + n2 + " = " + n1/n2);
    }

    /**
     * 4. Write a program that reads a file name from the user and prints its contents
     * to the console. If the file does not exist or cannot be opened,
     * the program should throw an exception and print an error message
     */
    void fileContent() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name -> ");
        String fileName = sc.nextLine();

        try(Scanner input = new Scanner(new File(fileName))){
            while (input.hasNextLine())
            {
                System.out.println(input.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error: File not found");
        }
    }

    /**
     * 5. Write a program that reads an integer number and  calculates and prints
     * its square root. If the number is  invalid or negative,
     * print "Invalid number". In all  cases finally print "Good bye".
     */
    void squareRoot(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input non negative integer -> ");
        try{
            int n = sc.nextInt();
            if(n < 0)
                System.out.println("Error: Invalid number");
            else
                System.out.println(Math.sqrt(n));

        }
        catch (Exception e){
            System.out.println("Error: Invalid number");
        }
        finally {
            System.out.println("Good bye");
        }
    }


    /**
     * 7.	Write a program that prompts the user to enter their age.
     * If the user enters an age that is negative or greater than 120,
     * the program should throw an exception and print an error message
     * @throws Exception
     */
    void getAge() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age -> ");
        int age = sc.nextInt();
        if(age < 0 || age > 120)
            throw new Exception("Error: Not a valid age number");
        else
            System.out.println("Your age is -> " + age);
    }

    /**
     * 9.Write a program that reads two integers from the user and
     * calculates their quotient. If the second integer is 0 or negative,
     * the program should throw an exception and print an error message
     * @throws Exception
     */
    void quotient() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number -> ");
        int n1 = sc.nextInt();
        System.out.print("Input second number -> ");
        int n2 = sc.nextInt();
        if(n2 == 0)
            throw new Exception("Error: Second number can't be 0");
        else
            System.out.println("The quotient -> " + n1/n2);
    }


}
