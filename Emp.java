import java.util.Scanner;
public class Emp
{
    int empno;
    String name;

    void getdata()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n Enter Employee name:");
        name=scan.nextLine();

        System.out.println("\n\n Enter Empno:");
        empno=scan.nextInt();
    }

    void display()
    {
        System.out.println("Employee name:"+name);
        System.out.println("Employee no:"+empno);
    }

    public static void main(String args[])
    {
        Emp e=new Emp();
        e.getdata();

        System.out.println("\n\n Employee Details \n");
        System.out.println("\n\n______\n");

        e.display();
    }
}