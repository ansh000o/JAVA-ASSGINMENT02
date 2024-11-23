import java.util.Scanner;
public class Q1
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int sA, sB;

        System.out.print("Enter the size of array A: ");
        sA = S.nextInt();
        int[] A = new int[sA];
        System.out.println("Enter elements of array A in sorted order:");
        for (int i = 0; i < sA; i++)
        {
            A[i] = S.nextInt();
        }

        System.out.print("Enter the size of array B: ");
        sB = S.nextInt();
        int[] B = new int[sB];
        System.out.println("Enter elements of array B in sorted order:");
        for (int i = 0; i < sB; i++)
        {
            B[i] = S.nextInt();
        }

        int[] C = new int[sA + sB];
        int i = 0, j = 0, k = 0;

        while (i < sA && j < sB)
        {
            if (A[i] <= B[j])
            {
                C[k++] = A[i++];
            }
            else
            {
                C[k++] = B[j++];
            }
        }

        while (i < sA)
        {
            C[k++] = A[i++];
        }

        while (j < sB)
        {
            C[k++] = B[j++];
        }

        System.out.println("Merged array:");
        for (int value : C)
        {
            System.out.print(value + " ");
        }
    }
}
