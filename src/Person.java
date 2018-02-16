
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Алёшечка
 */
public abstract class Person {
    private String name;
    private String surName;
    private LocalDate dateOfBirth;
    

    public Person(String name, String firstName, LocalDate dateOfBirth) {
        this.name = name;
        this.surName = firstName;
        this.dateOfBirth = dateOfBirth;   
    }
   
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    
    public int getAge(){
           return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }

    @Override
    public int hashCode() {
        // 17  67 31
        int value = 31;
        value = 31*value + name.hashCode();
        value = 31*value + surName.hashCode();
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (!(obj instanceof Person)) 
            return false;       
        Person person = (Person) obj;
        return this.name != null
                && this.name.equals(person.getName())
                && this.surName != null
                && this.surName.equals(person.getSurName());
    }
    
    @Override
    public String toString() {
        return "name: " + name + ", surName: " + surName + ", age: " + getAge();
    }   
}
