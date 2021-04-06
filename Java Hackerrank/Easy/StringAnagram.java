import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase(); //converting a and b to lowercase so that we don't have to deal with case sennsitive data at all
        b = b.toLowerCase();
        //int[] freq1 = new int[a.length()];
        //int[] freq2 = new int[b.length()];
        
        char[] a_str = a.toCharArray(); //converting the string to character arrays
        char[] b_str = b.toCharArray();
        java.util.Arrays.sort(a_str); //using .sort() - this will sort our character array according to alphabetical order and won't skip any character even if they occur multiple times
        java.util.Arrays.sort(b_str);
        
        if(a.length()!=b.length()) //if the length of two strings are not equal we immediately say they are not anagrams
        return false;
        else
        return java.util.Arrays.equals(a_str,b_str); //we then compare our sorted character array and compare all the characters present in them. if everything matchs, we return true
}

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
