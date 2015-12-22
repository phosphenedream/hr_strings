import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int counter;

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int cases = input.nextShort();
        
        for (short i = 0; i < cases; i++){
            String entry = input.next();
            int length = entry.length();
            
            // counts number of letters to eliminate
            int counter = 0;
            for ( int j = 1; j < length; j++){
                if(entry.charAt(j-1)==entry.charAt(j))
                    counter++;
            }
            System.out.println(counter);                    
        }
    }
    
}