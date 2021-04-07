import java.util.*;
public class OddPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println("Odd elements of array are:" + " "+ arr[i]);
            }
        }
        sc.close();
    }
}
