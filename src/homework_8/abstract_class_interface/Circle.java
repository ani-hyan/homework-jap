package homework_8.abstract_class_interface;

public class Circle extends Shape{
    @Override
    public void draw() {
        double distance = 0;
        for (int row = 0; row <= 2 * 2; row++) {
            for (int col = 0; col <= 2 * 2; col++) {
                distance = Math.sqrt((row - 2) * (row - 2) + (col - 2) * (col - 2));
                if (distance > 2 - 0.5 && distance < 2 + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    @Override
    public void erase() {

    }
}
