import java.util.*;
import java.io.*;
import java.lang.Math;
/*
In this solution, we are taking the result of the previous stage and adding it to the next stage to form the series.
In this, our a value does not change and we have stored it in sum. The only value that is changing is the (2^i)*b.
For this we are storing that result in ele then we are using this result to make our series with sum which has the value of a.
The if condition is for printing the output of the next line numbers.
*/
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in); //lines of input
        int t=in.nextInt();
        for(int i=0;i<t;i++){ //outer loop to iterate over the number of inputs
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for(int j =0;j<n;j++) //inner loop to iterate over the power of 2 and get the result by forming the series.
            {
                int ele = (int)(Math.pow(2,j)*b);  //saves the result of the previous stage.
                sum = sum+ele; //creating the elements of the series
                System.out.printf("%s ",sum);
            }
            if(i<t-1)
            {
                System.out.print("\n");
            }
            
        }
    }
}
