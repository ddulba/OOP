package pl.javapoz25.OOP1;

public class Address {

    String street;
    String city;
    String country;
    Integer flatNo;
    Integer homeNo;

    public Address(String newStreet, String newCity, String newCountry, Integer newFlatNo, Integer newHomeNo) {
        this.street = newStreet;
        this.city = newCity;
        this.country = newCountry;
        this.flatNo = newFlatNo;
        this.homeNo = newHomeNo;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getFlatNo() {
        return this.flatNo;
    }

    public void setFlatNo(Integer flatNo) {
        this.flatNo = flatNo;
    }

    public Integer getHomeNo() {
        return this.homeNo;
    }

    public void setHomeNo(Integer homeNo) {
        this.homeNo = homeNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", flatNo=" + flatNo +
                ", homeNo=" + homeNo +
                '}';
    }
}
