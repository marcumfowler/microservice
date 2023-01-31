package com.magmutual.microservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {
    private @Id @GeneratedValue Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String profession;
    private String country;
    private String city;
    private String date;

    User(String firstName, String lastName, String email, String profession, String city, String country, String date) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.profession = profession;
        this.city = city;
        this.country = country;
        this.date = date;
    }

    public int getId() {
        return this.id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getEmail() {return this.email;}
    public String getProfession() {return this.profession;}
    public String getCity() {return this.city;}
    public String getCountry() {return this.country;}
    public String getDate() {return this.date;}
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {this.email = email;}
    public void setProfession(String profession) {this.profession = profession;}
    public void setCountry(String country) {this.country = country;}
    public void setCity(String city) {this.city = city;}
    public void setDate(String date) {this.date = date;}

    @Override
    public boolean equals(Object object) {

        if (this == object)
            return true;
        if (!(object instanceof User user))
            return false;
        return Objects.equals(this.id, user.id) && Objects.equals(this.firstName, user.firstName)
                && Objects.equals(this.lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + this.id + ", name='" + this.firstName + this.lastName + '\'' + '}';
    }
}

