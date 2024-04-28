package org.example.project4;

import java.util.Arrays;

public class Task5 {
    public static boolean areAnagrams(String str1, String str2) {

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + areAnagrams(str1, str2));

    }
}
