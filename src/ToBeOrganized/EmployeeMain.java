package ToBeOrganized;


import java.util.*;

class EmployeeMain {

    public static void main(String[] args) {

        EmployeeSort[] employees = new EmployeeSort[4];

        employees[0] = new EmployeeSort("Tom", 45, 80000);
        employees[1] = new EmployeeSort("Sam", 56, 75000);
        employees[2] = new EmployeeSort("Alex", 30, 120000);
        employees[3] = new EmployeeSort("Peter", 25, 60000);

        System.out.println("Before sorting: " + Arrays.toString(employees));

        Arrays.sort(employees);

        System.out.println("After sorting: " + Arrays.toString(employees));

    }
}
