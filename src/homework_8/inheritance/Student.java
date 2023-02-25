package homework_8.inheritance;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Student(){
        name = null;
        id = -1;
    }
}
