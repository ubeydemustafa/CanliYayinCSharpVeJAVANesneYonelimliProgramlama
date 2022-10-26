public class Customer {
    public int Id;
    public String FirstName;
    public String LastName;
    public String City;

    public Customer() {
        System.out.println("musteri nesnesi baslatildi");
    }

    public Customer(int id, String firstName, String lastName, String city) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        City = city;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

}
