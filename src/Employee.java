
import java.math.BigDecimal;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Алёшечка
 */
public abstract class Employee extends Person {

    private BigDecimal salary;
    private Manager manager;

    public Employee(String name, String firstName, LocalDate dateOfBirth, BigDecimal salary, Manager manager) {
        super(name, firstName, dateOfBirth);
        this.salary = salary;
        this.manager = manager;
        if(manager != null)
        addInListSubordinates();
    }
    
    private void addInListSubordinates(){
        manager.getSubordinates().add(this);
        manager.getAllSubordinates().add(this); 
    }
    
    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Manager getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary: " + salary + ", manager: " + manager.getName() + " " + manager.getSurName();
    }
}
