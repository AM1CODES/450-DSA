import java.io.*;
import java.util.*;
/*
The hasNext() helps in checking if there are any other inputs that needs to be read. In our question we were told that we just have some n lines as input. so the exact number of inputs are not known
to us. So, to run the for loop, hasNext() helps us. So until the hasNext() is true, we will keep reading inputs.
*/
public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        for(int i =1;sc.hasNext() == true;i++) 
        {
          String s = sc.nextLine();
          System.out.println(i + " "+ s);  
        }
         
    }
}
