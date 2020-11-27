package Array;
import java.util.*;
/*
The goal is to make a program that takes a String input from the user and 
*/
class reverseString
{
public static void main(String[] args) 
{
    String rev="";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:");
    String str  =sc.nextLine();
    for(int i =str.length()-1;i>=0;i--)
    {
        rev = rev + str.charAt(i);
    }
    System.out.println("The reversed String is:" + rev);
    sc.close();
}
}

