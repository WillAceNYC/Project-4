package org.example.project4;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static List<String> filterAndConvertToLowercase(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();
        for (String str : strings) {
            if (str.startsWith("A")) {
                filteredStrings.add(str.toLowerCase());
            }
        }
        return filteredStrings;
    }

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Apricot");
        strings.add("Grapes");
        strings.add("Aardvark");

        List<String> filteredStrings = filterAndConvertToLowercase(strings);
        System.out.println("Strings starting with 'A' in lowercase: " + filteredStrings);

    }
}

