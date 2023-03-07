package homework_10.traffic_light;
import delete_me.light.TestTraffic;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static homework_10.traffic_light.LightStates.*;
public class TrafficLight extends State{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input color" );
        String color = sc.next();
        TestTraffic obj = new TestTraffic();
        obj.changeState(color);
    }

    @Override
    public void changeState(String color) throws InterruptedException {
        for (int i = 2; i <= 4; i++) {
            switch (delete_me.light.TrafficLight.valueOf(color)){
                case YELLOW:
                    System.out.println("current color: " + color);
                    TimeUnit.SECONDS.sleep(YELLOW.getSec());
                    color = String.valueOf(GREEN);
                    break;
                case GREEN:
                    System.out.println("current color: " + color );
                    TimeUnit.SECONDS.sleep(GREEN.getSec());
                    color = String.valueOf(RED);
                    break;
                case RED:
                    System.out.println("current color: " + color);
                    TimeUnit.SECONDS.sleep(RED.getSec());
                    color = String.valueOf(YELLOW);
                    break;
            }

        }
    }
}
