import java.util.Scanner;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>(); //creating the list
        for (int i = 0; i < N; i++) { //populating the list
            int value = scan.nextInt();
            list.add(value);
        }
        

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scan.next(); //taking the input of index and value so that we can insert the value at right index and also delete elements from the input index
            if (action.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else { 
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();
        
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}