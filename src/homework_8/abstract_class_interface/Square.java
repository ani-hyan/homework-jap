package homework_8.abstract_class_interface;

public class Square extends Shape{
    @Override
    public void draw() {
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    @Override
    public void erase() {

    }
}
