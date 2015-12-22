import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String entry = (new Scanner(System.in)).nextLine();
        Hashtable<Character, Integer> letters = new Hashtable();
        for(int i = 0; i < entry.length(); i++){
            if(entry.charAt(i) != ' ' )            
                letters.put(Character.toLowerCase(entry.charAt(i)),1);
        }
        if(letters.size()==26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
    }
}