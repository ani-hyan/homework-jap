package homework_10.coffee;

public enum CoffeeSize {
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large");

    private String name;

    CoffeeSize(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void info(){
        System.out.println("Size is " + getName());
    }
}
