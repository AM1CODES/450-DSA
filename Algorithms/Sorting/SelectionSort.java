public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={4,23,12,455,7,65,87,64,53,78,0};
        int len = arr.length;

        // if the  array has n elements then the outer loop runs for n-1 times
        for(int i =0;i<len-1;i++)
        {
            int min = i;
            for(int j=i;j<len;j++)
            {
                if(arr[j]<arr[min]) //we look for the minimum element in the array
                {
                    min = j;
                }
            }
            int temp = arr[i];//swapping the element with the smallest element
            arr[i] = arr[min];
            arr[min] = temp;

        }
        System.out.println("The Sorted array is:");
        for(int i: arr)
        {
            System.out.print(i+ " ");
        }
    }    
}
