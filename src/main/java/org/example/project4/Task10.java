package org.example.project4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task10 {
    public static void removeDuplicates(List<Integer> list) {

        HashSet<Integer> set = new HashSet<>();

        List<Integer> result = new ArrayList<>();
        for (Integer number : list) {

            if (set.add(number)) {
                result.add(number);
            }
        }

        list.clear();
        list.addAll(result);
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        System.out.println("Original list: " + numbers);

        removeDuplicates(numbers);

        System.out.println("List after removing duplicates: " + numbers);

    }
}
