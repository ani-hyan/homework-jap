package homework_10.planet;

public enum Planet {
    MERCURY("Mercury", 0.330, 57.9),
    VENUS("Venus", 4.87, 108.2),
    EARTH("Earth", 5.97, 149.6),
    MARS("Mars", 0.642, 227.9),
    JUPITER("Jupiter", 1898, 778.3),
    SATURN("Saturn", 568, 1427.0),
    URANUS("Uranus", 86.8, 2871.0),
    NEPTUNE("Neptune", 102, 4497.1);

    private final String name;
    private final double mass;
    private final double distance;

    Planet(String name, double mass, double distance){
        this.name = name;
        this.mass = mass;
        this.distance = distance;
    }

    public void print(){
        System.out.println("name of the planet: " + name + "\nmass of the " + name + " : " + mass);
    }
}
