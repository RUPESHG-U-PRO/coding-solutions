import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        // Trim leading and trailing spaces
        s = s.trim();
        
        // If the string is empty after trimming, print 0 and exit
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            // Split using a regular expression that catches all specified punctuation and spaces
            String[] tokens = s.split("[!,?._'@\\s]+");
            
            // Print the total number of tokens
            System.out.println(tokens.length);
            
            // Print each token on a new line
            for (String token : tokens) {
                System.out.println(token);
            }
        }
        
        scan.close();
    }
}


