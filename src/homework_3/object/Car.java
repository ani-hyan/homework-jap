package homework_3.object;

public class Car {
    private String model;
    private String color;
    private double currentSpeed = 0;
    private boolean isEngineStart;

    public Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    public void stopEngine(){
        isEngineStart = false;
    }

    public void startEngine(){
        isEngineStart = true;
    }
}
