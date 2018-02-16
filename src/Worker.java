
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
public class Worker extends Employee {

    private LocalDate employmentDate;
    private BigDecimal bonus;

    public Worker(LocalDate employmentDate, BigDecimal bonus, String name, String firstName, LocalDate dateOfBirth, BigDecimal salary, Manager manager) {
        super(name, firstName, dateOfBirth, salary, manager);
        this.employmentDate = employmentDate;
        this.bonus = bonus;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " employmentDate:" + employmentDate + ", bonus: " + bonus;
    }

}
