package homework_8.inheritance;

public class SubClass extends SuperClass {
    private String message = "Hello SubClass";

    public String getMessage(){
        System.out.println(super.getMessage());
        return message;
    }
}
