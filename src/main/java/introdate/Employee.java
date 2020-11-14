package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    private String name;
    private LocalDate dateofBirth;
    private LocalDateTime beginEmployment;

    public Employee (int year, int month, int day, String name){
        this.dateofBirth = LocalDate.of(year,month,day);
        this.name = name;
        this.beginEmployment = LocalDateTime.now();

    }

    public String getName() {
        return name;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public LocalDateTime getBeginEmployment() {
        return beginEmployment;
    }

    public void setName(String name) {
        this.name = name;
    }
}
