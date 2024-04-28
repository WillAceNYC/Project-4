package org.example.project4;

public class Task3 {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();


        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

    }
}

