package homework_8.inheritance;

public class Truck extends Car{
    private int capacity;

    public Truck(){
        super();
        capacity = 0;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
