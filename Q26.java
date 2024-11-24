import java.util.Scanner;

class NegativeAgeException extends Exception
{
    public NegativeAgeException(String message)
    {
        super(message);
    }
}

public class Q26
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = S.nextLine();

        System.out.print("Enter your age: ");
        int age = S.nextInt();

        try
        {
            if (age < 0)
            {
                throw new NegativeAgeException("age cannot be in minus");
            }
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
        catch (NegativeAgeException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
