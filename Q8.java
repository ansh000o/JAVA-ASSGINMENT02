class Parent
{
    public static void display()
    {
        System.out.println("Method of parent class");
    }
}

class Child extends Parent
{
    public static void display()
    {
        System.out.println("Method of child class");
    }
}

public class Q8
{
    public static void main(String[] args)
    {
        Parent.display();
        Child.display();

        Parent obj = new Child();
        obj.display();
    }
}