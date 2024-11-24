import java.util.Scanner;

class Employee
{
    private int emp_id;
    private String emp_name;
    private double basic_salary;

    public void acceptDetails()
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        emp_id = S.nextInt();
        S.nextLine(); 
        System.out.print("Enter Employee Name: ");
        emp_name = S.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic_salary = S.nextDouble();
    }

    public void displayGrossSalary()
    {
        double hra = 0.1 * basic_salary;
        double da = 0.2 * basic_salary;
        double gross_salary = basic_salary + hra + da;
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

public class Q14
{
    public static void main(String[] args)
    {
        Employee emp = new Employee();
        emp.acceptDetails();
        emp.displayGrossSalary();
    }
}
