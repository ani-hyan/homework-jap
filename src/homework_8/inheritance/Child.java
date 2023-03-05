package homework_8.inheritance;

public class Child extends Parent{
    @Override
    public void showMessage() {
        super.showMessage();
        System.out.println("Hello child class");
    }
}
