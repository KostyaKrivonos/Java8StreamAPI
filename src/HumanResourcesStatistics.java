
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
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
public final class HumanResourcesStatistics {
    
    public static List<PayrollEntry> payroll(List<Employee> employees) {
        return employees.stream()
                .map((t) -> {
                    if (t instanceof Worker) {
                        return new PayrollEntry(t, t.getSalary(), ((Worker) t).getBonus());
                    } else 
                        return new PayrollEntry(t, t.getSalary(), null);                   
                })
                .collect(Collectors.toList());
    }
    
    public static List<PayrollEntry> subordinatesPayroll(Manager manager) {
        return manager.getSubordinates().stream()
                .map((t) -> {
                    if (t instanceof Worker) {
                        return new PayrollEntry(t, t.getSalary(), ((Worker) t).getBonus());
                    } else 
                        return new PayrollEntry(t, t.getSalary(), null);                   
                })
                .collect(Collectors.toList());
    }
    
    public static BigDecimal bonusTotal(List<Employee> employees) {
		return employees.stream()
                        .map((Employee t) -> {
                            if(t instanceof Worker){
                                return ((Worker) t).getBonus();
                            }
                            else return new BigDecimal(0.0);
                        })
                        .reduce((t, c) -> t.add(c))
                        .get();
    }
    
    public static Worker findEmployeeBigExperience(List<Employee> employees){
        return (Worker)employees.stream()
                .filter((t) -> t instanceof Worker)                                
                .min((t, c) -> ((Worker)t).getEmploymentDate().compareTo(((Worker)c).getEmploymentDate()))
                .get();
    }
    
    public static BigDecimal findMaxSalary(List<Employee> employees){
        return employees.stream()               
                .max((t, c) -> t.getSalary().compareTo(c.getSalary()))
                .get().getSalary();
    }
    
    public static BigDecimal findMinSalaryBonus(List<Employee> employees){
        return employees.stream()
                .filter((t) -> t instanceof Worker)               
                .map((t) -> new PayrollEntry(t, ((Worker) t).getSalary(),((Worker) t).getBonus()))
                .min((t, c) -> t.getSalaryPlusBonus().compareTo(c.getSalaryPlusBonus()))
                .get().getSalaryPlusBonus();
    }
    
    public static List<Employee> findEmployeesName(Manager man, String name){
        return man.getAllSubordinates().stream()
                .filter((t) -> t.getName().startsWith(name))
                .collect(Collectors.toList());
    }
    
    public static List<Employee> findEmployeesSalary(List<Employee> employees){
        return employees.stream()
                .map((t) -> {
                    if (t instanceof Worker) {
                        return new PayrollEntry(t, t.getSalary(), ((Worker) t).getBonus());
                    } else 
                        return new PayrollEntry(t, t.getSalary(), null);                   
                })
                .filter((t) -> t.getSalaryPlusBonus().compareTo(BigDecimal.valueOf(1000.0)) > 0)
                .map((t) -> t.getEmployee())
                .collect(Collectors.toList());
    }
}
