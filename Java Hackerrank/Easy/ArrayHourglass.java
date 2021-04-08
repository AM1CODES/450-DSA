import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        int a[][] = new int[6][6];
        int maxSum = Integer.MIN_VALUE; //storing the min value as the intial sum which we can update once we have our new sum
        try (Scanner scanner = new Scanner(System.in);)
        {
            for(int i = 0; i < 6; i++) //looping thorugh rows
            {
                for(int j = 0; j < 6; j++) //looping through columns
                {
                    a[i][j] = scanner.nextInt();
                    if (i > 1 && j > 1)
                    {
                        int sum = //calculating the hour glass matrix
                            a[i][j]
                            + a[i][j-1]
                            + a[i][j-2]
                            + a[i-1][j-1]
                            + a[i-2][j]
                            + a[i-2][j-1]
                            + a[i-2][j-2];
                        if (sum > maxSum) {maxSum = sum;}
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}