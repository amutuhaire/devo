package guma;
import java.util.Scanner;
public class Ascend {
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[6];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < 6; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < 6; i++) 
        {
            for (int j = i + 1; j < 6; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < 6 - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[6 - 1]);
    }
}



