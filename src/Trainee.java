
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
public class Trainee extends Employee {

    private LocalDate practiceStartDate;
    private int practiceLengthInDays;

    public Trainee(LocalDate practiceStartDate, int practiceLengthInDays, String name, String firstName, LocalDate dateOfBirth, BigDecimal salary, Manager manager) {
        super(name, firstName, dateOfBirth, salary, manager);
        this.practiceStartDate = practiceStartDate;
        this.practiceLengthInDays = practiceLengthInDays;
    }

    public LocalDate getPracticeStartDate() {
        return practiceStartDate;
    }

    public int getPracticeLengthInDays() {
        return practiceLengthInDays;
    }

    public void setPracticeLengthInDays(int practiceLengthInDays) {
        this.practiceLengthInDays = practiceLengthInDays;
    }
    
    @Override
    public String toString() {
        return "Trainee: " + super.toString() + ", practiceStartDate: " + practiceStartDate
                + ", practiceLengthInDays: " + practiceLengthInDays;
    }
    
}
