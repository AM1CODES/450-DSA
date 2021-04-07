import java.util.*;
public class Smallestelem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int smallest=  arr[0];

        for(int i=0;i<arr.length;i++)
        {
                if(arr[i]<smallest)
                {
                    smallest = arr[i];
                }
        
        }
        System.out.println("Smallest element is:" + smallest);
    sc.close();
    }
}
