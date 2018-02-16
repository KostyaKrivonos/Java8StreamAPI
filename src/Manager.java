
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Алёшечка
 */
public class Manager extends Worker {

    private List<Employee> subordinates;
    private List<Employee> allSubordinates ;

    public Manager(LocalDate employmentDate, BigDecimal bonus, String name, String firstName, LocalDate dateOfBirth, BigDecimal salary, Manager manager) {
        super(employmentDate, bonus, name, firstName, dateOfBirth, salary, manager);
        this.subordinates = new ArrayList<>();
        this.allSubordinates = new ArrayList<>();
//        if(manager != null)
//        addEmployee(manager);
    }
 
    public void addEmployee(Manager man) {        
        if (man != null) 
            //man.getAllSubordinates().addAll(subordinates);
            man.getAllSubordinates().addAll(allSubordinates);

//        man.getAllSubordinates().stream()
//                .distinct()
//                .collect(Collectors.toList());
    }
    
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public List<Employee> getAllSubordinates() {
        return allSubordinates;
    }

    @Override
    public String toString() {
        return "Menager: " + super.toString();
    }
    
}
