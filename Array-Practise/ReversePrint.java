import java.util.*;
public class ReversePrint 
{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[10];
       System.out.println("Enter the elements of the array:");
       for(int i=0;i<arr.length;i++)
       {
           arr[i] = sc.nextInt();
           System.out.println("Element:" + arr[i] +" ");
       }

       System.out.println("Reverse Array is: ");
       for(int i=arr.length-1;i>=0;i--)
       {
        System.out.print( arr[i] +" ");
       }
       sc.close();
   } 
}
