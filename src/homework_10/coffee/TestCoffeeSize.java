package homework_10.coffee;

/**
 * Create an enum called "CoffeeSize" that contains values for small,
 * medium, and large coffee sizes. Write a program that prints
 * the name and ordinal value of each size.
 */
public class TestCoffeeSize {
    public static void main(String[] args) {
        CoffeeSize cs1 = CoffeeSize.SMALL;
        cs1.info();
        CoffeeSize cs2 = CoffeeSize.MEDIUM;
        cs2.info();
        CoffeeSize cs3 = CoffeeSize.LARGE;
        cs3.info();

    }
}
