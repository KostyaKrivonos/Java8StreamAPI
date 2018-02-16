
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
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
public class Test {

    public static void main(String[] args) {

        Manager boss = new Manager(LocalDate.of(2000, 02, 02), BigDecimal.valueOf(20.0), "boss", "boss", LocalDate.of(1992, 02, 02), BigDecimal.valueOf(20.0), null);
        Manager man1 = new Manager(LocalDate.of(2000, 02, 02), BigDecimal.valueOf(20.0), "man1", "man1", LocalDate.of(1992, 02, 02), BigDecimal.valueOf(20.0), boss);        
        
        Worker w1 = new Worker(LocalDate.of(2000, 01, 01), BigDecimal.valueOf(50.0), "ff", "qq", LocalDate.of(1993, Month.MARCH, 12), BigDecimal.valueOf(20.0), boss);
        Worker w2 = new Worker(LocalDate.of(2000, 01, 01), BigDecimal.valueOf(50.0), "dd", "ee", LocalDate.of(1990, Month.MARCH, 12), BigDecimal.valueOf(20.0), boss);
        Trainee tr1 = new Trainee(LocalDate.of(2000, 01, 01), 120, "tr1", "tr1",LocalDate.of(1990, Month.MARCH, 12), BigDecimal.valueOf(20.0), man1);
        Trainee tr2 = new Trainee(LocalDate.of(2000, 01, 01), 120, "tr2", "tr2",LocalDate.of(1990, Month.MARCH, 12), BigDecimal.valueOf(20.0), man1);
        
        Manager man2 = new Manager(LocalDate.of(2000, 02, 02), BigDecimal.valueOf(20.0), "man2", "man2", LocalDate.of(1992, 02, 02), BigDecimal.valueOf(20.0), man1);
        Worker w3 = new Worker(LocalDate.of(2000, 01, 01), BigDecimal.valueOf(50.0), "w3", "w3", LocalDate.of(1990, Month.MARCH, 12), BigDecimal.valueOf(20.0), man2);
        Trainee tr3 = new Trainee(LocalDate.of(2000, 01, 01), 120, "tr3", "tr3",LocalDate.of(1990, Month.MARCH, 12), BigDecimal.valueOf(20.0), man2);
        
        man2.addEmployee(man1);
        man1.addEmployee(boss);
        
        boss.getSubordinates().forEach((emp) -> System.out.println(emp + ""));
        System.out.println("");
        boss.getAllSubordinates().forEach((emp) -> System.out.println(emp + ""));
        System.out.println("________________");
        man1.getSubordinates().forEach((emp) -> System.out.println(emp + ""));
        System.out.println("");
        man1.getAllSubordinates().forEach((emp) -> System.out.println(emp + ""));

    }
}
