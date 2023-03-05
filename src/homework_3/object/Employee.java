package homework_3.object;

public class Employee {
    private String name;
    private String department;
    private String gender;
    private int id;
    private int age;

    public Employee(String name, String department, String gender, int age, int id){
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.id = id;
        this.age = age;
    }

    public void printEmployee(){
        System.out.println("name: " + name + "\n" +
                "gender: " + gender + "\n id: " + id + "\n age " + age +
                "\n department: " + department);
    }
}
