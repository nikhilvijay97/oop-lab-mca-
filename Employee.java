import java.util.Scanner;

public class Employee
{
    int empid;
    String empname;
    double basic, TA, DA, HRA, TAX, net_salary;

    void getdata()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Employee id:");
        empid=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter employee name:");
        empname=sc.nextLine();

        System.out.println("Enter basic salary:");
        basic=sc.nextDouble();

        System.out.println("Enter TA:");
        TA=sc.nextDouble();

        System.out.println("Enter DA:");
        DA=sc.nextDouble();

        System.out.println("Enter HRA:");
        HRA=sc.nextDouble();

        System.out.println("Enter tax:");
        TAX=sc.nextDouble();
    }

    void calc()
    {
        net_salary=(basic+TA+DA+HRA)-TAX;
    }

    void display()
    {
        System.out.println("\nEmployee id:"+empid);
        System.out.println("Employee Name:"+empname);
        System.out.println("Net Salary:"+net_salary);
    }

    public static void main(String args[])
    {
        Employee emp=new Employee();
        emp.getdata();
        emp.calc();
        emp.display();
    }
}