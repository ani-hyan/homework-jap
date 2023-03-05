package homework_8.abstract_class_interface;

public class Triangle extends Shape{
    @Override
    public void draw() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public void erase() {

    }
}
