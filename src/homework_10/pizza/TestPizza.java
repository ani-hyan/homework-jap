package homework_10.pizza;

import java.util.Scanner;

/**
 * Create an enum called "Topping" that contains values for various pizza toppings
 * (e.g. pepperoni, mushrooms, onions, sausage, etc.).
 * Create a second enum called "PizzaSize" that contains values
 * for various pizza sizes (e.g. small, medium, large).
 * Write a program that prompts the user to choose a pizza size
 * and a number of toppings, and then calculates the price of the pizza
 * based on the size and number of toppings.
 */
public class TestPizza {
    public static void main(String[] args) {
        TestPizza tp = new TestPizza();
        tp.totalAmount();
    }

    public void totalAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many toppings would you like? (1-5) -> " );
        int numberOfToppings = sc.nextInt();
        System.out.print("What size pizza would you like? (small, medium, large) -> ");
        double sizePrice = getSizePrice(sc.next());
        double totalAmount = numberOfToppings * sizePrice;

        System.out.println("Your pizza will cost $" + totalAmount);
    }

    public double getSizePrice(String str){
        if(str.toLowerCase().equals("small"))
            return Size.SMALL.getPrice();
        else if(str.toLowerCase().equals("medium"))
            return Size.MEDIUM.getPrice();
        else
            return Size.LARGE.getPrice();
    }
}
