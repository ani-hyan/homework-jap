package homework_8.inheritance;

public class Address {
    private String city;
    private String street;
    private int apartment;

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
