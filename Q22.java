class CustomArithmeticException extends Exception
{
    public CustomArithmeticException(String message)
    {
        super(message);
    }
}

public class Q22
{
    public static void main(String[] args)
    {
        try
        {
            double a = 10, b = 0, c = -5;

            if (b == 0)
            {
                throw new CustomArithmeticException("Dividing by zero");
            }
            double result = a / b;
            System.out.println("Result: " + result);

            if (c < 0)
            {
                throw new CustomArithmeticException("square root of negative number");
            }
            double sqrtResult = Math.sqrt(c);
            System.out.println("Square root: " + sqrtResult);

        }
        catch (CustomArithmeticException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
