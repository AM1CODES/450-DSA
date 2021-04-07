// In this we wish to copy the elements of one array into another array
import java.util.Scanner;
public class CopyArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[arr1.length];
        for(int i =0;i<arr1.length;i++)
        {
            System.out.println("Enter the elements of the array: ");
            arr1[i] = sc.nextInt();
        }

        for(int j = 0;j<arr2.length;j++)
        {
            arr2[j] = arr1[j];
        }

        System.out.println("The elements of the array1 are:");
        for(int i =0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("The elements of the array2 are:");
        for(int i =0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }

        sc.close();
        
    }
}