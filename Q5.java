class animal{
    void eat()
    {System.out.println("eating");}
}
class dog extends animal{
    void bark()
    {System.out.println("barking");}
}
class cat extends animal{
    void meow()
    {System.out.println("meowing");}
}
class Q5 {
    public static void main(String[] args) {
        animal a=new animal();
        dog d=new dog();
        cat c=new cat();
        c.eat();
        d.bark();
        c.meow();
    }
}