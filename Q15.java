class thisdemo
{
    private int a;

    public thisdemo(int a)
    {
        this.a = a;
    }

    public void displayNumber()
    {
        System.out.println("Number is: " + this.a);
    }

    public void updateNumber(int a)
    {
        this.a = a;
        System.out.println("Updated number is: " + this.a);
    }
}

public class Q15
{
    public static void main(String[] args)
    {
        thisdemo obj = new thisdemo(10);
        obj.displayNumber();
        obj.updateNumber(20);
        obj.displayNumber();
    }
}
