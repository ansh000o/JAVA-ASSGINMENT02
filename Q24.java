import java.util.Scanner;

class TooOlder extends Exception
{
    public TooOlder(String message)
    {
        super(message);
    }
}

class TooYounger extends Exception
{
    public TooYounger(String message)
    {
        super(message);
    }
}

public class Q24
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter candidate name: ");
        String name = S.nextLine();
        System.out.print("Enter candidate age: ");
        int age = S.nextInt();

        try
        {
            if (age > 45)
            {
                throw new TooOlder("too old");
            }
            else if (age < 20)
            {
                throw new TooYounger("too young!");
            }
            else
            {
                System.out.println("Eligible");
                System.out.println("Candidate Name: " + name);
            }
        }
        catch (TooOlder e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (TooYounger e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
