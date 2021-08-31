package design;

import databases.ConnectToSqlDB;

import java.util.List;

public class FortuneEmployee {

    /**
     * FortuneEmployee class has a main method where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes
     * <p>
     * Demonstrate as many methods as possible to use with proper business work flow.
     * Try to think like a Software Architect/Developer.
     * This application should provide basic employee information services
     * </p>
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     * </p>
     **/
    public static void main(String[] args) throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        System.out.println("====================================================================================");
        System.out.println("===========================WELCOME TO FORTUNE COMPANY===============================");
        System.out.println("====================================================================================");
        System.out.println();

        System.out.println("-----------------------------------EMPLOYEE A---------------------------------------");
        Employee employeeA = new EmployeeInfo("Sabreen", 1, Employee.performance_rates.A, EmployeeInfo.COMPANYNAME_E);
        employeeA.assignDepartment(Employee.depart_titles.ENGINEERING);
        System.out.println("EMPLOYEE A SALARY: $" + employeeA.calculateSalary());
        employeeA.benefitLayout();
        System.out.println(EmployeeInfo.calculateEmployeeBonus(3, employeeA.performance(), employeeA));
        System.out.println(employeeA.toString());
        EmployeeInfo.calculateEmployeePension(employeeA);
        System.out.println();


        System.out.println("-----------------------------------EMPLOYEE B---------------------------------------");
        Employee employeeB = new EmployeeInfo("John", 2, Employee.performance_rates.B, EmployeeInfo.COMPANYNAME_E);
        employeeB.assignDepartment(Employee.depart_titles.FINANCE);
        System.out.println("EMPLOYEE B SALARY: $" + employeeB.calculateSalary());
        employeeB.benefitLayout();
        System.out.println(EmployeeInfo.calculateEmployeeBonus(5, employeeB.performance(), employeeB));
        System.out.println(employeeB.toString());
        EmployeeInfo.calculateEmployeePension(employeeB);
        System.out.println();


        System.out.println("-----------------------------------EMPLOYEE C---------------------------------------");
        Employee employeeC = new EmployeeInfo("Betty", 3, Employee.performance_rates.C, EmployeeInfo.COMPANYNAME_E);
        employeeC.assignDepartment(Employee.depart_titles.BUSINESS);
        System.out.println("EMPLOYEE C SALARY: $" + employeeC.calculateSalary());
        employeeC.benefitLayout();
        System.out.println(EmployeeInfo.calculateEmployeeBonus(4, employeeC.performance(), employeeC));
        System.out.println(employeeC.toString());
        EmployeeInfo.calculateEmployeePension(employeeC);
        System.out.println();

        System.out.println("-----------------------------------EMPLOYEE D---------------------------------------");
        Employee employeeD = new EmployeeInfo("Alex", 4, Employee.performance_rates.D, EmployeeInfo.COMPANYNAME_E);
        employeeD.assignDepartment(Employee.depart_titles.SALES);
        System.out.println("EMPLOYEE D SALARY: $" + employeeD.calculateSalary());
        employeeD.benefitLayout();
        System.out.println(EmployeeInfo.calculateEmployeeBonus(8, employeeD.performance(), employeeD));
        System.out.println(employeeD.toString());
        EmployeeInfo.calculateEmployeePension(employeeD);
        System.out.println();

        // ADD SQL TO LOAD THESE EMPLOYEES AND RETRIEVE DATA
        connectToSqlDB.insertDataFromStringToSqlTable("COMPANY", "employee_name", "performance", "company_name", "salary", "department", (EmployeeInfo) employeeA);
        List<String> letters = connectToSqlDB.readDataBase("COMPANY", "employee_name");
        System.out.println(letters);

        connectToSqlDB.insertEMPLOYEEProfileToSqlTable("COMPANY", "employee_name", "performance", "company_name", "salary", "department", (EmployeeInfo) employeeB);
        List<String> letters2 = connectToSqlDB.readDataBase("COMPANY", "employee_name");
        System.out.println(letters2);

        connectToSqlDB.insertEMPLOYEEProfileToSqlTable("COMPANY", "employee_name", "performance", "company_name", "salary", "department", (EmployeeInfo) employeeC);
        List<String> letters3 = connectToSqlDB.readDataBase("COMPANY", "employee_name");
        System.out.println(letters3);

        connectToSqlDB.insertEMPLOYEEProfileToSqlTable("COMPANY", "employee_name", "performance", "company_name", "salary", "department", (EmployeeInfo) employeeD);
        List<String> letters4 = connectToSqlDB.readDataBase("COMPANY", "employee_name");
        System.out.println(letters4);

    }

}
