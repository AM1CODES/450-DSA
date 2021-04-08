import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        BigInteger y = sc.nextBigInteger();
        
        BigInteger sum = x.add(y);
        BigInteger product = x.multiply(y);
        
        System.out.println(sum);
        System.out.println(product);
        
        sc.close();
    }
}
