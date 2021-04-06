import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k); //storing an initial value in the smallest variable using the given k value, we then use this to compare and update the smallest k value 
        String largest = ""; //we keep the largest variable empty 
        
        for(int i =0;i<s.length()-k+1;i++) //we run the loop from 0 to length of the string - k+1, as the end element is not included.
        {
            if(s.substring(i,i+k).compareTo(smallest)<0) //we compare the substrings with already existing smallest variable and keep updatinng it as we find new smallest
            {
                smallest = s.substring(i,i+k);
            }
            if(s.substring(i,i+k).compareTo(largest)>0) //similarly we update the largest value as well
            {
                largest = s.substring(i,i+k);
            }
        }
        
        
        
        return smallest + "\n" + largest;
    }

