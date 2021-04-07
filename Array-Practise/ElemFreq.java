import java.util.*;
public class ElemFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int visited = -1;
        int count;
        for(int i=0;i<arr.length;i++) //accepting the elements of the array from the user
        {
            System.out.println("Enter the element of the array:");
            arr[i] = sc.nextInt();
        }

        int freq[] = new int[arr.length]; //array to store frequency of the elements of the array
        for(int i =0;i<arr.length;i++)
        {
            count = 1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    freq[j] = visited; //this is to avoid counting the same element agains
                }
            }
            if(freq[i]!=visited)
            {
                freq[i] = count;
            }
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=visited)
            System.out.println(arr[i] +" "+ freq[i]);
        }
        sc.close();
        }
}
