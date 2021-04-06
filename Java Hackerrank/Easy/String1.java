import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int x = A.length();
        int y = B.length();
        int sum = x+y;
        System.out.println(sum); //printing the sum of length of 2 variables
        
        if(A.compareTo(B)>0) //checking for lexicographical - if the output is positive we print Yes else we print No
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
        //In the below code we will make the first character of both the string capital and print them
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase() + " " + B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase());
        
        
    }
}



