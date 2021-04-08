import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList al[] = new ArrayList[20000]; //our main array list
        Scanner sc = new Scanner(System.in);
        
        int lists = sc.nextInt(); //accepting the number of lists in our main array list
        
        for(int i =0;i<lists;i++)
        {
            al[i] = new ArrayList(); //creating new list within the arraylist
            int  number = sc.nextInt(); //tells us how many numbers are there in the list
            for(int j=0;j<number;j++) 
            {
                int value = sc.nextInt();
                al[i].add(value); //adding values to our  arraylist
            }
        }
        
        int queries = sc.nextInt();
        for(int i=0;i<queries;i++)
        {
            int x = sc.nextInt(); //array list here is a 2d array and x and y are the values of the elements at a particular row and column
            int y = sc.nextInt();
            
            try{
                System.out.println(al[x-1].get(y-1)); 
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}