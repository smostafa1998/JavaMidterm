package design;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeInfo implements Employee {


    /*
    This class should implement the Employee interface. You can do that by directly implementing it, however you must
        also implement the Employee interface into an abstract class. So create an Abstract class then inherit that
        abstract class into this EmployeeInfo class. Once you're done with designing EmployeeInfo class,
        go to FortuneEmployee class to apply all the fields and attributes.

    Important: YOU MUST USE:
        - OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
        - Use all kind of keywords (super, this, static, final, etc)
        - Implement nested class below (DateConversion)
        - Use Exception Handling
     */

    /*
     * Make sure to declare and use static, non-static & final fields
     */


    static String companyName;
    int employeeId;
    String employeeName;
    String performance;
    String department;
    final static String COMPANYNAME_A = "APPLE";
    final static String COMPANYNAME_B = "GOOGLE";
    final static String COMPANYNAME_C = "INSTAGRAM";
    final static String COMPANYNAME_D = "FACEBOOK";
    final static String COMPANYNAME_E = "FORTUNE";



    /*
     You must implement the logic for below 2 methods and
        following 2 methods are prototype as well for other methods need to be design,
        as you will come up with the new ideas.
     */

    /*
     You must have/use multiple constructors
     */
    public EmployeeInfo() {
        super();
    }

    public EmployeeInfo(int employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeInfo(String name, int employeeId) {
        this.employeeName = name;
        this.employeeId = employeeId;
    }

    public EmployeeInfo(String name, int employeeId, performance_rates performance) {
        this.employeeName = name;
        this.employeeId = employeeId;
        this.performance = performance.toString();
        this.department = null;
    }

    public EmployeeInfo(String name, int employeeId, performance_rates performance, String companyName) {
        this.employeeName = name;
        this.employeeId = employeeId;
        this.performance = performance.toString();
        this.department = null;
        EmployeeInfo.companyName = companyName;
    }
    /*
     You need to implement the logic of this method as such:
        It should calculate Employee bonus based on salary and performance.
        It should return the total yearly bonus.
            Example: 10% of salary for best performance, 8% of salary for average performance and so on.
            You can set arbitrary number for performance, so you probably need to send 2 arguments.
     * 10,000/yr 10 yrs 1K a year for performance (performance active)

     */

    public static double calculateEmployeeBonus(int numberOfYearsWithCompany, String performance, Employee e) {
        double total = 0;

        if (performance.equals(performance_rates.A.toString())) {
            System.out.print("GOOD JOB BIG BONUS FOR U: $");
            total = (e.calculateSalary() * 0.1) * numberOfYearsWithCompany;

        } else if (performance.equals(performance_rates.B.toString())) {
            System.out.print("NICE JOB HERE U GO A BONUS: $");
            total = (e.calculateSalary() * 0.08) * numberOfYearsWithCompany;

        } else if (performance.equals(performance_rates.C.toString())) {
            System.out.print("STARTING TO GET THE FLOW HERES A BONUS: $");
            total = (e.calculateSalary() * 0.06) * numberOfYearsWithCompany;

        } else if (performance.equals(performance_rates.D.toString())) {
            System.out.print("NICE WORK JUST DO A BIT BETTER PLS, HERES BONUS: $");
            total = (e.calculateSalary() * 0.04) * numberOfYearsWithCompany;

        } else {
            System.out.print("YIKES MAYBE WORK HARDER NOT LONGER");
        }

        return total;
    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee pension based on salary and numbers of years with the company.
        It should return the total pension amount.
            Example: Employee will receive 5% of salary as pension for every year they are with the company
     *      after retirerement , pension (salary and num of years) ,

     */
    public static double calculateEmployeePension(Employee employee) {
        double pension = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Please enter start date in format (example: May,2015): ");
            String joiningDate = sc.nextLine();
            System.out.println("Please enter today's date in format (example: August,2017): ");
            String todaysDate = sc.nextLine();
            String convertedJoiningDate = DateConversion.convertDate(joiningDate);
            String convertedTodaysDate = DateConversion.convertDate(todaysDate);
            int numberOfYearsWithCompany = Integer.parseInt(convertedTodaysDate.substring(convertedTodaysDate.length() - 4)) - Integer.parseInt(convertedJoiningDate.substring(convertedJoiningDate.length() - 4));
            pension = (double) numberOfYearsWithCompany * (employee.calculateSalary() * 0.05);
            System.out.println("Here is ur pension: $" + pension);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pension;
    }

    @Override
    public int employeeId() {
        return employeeId;
    }

    @Override
    public String employeeName() {
        return employeeName;
    }

    @Override
    public String performance() {
        return performance;
    }

    @Override
    public String department() {
        return department;
    }

    @Override
    public void assignDepartment(depart_titles depart) {
        this.department = depart.toString();
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        EmployeeInfo.companyName = companyName;
    }

    @Override
    public double calculateSalary() {
        double salary = 0;

        if (this.department.equals(depart_titles.FINANCE.toString())) {
            salary = 50000;

        } else if (this.department.equals(depart_titles.ENGINEERING.toString())) {
            salary = 100000;

        } else if (this.department.equals(depart_titles.BUSINESS.toString())) {
            salary = 80000;

        } else if (this.department.equals(depart_titles.SALES.toString())) {
            salary = 30000;

        } else {
            System.out.println("ERROR NO SALARY FOR U");
            return 0;
        }
        return salary;
    }

    @Override
    public void benefitLayout() {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++WELCOME TO THE COMPANY HERE ARE UR BENEFITS!!!++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("* bonus pay up to 10% of your salary *");
        System.out.println("* After retirement,pension pay offered,receive 5% of salary\n " +
                "as pension for every year they were with the company *");
        System.out.println("* vacation pay * holiday pay * Paid time off *");
        System.out.println("* maternity leave with pay *");
        System.out.println("* 401K * health insurance *");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", performance='" + performance + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    private static class DateConversion {

        public DateConversion(Months months) {

        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 7;
                    break;
                case August:
                    date = 8;
                    break;
                case September:
                    date = 9;
                    break;
                case October:
                    date = 10;
                    break;
                case November:
                    date = 11;
                    break;
                case December:
                    date = 12;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}
