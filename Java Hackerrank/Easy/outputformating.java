import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);
                /* In the above line we are using formating using printf.
                Here - 
                * '-' is used for left indentation
                * '15' is used to define the minimum width of the input string
                * 's' is used to print the string
                * '0' is for adding trailing 0 to the left if the number of digits is less than 3                                                                             less than 3
                * '3' is for defining minimum field for the integer value
                * 'd' is for printing the integer
                * 'n' is for next line
                
                */
            }
            System.out.println("================================");

    }
}



