import java.util.Scanner;
public class Q17{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = S.nextInt();
        int sum = 0;
        int b;
        while(a>=10)
        {
            b = a%100;
            sum = sum+b;
            a = a/10;
        }
        System.out.println("Sum of consecutive digits is "+sum);
    }
}