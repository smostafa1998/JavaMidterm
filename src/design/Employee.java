package design;

public interface Employee {

	/*
	Employee is an Interface which contains multiple unimplemented methods.
	A few methods have been declared below. You need to come up with more methods to meet business requirements of this
	    application
	*/

    /*
     Please read the following methods and understand the business requirements of these following methods
        and then implement these in a concrete class.
     */

    enum depart_titles{
        FINANCE,ENGINEERING,BUSINESS,SALES
    }

    enum performance_rates{
        A,B,C,D
    }



    // employeeId() will return employee id.
    int employeeId();

    //employeeName() will return employee name
    String employeeName();


    String performance();

    String department();


    //assignDepartment() will assign employee to departments
    void assignDepartment(depart_titles depart);

    //calculate employee salary
    double calculateSalary();

    //employee benefit
    void benefitLayout();

    String toString();

}
