package homework_10.traffic_light;

public enum LightStates {
    RED(5),
    YELLOW(2),
    GREEN(5);

    public int getSec() {
        return sec;
    }

    private int sec;
    LightStates(int sec){
        this.sec = sec;
    }
}
