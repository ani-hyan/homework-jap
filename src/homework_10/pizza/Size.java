package homework_10.pizza;

public enum Size {
    SMALL(5.0),
    MEDIUM(6.5),
    LARGE(8.0);

    private double price;
    Size(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
