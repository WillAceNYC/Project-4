package org.example.project4;

import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static char findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();


        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }


        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String str = "abracadabra";
        char firstNonRepeating = findFirstNonRepeatingCharacter(str);
        System.out.println("First non-repeating character: " + firstNonRepeating);

    }
}
