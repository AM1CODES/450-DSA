/*Bubble sort is a sorting techinique, in this we start from left of an array and check the element on the left with the element on the right.
If the element on the right is smaller than the element on the left, we do a swap on both the elements and in each iteration the 
largest element is placed at  the right most end.
*/ 

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {56,78,89,799,1,2,-1,0};
        int len = arr.length;

        // if we have n elements in an array then we need (n-1) iterations to sort it
        for(int i =0;i<len-1;i++)
        {
            boolean isSorted = true; //used for checking if the input array is already sorted
            for(int j=0;j<len-1-i;j++)
            {
                if(arr[j+1]<arr[j]) //the swap will only occur if the element on the right is smaller than the element on the left
                {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                isSorted = false;
                }
            }
            if(isSorted)
            {
                System.out.println("Array is already sorted.");
                return;
            }
        }
        System.out.println("Sorted array is:" + " ");
        for(int i:arr)
        {
        System.out.print(i + " ");
        }

    }
}
