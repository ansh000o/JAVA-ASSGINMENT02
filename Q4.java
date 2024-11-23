public class Q4
{
    private String name;
    private int age;

    public Q4()
    {
        name = "ansh";
        age = 19;
        System.out.println("Name = " + name + ", Age = " + age);
    }

    public Q4(String name)
    {
        this.name = name;
        age = 19;
        System.out.println("Name = " + name + ", Age = " + age);
    }

    public Q4(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Name = " + name + ", Age = " + age);
    }

    public static void main(String[] args)
    {
        Q4 obj1 = new Q4();
        Q4 obj2 = new Q4("santul");
        Q4 obj3 = new Q4("peeyush", 19);
    }
}
