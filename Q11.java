class Num
{
    protected int number;

    public Num(int number)
    {
        this.number = number;
    }

    public void showNum()
    {
        System.out.println("Decimal value: " + number);
    }
}

class hexa extends Num
{
    public hexa(int number)
    {
        super(number);
    }

    @Override
    public void showNum()
    {
        System.out.println("Decimal value: " + number);
        System.out.println("Hexadecimal value: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Octal value: " + Integer.toOctalString(number));
    }
}

public class Q11
{
    public static void main(String[] args)
    {
        Num num = new Num(255);
        System.out.println("Base Class Output:");
        num.showNum();

        hexa hexNum = new hexa(255);
        System.out.println("\nDerived Class Output:");
        hexNum.showNum();
    }
}
