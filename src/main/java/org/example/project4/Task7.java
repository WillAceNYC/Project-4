package org.example.project4;

public class Task7 {
    public static int countWords(String str) {

        String[] words = str.split("[\\s\\p{Punct}]+");
        return words.length;
    }

    public static void main(String[] args) {

        String str = "Hello, world!";
        int wordCount = countWords(str);
        System.out.println("Number of words in the string: " + wordCount);

    }
}

