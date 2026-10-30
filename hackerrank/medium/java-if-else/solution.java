
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

//chech no is odd 
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            // The number is even, filter by range
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else { 
                // greater than 20
                System.out.println("Not Weird");
            }
        }
    }
}
