package homework_10.traffic_light;
import static homework_10.traffic_light.LightStates.*;
public class TrafficLight extends State{
    private LightStates state = RED;

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for(int i = 0; i < 5; i++){
            System.out.println("traffic light is " + trafficLight.state);
            trafficLight.changeState();
        }
    }
    @Override
    public LightStates changeState() {
        switch (state) {
            case RED, GREEN -> state = YELLOW;
            case YELLOW -> state = GREEN;
        }
        return state;
    }

}
