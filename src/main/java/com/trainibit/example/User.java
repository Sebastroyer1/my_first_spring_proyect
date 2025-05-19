package com.trainibit.example;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
public class User {
    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setDateOfBirth(Date dateOfBirth){this.dateOfBirth = dateOfBirth;}

    public String getFirstName(){ return this.firstName;}
    public String getLastName(){return this.lastName;}
    public Date getDateOfBirth(){return this.dateOfBirth;}

    public void printName(){
        System.out.println("Name: " + firstName + " " + lastName+ " Nacio el:  " + dateOfBirth);
    }
}

