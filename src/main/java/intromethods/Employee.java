package intromethods;

public class Employee {

private String name;
private int hiringYear;
private int salary;
private int raise;



    public Employee(String name, int hiringYear, int salary) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseSalary (int raise){
        salary += raise;
    }

    public String toString() {
        return "Alkalmazott:" + name +
                ", Felvételének dátuma=" + hiringYear +
                ", Fizetése=" + salary +"Huf";

}}
