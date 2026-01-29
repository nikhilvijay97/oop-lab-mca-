public class Data
{
    void getdata(int a)
    {
        System.err.println("A="+a);
    }
    public static void main(String args[])
    {
        Data ob=new Data();
        ob.getdata(10);
    }
}