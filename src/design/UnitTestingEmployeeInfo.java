package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {


    public static void main(String[] args) {
        // Use this class to write unit tests for all user-defined methods that you have implemented in this package.

        Employee employee = new EmployeeInfo("Sabreen", 1, Employee.performance_rates.A, EmployeeInfo.COMPANYNAME_A);
        employee.assignDepartment(Employee.depart_titles.FINANCE);
        System.out.println(employee.toString());
        System.out.println("EMPLOYEE A SALARY: $" + employee.calculateSalary());
        //ASSERT
        double actualResult = employee.calculateSalary();
        double expectedResult = 50000.0;
        try {
            Assert.assertEquals(actualResult, expectedResult, "NOPE TRY AGAIN");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println();
        employee.benefitLayout();
        System.out.println(EmployeeInfo.calculateEmployeeBonus(3, employee.performance(), employee));

        //ASSERT
        actualResult = EmployeeInfo.calculateEmployeeBonus(3, employee.performance(), employee);
        expectedResult = 15000.0;
        try {
            Assert.assertEquals(actualResult, expectedResult, "NOPE TRY AGAIN");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println();

        //ASSERT
        //System.out.println(EmployeeInfo.calculateEmployeePension(employee));
        // FOR DATES DO May,2015 to August,2017
        actualResult = EmployeeInfo.calculateEmployeePension(employee);
        expectedResult = 5000.0;
        try {
            Assert.assertEquals(actualResult, expectedResult, "NOPE TRY AGAIN");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println();

    }
}
