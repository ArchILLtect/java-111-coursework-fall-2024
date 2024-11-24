import java.util.*;
/**
 *  This class is for lab 7. It is used to practice using an ArrayList.
 *
 *  @author Nick Hanson
 *  - Created on: October 20, 2024
*/

public class EmployeeList {

    ArrayList<Employee> employeeList;

    public void run() {
        employeeList = new ArrayList<Employee>();

        Employee employee1 = new Employee();
        employee1.setFirstName("Sohelia");
        employee1.setLastName("Lungile");
        employee1.setEmployeeID(783);
        employeeList.add(employee1);

        Employee employee2 = new Employee();
        employee2.setFirstName("Avetis");
        employee2.setLastName("Hovik");
        employee2.setEmployeeID(2);
        employeeList.add(employee2);

        Employee employee3 = new Employee();
        employee3.setFirstName("Stewfist");
        employee3.setLastName("Leatherblink");
        employee3.setEmployeeID(98328);
        employeeList.add(employee3);

        Employee employee4 = new Employee();
        employee4.setFirstName("Kol'ynn");
        employee4.setLastName("Qeyth");
        employee4.setEmployeeID(27);
        employeeList.add(employee4);

        Employee employee5 = new Employee();
        employee5.setFirstName("Michelina");
        employee5.setLastName("Ivo");
        employee5.setEmployeeID(5271);
        employeeList.add(employee5);

        System.out.println("Here are the employees in the list:");
        System.out.println();
        for (Employee employee : employeeList) {
            System.out.println(employee.displayMessage());
        };
    }
}
