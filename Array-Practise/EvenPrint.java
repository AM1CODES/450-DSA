import java.util.*;
public class EvenPrint 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]  = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("Even elements from the array are:" + " "+arr[i]);
            }
        }
        sc.close();
    }
}
