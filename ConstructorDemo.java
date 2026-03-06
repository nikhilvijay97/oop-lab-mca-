
class Students
{
    int rno;
    String name;

    public Students(int r, String n) 
    {
        rno = r;
        name = n;
    }

    void display()
    {
        System.out.println("Student Details");
        System.out.println("________________");
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rno);
    }
}

public class ConstructorDemo
{
    public static void main(String args[])
    {
        Students ob = new Students(12, "Anu");
        ob.display();
    }
}