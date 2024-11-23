class Animal{
    void eat()
    {System.out.println("eating");}
}
class Dog extends Animal{
    void bark()
    {System.out.println("barking");}
}
class Babydog extends Dog{
    void weap()
    {System.out.println("weaping");}
}

    public class Q13{
        public static void main(String[] args) {
        Animal a=new Animal();
        Babydog b=new Babydog();
        Dog d=new Dog();
        b.weap();
        a.eat();
        d.bark();
        }

}