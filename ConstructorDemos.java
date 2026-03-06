class Employees
{
    int empno;
    String empname;

    public Employees(int no, String name) 
    {
        empno = no;
        empname = name;
    }

    void display()
    {
        System.out.println("Employee Details");
        System.out.println("________________");
        
        System.out.println("empno: " + empno);
        System.out.println("Name: " + empname);
    }
}

public class ConstructorDemos
{
    public static void main(String[] args) 
    {
        Employees ob = new Employees(12, "Anu");
        ob.display();
    }
}