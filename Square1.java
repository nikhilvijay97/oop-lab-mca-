public class Square1
{
    int side;
    void getinput(int s)
    {
        side=s;
    }
    int calArea()
    {
        return side*side;
    }
    public static void main(String args[])
    {
        Square1 r=new Square1();
        r.getinput(5);
        System.out.println("Area of rectangle ="+r.calArea());
    }
}