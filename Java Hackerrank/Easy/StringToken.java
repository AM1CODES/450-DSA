import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //int tokens = s
        s = s.trim();
        if(s.length() == 0)
        {
            System.out.println(0);
            return;
        }
        String[] str = s.split("[^A-Za-z]+");
        System.out.println(str.length);
        
        for(String word:str)
        {
            System.out.println(word);
        }
        
    }
}

