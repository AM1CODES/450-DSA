/* Linear search is also a searching technique in which we take the element that we want and compare it with all the elements
of our array and keep on searching until we are able to find the element. If we cannot find the element, we simply print element not found.
*/ 

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,293,242,42423,13,1442,433,23424,2312};
        int element = 43;
        int pos = -1;

        for(int i =0;i<arr.length;i++)
        {
            if (element == arr[i])
            {
                pos = i;
                System.out.println("Element is found at index" + " " + pos);
                break;
            }
        }
        if(pos == -1)
        {
            System.out.println("The element that you wish to search is not present in the array.");
        }
    }
}
