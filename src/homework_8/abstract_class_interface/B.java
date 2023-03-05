package homework_8.abstract_class_interface;

public class B extends Marks{
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    public B(double subject1,double subject2, double subject3, double subject4){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }
    @Override
    public double getPercentage() {
        double total = (subject1+subject2+subject3+subject4)/4;
        return total;
    }
}
