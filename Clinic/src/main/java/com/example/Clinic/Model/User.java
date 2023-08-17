package com.example.Clinic.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User
        // implements UserDetails
        {

    @Id
    @SequenceGenerator(name = "userAppSeqGen", sequenceName = "userAppSeq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userAppSeqGen")
    @Column(name = "id",unique=true, nullable=false)
    private long id;
    @Column
    @NotBlank
    private String name;
    @Column
    @NotBlank
    private String surname;
    @Column(nullable = false)
    @NotBlank
    @Email
    private String email;
    @Column(unique = true, nullable = false)
    @NotBlank
    private String username;
    @Column
    @NotBlank
    @JsonIgnore
    private String password;
    @Column
    @NotNull
    private int phoneNumber;
    @Column
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    public User() {
    }

    public User(long id, String name, String surname, String email, String username, String password, int phoneNumber, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public String getUsername() {
        return username;
    }

//    @Override
//    @JsonIgnore
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    @JsonIgnore
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    @JsonIgnore
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    @JsonIgnore
//    public boolean isEnabled() {
//        return false;
//    }
//
    public void setUsername(String username) {
        this.username = username;
    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }

    public void setPassword(String password) {
        this.password = password;
    }
}
