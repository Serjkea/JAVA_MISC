package model;

public class User {

    private static int idCounter = 0;

    private int id;
    private String firstName;
    private String secondName;
    private int age;
    private Gender gender;
    private String country;
    private String city;
    private String address;
    public boolean hasProperty;
    private Property property;

    public User(String firstName, String secondName, int age, Gender gender, String country, String city, String address) {
        this.id = idCounter++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.city = city;
        this.address = address;
        this.hasProperty = false;
    }

    public User(String firstName, String secondName, int age, Gender gender, String country, String city, String address, Property property) {
        this(firstName, secondName, age, gender, country, city, address);
        if (property != null) {
            this.hasProperty = true;
            this.property = property;
        }
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName.trim();
        } else {
            System.out.println("Error: firstName");
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setSecondName(String secondName) {
        if (secondName != null) {
            this.secondName = secondName.trim();
        } else {
            System.out.println("Error: secondName");
        }
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setAge(int age) {
        if ((age > 0) && (age < 100)) {
            this.age = age;
        } else {
            System.out.println("Error: age");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(Gender gender) {
        if (gender != null) {
            this.gender = gender;
        } else {
            System.out.println("Error: gender");
        }
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setCountry(String country) {
        if (country != null) {
            this.country = country;
        } else {
            System.out.println("Error: country");
        }
    }

    public String getCountry() {
        return this.country;
    }

    public void setCity(String city) {
        if (city != null) {
            this.city = city;
        } else {
            System.out.println("Error: city");
        }
    }

    public String getCity() {
        return this.city;
    }

    public void setAddress(String address) {
        if (address != null) {
            this.address = address;
        } else {
            System.out.println("Error: address");
        }
    }

    public String getAddress() {
        return this.address;
    }

    public void setProperty(Property property) {
        if (property != null) {
            this.property = property;
        } else {
            System.out.println("Error: property");
        }
    }

    public Property getProperty() {
        return this.property;
    }

    @Override
    public int hashCode() {
        return this.id*31 + this.firstName.hashCode() + this.secondName.hashCode() + this.age*31 +
               this.gender.hashCode() + this.country.hashCode() + this.city.hashCode() + this.address.hashCode() +
               this.property.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        else if (obj == this) return true;
        else if (obj instanceof User) {
            User tmp = (User) obj;
            return tmp.id == this.id &&
                   tmp.firstName.equals(this.firstName) &&
                   tmp.secondName.equals(this.secondName) &&
                   tmp.age == this.age &&
                   tmp.gender.equals(this.gender) &&
                   tmp.country.equals(this.country) &&
                   tmp.city.equals(this.city) &&
                   tmp.address.equals(this.address) &&
                   tmp.hasProperty == this.hasProperty &&
                   tmp.property.equals(this.property);
        } return false;
    }

    @Override
    public String toString() {
        return "name = " + this.firstName + " " + this.secondName;
    }
}
