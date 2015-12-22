import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        Hashtable<Character, Integer> letters = new Hashtable();
        
        String ans;
        for(int i = 0; i < inputString.length(); i++){
            if(letters.containsKey(inputString.charAt(i)))
                letters.remove(inputString.charAt(i));
            else
                letters.put(inputString.charAt(i), 0);
        }
        if(letters.size()>1)
            ans = "NO";
        else
            ans = "YES";
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        myScan.close();
    }
}
