package org.example.project4;

public class Task4 {
    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static void main(String[] args) {

        String str1 = "madam";
        String str2 = "hello";

        System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));

    }
}
