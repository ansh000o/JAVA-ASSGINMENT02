public class Q3
{
    private int n;

    public Q3(int n)
    {
        this.n = n;
        System.out.println("The parameterized constructor is called with value: " + this.n);
    }

    public static void main(String[] args)
    {
        Q3 obj = new Q3(42);
    }
}