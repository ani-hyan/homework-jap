package homework_8.abstract_class_interface;

public abstract class Problem8 {
    public Problem8(){
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();

    public void normalMethod(){
        System.out.println("This is a normal method of abstract class");
    }
}
