import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextShort();
        for (short i = 0; i < cases; i++){
            String entry = input.next();
            boolean flag = true;
            for (short j = 1; j < entry.length(); j++){
                int l = ((int) entry.charAt(j) - ((int) entry.charAt(j-1)));
                int r = ((int) entry.charAt(entry.length() - j -1) - ((int) entry.charAt(entry.length() - j)));
                //System.out.println("left is |" + ((int) entry.charAt(j)) +
                // " - " + ((int) entry.charAt(j-1)) + "| answer = " + l);
                //System.out.println("right is |" + ((int) entry.charAt(entry.length() - j -1)) + 
                //" - " + ((int) entry.charAt(entry.length() - j)) + "| answer = " + r);
                if( Math.abs(l) != Math.abs(r) )
                    flag = false;
            }
            if(flag)
                System.out.println("Funny");
            else
                System.out.println("Not Funny");
        }
    }
}