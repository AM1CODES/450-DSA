import java.util.Scanner;
/* 
<--Recursive Approach-->

The goal is to reverse the elements of the array. We take user input for number of elements in the array along with the elements of the array.
The approach is to replace the first element of the array with the last element, second with the second last and so on.

-> Time complexity = O(n)
*/
class reversearray1 
{

  public static void reverse(int arr[], int i, int j) {

      int temp;

      
      if(i >= j) //Termination Condition, The function might call itself infinitely in recursion which can lead to stackkoverflow error hence to prevent it.
        return;

      
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;

      
      reverse(arr, i+1, j-1); //recursion
   }


  public static void main(String[] args) 
  {

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the size of an array");
       int counter = sc.nextInt();
   
       int arr[] =  new int[counter];

       for(int i = 0; i < counter; i++) 
       {
        System.out.println("Enter the elements of the array:");
        arr[i] = sc.nextInt();
       }

       reverse(arr, 0, counter-1);
       
       System.out.println("The reversed array is:");

       for(int i = 0; i < counter; i++) {
          System.out.print(arr[i]+ " ");
       }
       sc.close();
  }

}
