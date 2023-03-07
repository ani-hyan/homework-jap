package homework_10.traffic_light;

public abstract class State {
    public abstract void changeState(String s) throws InterruptedException;
}
