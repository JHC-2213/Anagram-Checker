package Susbstrings;

import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a.toLowerCase();
        b.toLowerCase();

        if(a.length()==b.length()){
            char[] c1 = a.toLowerCase().toCharArray();
            char[] c2 = b.toLowerCase().toCharArray();
            java.util.Arrays.sort(c1);
            java.util.Arrays.sort(c2);

            return java.util.Arrays.equals(c1, c2);
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


