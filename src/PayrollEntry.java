
import java.math.BigDecimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Алёшечка
 */
public final class PayrollEntry {
    
    private final Employee employee;
    private final BigDecimal salaryPlusBonus;
    
    public PayrollEntry(Employee employee, BigDecimal salary, BigDecimal bonus) {
        this.employee = employee;
        if(salary == null){
            salary = salary.valueOf(0.0);            
        }
        if(bonus == null){
            bonus = bonus.valueOf(0.0);
        }
        this.salaryPlusBonus = salary.add(bonus);
    }

    public BigDecimal getSalaryPlusBonus() {
        return salaryPlusBonus;
    }

    public Employee getEmployee() {
        return employee;
    }
    
}
