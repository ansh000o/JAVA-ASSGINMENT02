import java.util.Scanner;

class exc
{
    public void divide(int a, int b) throws ArithmeticException
    {
        if (b == 0)
        {
            throw new ArithmeticException("cannot divide by zero");
        }
        System.out.println("Result: " + (a / b));
    }
}

public class Q19
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        exc demo = new exc();

        try
        {
            System.out.print("Enter the numerator: ");
            int a = S.nextInt();
            System.out.print("Enter the denominator: ");
            int b = S.nextInt();
            demo.divide(a, b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally
        {
            System.out.println("Finally block is running");
        }
    }
}
