import java.util.*;
/* 
<--Iterative Approach-->

The goal is to reverse the elements of the array. We take user input for number of elements in the array along with the elements of the array.
The approach is to replace the first element of the array with the last element, second with the second last and so on.

-> Time complexity = O(n)
*/
class reversearray
{
  Scanner sc = new Scanner(System.in);
  int i;int j; int counter = 0; int temp;
  int arr[] = new int[100];

  public void reverse()
  {
    System.out.println("Enter the number of elements in the array");
    counter = sc.nextInt();
    for(i =0;i<counter;i++)
    {
        System.out.println("Enter the elements of the array:");
        arr[i] = sc.nextInt();
    }
    
    j = i-1; //last element
    i = 0; //first element
    
    while(i<j)
    {
    temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--;
    }
    System.out.println("The reversed array is:");
    for(i =0;i<counter;i++)
    {
        System.out.print(arr[i] + " ");
    }
}

public static void main(String[] args) 
{
    reversearray obj = new reversearray();
    obj.reverse();
    
}
    

}