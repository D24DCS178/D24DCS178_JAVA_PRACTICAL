/* Create a class named 'Member' having the following
members: Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 – Salary
It also has a method named 'printSalary' which prints the
salary of the members. Two classes 'Employee' and
'Manager' inherits the 'Member' class. The 'Employee' and
'Manager' classes have data members 'specialization' and
'department' respectively. Now, assign name, age, phone
number, address and salary to an employee and a manager
by making */

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    double printSalary()
    {
        return salary;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    String getAddress() {
        return address;
    }
}

class Employee extends Member {
    String specialization;

    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) 
    {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() 
    {
        return specialization;
    }
}

class Manager extends Member {
    String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department) 
    {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class P4_18 {
    public static void main(String[] args) {
        Employee emp = new Employee("Pushpam Gohil", 30, "1234567890", "123 Main St", 50000, "Software Engineer");
        Manager mgr = new Manager("Vaishnavi Gohil", 40, "9876543210", "456 Elm St", 100000, "Marketing");

        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Phone Number: " + emp.getPhoneNumber());
        System.out.println("Address: " + emp.getAddress());
        System.out.println("Specialization: " + emp.getSpecialization());
        emp.printSalary();

        System.out.println("\nManager Details:");
        System.out.println("Name: " + mgr.getName());
        System.out.println("Age: " + mgr.getAge());
        System.out.println("Phone Number: " + mgr.getPhoneNumber());
        System.out.println("Address: " + mgr.getAddress());
        System.out.println("Department: " + mgr.getDepartment());
        mgr.printSalary();
    }
}