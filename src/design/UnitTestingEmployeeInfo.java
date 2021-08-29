package design;


public class UnitTestingEmployeeInfo  {


    public static void main(String[] args) {
        // Use this class to write unit tests for all user-defined methods that you have implemented in this package.

        Employee employee = new EmployeeInfo("Sabreen", 1, Employee.performance_rates.A, EmployeeInfo.COMPANYNAME_A);
        employee.assignDepartment(Employee.depart_titles.FINANCE);
        System.out.println("EMPLOYEE A SALARY: $"+employee.calculateSalary());
        employee.benefitLayout();

        System.out.println(EmployeeInfo.calculateEmployeeBonus(3, employee.performance(), employee));
        System.out.println(employee.toString());
        //System.out.println(employee.employeeId());
        EmployeeInfo.calculateEmployeePension(employee);
    }
}
