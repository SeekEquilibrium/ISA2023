package com.example.Clinic.Model;


import javax.persistence.Column;

public class Adress {
    @Column
    private String street;
    @Column
    private String city;
    @Column
    private String country;

    public Adress() {
    }

    public Adress(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
