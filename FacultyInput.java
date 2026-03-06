import java.util.Scanner;

public class FacultyInput
{
    int age;
    String name;

    void getdata()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter Faculty name:");
        name = scan.nextLine();

        System.out.println("\nEnter Age:");
        age = scan.nextInt();
    }

    void display()
    {
        System.out.println("Faculty name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String args[])
    {
        FacultyInput obj = new FacultyInput();

        obj.getdata();

        System.out.println("\n\nFaculty Details\n");
        System.out.println("______________");

        obj.display();
    }
}