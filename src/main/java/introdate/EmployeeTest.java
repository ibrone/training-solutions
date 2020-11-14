package introdate;


public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee (1983,4,23,"Kovács Sanyi");

        System.out.println(employee.getName());
        System.out.println(employee.getDateofBirth());
        System.out.println(employee.getBeginEmployment());


    }

}
