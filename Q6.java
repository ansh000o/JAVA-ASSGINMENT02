public class Q6
{
    public int multi(int a, int b)
    {
        return a * b;
    }

    public double multi(double a, double b)
    {
        return a * b;
    }

    public static void main(String[] args)
    {
        Q6 obj = new Q6();
        System.out.println("Sum of integers: " + obj.multi(5, 10));
        System.out.println("Sum of doubles: " + obj.multi(1.2, 1.2));
    }
}