import java.util.Scanner;

class InvalidUsernameException extends Exception
{
    public InvalidUsernameException(String message)
    {
        super(message);
    }
}

class InvalidPasswordException extends Exception
{
    public InvalidPasswordException(String message)
    {
        super(message);
    }
}

public class Q25
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = S.nextLine();
        System.out.print("Enter password: ");
        String password = S.nextLine();

        try
        {
            if (username.length() < 6)
            {
                throw new InvalidUsernameException("Username must be at least 6 characters long!");
            }
            if (!password.equals("123456"))
            {
                throw new InvalidPasswordException("Password does not match!");
            }
            System.out.println("Login successful!");
        }
        catch (InvalidUsernameException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (InvalidPasswordException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
