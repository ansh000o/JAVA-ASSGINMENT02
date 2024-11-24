class TooHot extends Exception
{
    public TooHot(String message)
    {
        super(message);
    }
}

class TooCold extends Exception
{
    public TooCold(String message)
    {
        super(message);
    }
}

public class Q23
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("Error: Please provide temperature.");
            return;
        }

        try
        {
            double temp = Double.parseDouble(args[0]);

            if (temp > 35)
            {
                throw new TooHot("Temperature is too hot!");
            }
            else if (temp < 5)
            {
                throw new TooCold("Temperature is too cold!");
            }
            else
            {
                System.out.println("Normal temperature.");
                double fahrenheit = (temp * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }
        }
        catch (TooHot e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (TooCold e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error: Invalid temperature format.");
        }
    }
}
