package org.example.project4;

public class Task2 {
    public static int countAlphaCharacters(String str) {
        int count = 0;


        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String str = "Hello World! 123";

        int count = countAlphaCharacters(str);

        System.out.println("Number of alphabetical characters in the string: " + count);

    }
}
