package homework_8;

import homework_8.abstract_class_interface.*;
import homework_8.abstract_class_interface.SubClass;
import homework_8.inheritance.*;

import java.util.concurrent.TransferQueue;

public class Test {
    public static void main(String[] args) {
        //1.
//        Parent c = new Child();
//        c.showMessage();

        //2.
//        SubClass subClass = new SubClass();
//        System.out.println(subClass.getMessage());

        //4.
//        Truck truck = new Truck();
//        System.out.println(truck.getCapacity());
//        System.out.println(truck.getEngineType());
//        System.out.println(truck.getPassengerCount());



        //Interface, Abstract class

        //1.
//        ChildOne childOne = new ChildOne();
//        ChildTwo childTwo = new ChildTwo();
//
//        childOne.message();
//        childTwo.message();

        //2.
//        Square square = new Square();
//        square.draw();
//        Triangle triangle = new Triangle();
//        triangle.draw();
//        Circle circle = new Circle();
//        circle.draw();

        //7.
//        A a = new A(60, 20, 40);
//        B b = new B(75, 90, 80, 100);
//        System.out.println(a.getPercentage());
//        System.out.println(b.getPercentage());

        //8.
//        SubClass subClass = new SubClass();
//        subClass.a_method();
//        subClass.normalMethod();

        //9.
        Cats cats = new Cats();
        cats.cats();

        Dogs dogs = new Dogs();
        dogs.dogs();

    }

}
