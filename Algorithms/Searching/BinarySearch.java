
/* Binary search is a simple searching technique in which we define the first element as the low value and  the last
element as the high value and using these two values we calculate the middle value and search for element. We then increment
or decrement the low and high value according to our given conditions. In Binary search the array has to be sorted before we start searching.
*/



public class BinarySearch {
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int element = 11;
        int l = 0;
        int h = arr.length - 1;
        int m;

        while(l<=h)
        {
            m = (l+h)/2;
            if(element > arr[m])
            {
                l = m + 1;
            }
            else if(element < arr[m])
            {
                h = m-1;
            }
            else{
                System.out.println("The element is found at index" +" "+  m);
                return;
            }
        }
        
        System.out.println("The element that you wish to search is not present in the array");
    }
}
