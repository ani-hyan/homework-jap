package homework_8.inheritance;

public class Car {
    private int passengerCount;
    private char engineType;

    public Car(){
        passengerCount = 2;
        engineType = 'a';
    }
    public int getPassengerCount(){
        return passengerCount;
    }

    public char getEngineType(){
        return engineType;
    }

    public void setPassengerCount(int count){
        if(count >= 2)
            passengerCount = count;
        else
            System.out.println("Invalid input");
    }

    public void setEngineType(char engineType){
        if((engineType >= 'a' && engineType <= 'z' )||(engineType >= 'A' && engineType <= 'Z'))
            this.engineType = engineType;
        else
            System.out.println("Invalid input");
    }
}
