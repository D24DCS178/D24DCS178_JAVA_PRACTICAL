/**
 Create a class called Employee that includes three pieces of
information as instance variables—a first name (type
String), a last name (type String) and a monthly salary
(double). Your class should have a constructor that
initializes the three instance variables. Provide a set and a
get method for each instance variable. If the monthly salary
is not positive, set it to 0.0. Write a test application named
EmployeeTest that demonstrates class Employee’s
capabilities. Create two Employee objects and display each
object’s yearly salary. Then give each Employee a 10%
raise and display each Employee’s yearly salary
 again
 */
class Employee {
    String firstname;
    String lastname;
    double monthlysalary;

    Employee() {}
    Employee(String firstname, String lastname, double monthlysalary) {
        this.firstname = firstname;
        this.lastname = lastname;
        setMonthlysalary(monthlysalary);
    }

    void setFirstName(String fname)
    {
        this.firstname = fname;
    }
    String getFirstName()
    {
        return firstname;
    }
    
    void setLastName(String lname)
    {
        this.lastname = lname;
    }

    String getLastName()
    {
        return lastname;
    }

    void setMonthlysalary(double salary)
    {
        if (salary < 0) {
            this.monthlysalary = 0.0;
        } else {
            this.monthlysalary = salary;
        }
    }

    double getMonthlysalary() {
        return monthlysalary;
    }

    double getYearlySalary() {
        return monthlysalary * 12;
    }

    void giveRaise(double percentage) {
        double raiseAmount = monthlysalary * (percentage / 100);
        setMonthlysalary(monthlysalary + raiseAmount);
    }

    void displayEmployeeInfo(Employee employee)
    {
        System.out.println("Employee : " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Yearly Salary: " + employee.getYearlySalary());
    }
}

public class P3_13EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("rahul", "prajapati", 5000.0);
        Employee emp2 = new Employee();
        emp2.setFirstName("gayatri");
        emp2.setLastName("goenka");
        emp2.setMonthlysalary(6000.0);

        emp1.displayEmployeeInfo(emp1);
        emp2.displayEmployeeInfo(emp2);

        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("After 10% raise:");
        emp1.displayEmployeeInfo(emp1);
        emp2.displayEmployeeInfo(emp2);
    }
}