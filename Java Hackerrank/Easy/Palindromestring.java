import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        char[] arr = A.toCharArray();
        String rev = "";
        for(int i = A.length()-1;i>=0;i--)
        {
            rev += arr[i];
        }

        if(A.equals(rev))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
        
    }
}



