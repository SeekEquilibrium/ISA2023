package com.example.Clinic.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

@Entity
public class Donor extends User{
    @Column
    private String occupation;
    @Embedded
    private Adress adress;
    @Column
    private String education;




}
