class staticdemo
{
    private static int count = 0;

    public staticdemo()
    {
        count++;
    }

    public static int getCount()
    {
        return count;
    }

    public static void displayMessage()
    {
        System.out.println("Static methods can be called without creating an object.");
    }
}

public class Q16
{
    public static void main(String[] args)
    {
        staticdemo.displayMessage();
        staticdemo obj1 = new staticdemo();
        staticdemo obj2 = new staticdemo();
        staticdemo obj3 = new staticdemo();
        System.out.println("Number of objects created: " + staticdemo.getCount());
    }
}