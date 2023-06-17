package models.address;

public class Address {
    private String street;
    private String number;
    private String complement;
    private String neighbourhood;
    private String city;
    private String state;

    public Address(String street, String number, String complement, String neighbourhood, String city, String state) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighbourhood = neighbourhood;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
