interface A
{
    void smile();
    void run();
}
interface B
{
    void cry();
    void eat();
}
interface C
{
    void sleep();
    void walk();
}
interface D extends A,B,C
{
    void fun();
}
class Base implements A,B,C
{
    public void smile()
    {
        System.out.println("smiling!");
    }
    public void run()
    {
        System.out.println("running");
    }

    public void eat()
    {
        System.out.println("eating");
    }

    public void sleep()
    {
        System.out.println("sleeping");
    }
    public void walk()
    {
        System.out.println("walking");
    }
   
    public void cry()
    {
        System.out.println("crying");
    }
}
class childs extends Base implements D
{
    public void fun()
    {
        System.out.println("enjoying");
    }
    public void A1(A a1){
      a1.run();
      a1.smile();

    }
    public void A2( B b1)
    {
        b1.cry();
        b1.eat();
    }
    public void A3( C c1)
    {
        c1.sleep();
        c1.walk();
    }
    public void A4( D d1)
    {
        d1.cry();
        d1.eat();
        d1.fun();
        d1.run();
        d1.sleep();
        d1.smile();
        d1.walk();
    }
}
public class Q18 {
    public static void main(String[] args) {
        childs H = new childs();
        H.A1(H);
        H.A2(H);
        H.A3(H);
        H.A4(H);
        
    }
}