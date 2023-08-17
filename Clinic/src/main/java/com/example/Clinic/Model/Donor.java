package com.example.Clinic.Model;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Donor extends User{
    @Column
    private String occupation;
    @Embedded
    private Adress adress;
    @Column
    private String education;

    public Donor() {
    }

    public Donor(String occupation, Adress adress, String education) {
        this.occupation = occupation;
        this.adress = adress;
        this.education = education;
    }

    public Donor(long id, String name, String surname, String email, String username, String password, int phoneNumber, Gender gender, String occupation, Adress adress, String education) {
        super(id, name, surname, email, username, password, phoneNumber, gender);
        this.occupation = occupation;
        this.adress = adress;
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
