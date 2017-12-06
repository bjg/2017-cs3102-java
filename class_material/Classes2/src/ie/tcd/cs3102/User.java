package ie.tcd.cs3102;


public class User extends Object {
    enum Type {
        MANAGER,
        EMPLOYEE,
        CUSTOMER
    }

    private String name;
    private String username;
    private String email;
    private String phone;
    private Address address;
    private Type type;

    User() {
        this.type = Type.CUSTOMER;
    }

    User(String name, String username, String email) {
        this();
        this.name = name;
        this.username = username;
        this.email = email;
    }

    User(String name, String username, String email, String phone) {
        this(name, username, email);
        this.phone = phone;
    }

    User(String name, String username, String email,
         String phone, Address address) {
        this(name, username, email, phone);
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s, %s <%s>", username, name, email);
        //return username + " " + name + " <" + email + ">";
    }
}
