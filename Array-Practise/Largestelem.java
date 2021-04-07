import java.util.*;
public class Largestelem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int biggest=  arr[0];

        for(int i=0;i<arr.length;i++)
        {
                if(arr[i]>biggest)
                {
                    biggest = arr[i];
                }
        
        }
        System.out.println("Biggest element is:" + biggest);
    sc.close();
    }
}
