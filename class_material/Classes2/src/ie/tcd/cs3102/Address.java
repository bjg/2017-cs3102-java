package ie.tcd.cs3102;

public class Address {
    String zipcode;

    @Override
    public String toString() {
        return "Address{" +
                "zipcode='" + zipcode + '\'' +
                '}';
    }

    public Address(String zipcode) {
        this.zipcode = zipcode;
    }
}
