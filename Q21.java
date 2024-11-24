import java.util.HashMap;

class NoMatchFoundException extends Exception
{
    public NoMatchFoundException(String message)
    {
        super(message);
    }
}

public class Q21
{
    public static void main(String[] args)
    {
        HashMap<String, String> capitalmap = new HashMap<>();
        capitalmap.put("India", "New Delhi");
        capitalmap.put("USA", "Washington, D.C.");
        capitalmap.put("France", "Paris");

        if (args.length == 0)
        {
            System.out.println("Error: Please provide a country name as an argument.");
            return;
        }

        String country = args[0];

        try
        {
            if (!capitalmap.containsKey(country))
            {
                throw new NoMatchFoundException("No capital found for " + country);
            }
            System.out.println("The capital of " + country + " is " + capitalmap.get(country));
        }
        catch (NoMatchFoundException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
