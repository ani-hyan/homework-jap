package homework_10.planet;

/**
 * Create an enum called "Planet" that contains values
 * for the planets in the Solar System. Each planet
 * should have a name, a mass, and a distance from the Sun.
 * Write a program that prints the name and mass of each planet
 */
public class TestPlanet {
    public static void main(String[] args) {
        Planet.EARTH.print();
        Planet.VENUS.print();
        Planet.MARS.print();
        Planet.URANUS.print();
        Planet.NEPTUNE.print();
    }
}
