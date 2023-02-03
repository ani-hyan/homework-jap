package homework_3.object;

public class Main {
    public static void main(String[] args){
        City Yerevan = new City("Yerevan", 1092000);
        City Moscow = new City("Moscow", 126000000);
        City NewYork = new City("New York", 1968000000);
        City Paris = new City("Paris", 214000000);

        Rectangle r = new Rectangle(5, 14);
        System.out.println(r.calculateArea());

        Employee e1 = new Employee("n1", "d1", "male", 23, 2235252 );
        Employee e2 = new Employee("n2", "d1", "male", 23, 4656252);
        Employee e3 = new Employee("n3", "d2", "female", 45,  22222);

        Car c1 = new Car("Mercedes C203", "white" );
        Car c2 = new Car("Mercedes S505", "white");
    }
}
