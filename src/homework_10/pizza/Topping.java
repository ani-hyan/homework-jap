package homework_10.pizza;

public enum Topping {
    PEPPERONI(1),
    MUSHROOMS(1),
    ONIONS(1),
    SAUSAGE(1),
    BLACK_OLIVES(1);

    private int price;
    Topping(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
