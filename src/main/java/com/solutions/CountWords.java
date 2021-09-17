package com.solutions;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountWords {
    static String input = "string this is a test string that contains many string a string strings";

    public static void main(String[] args) {
        countWord1();
        // countWord();

    }

    private static void countWord1() {
        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
        for (String word : input.split(" ")) {
            hashMap.computeIfPresent(word, (w, v) -> ++v);
            hashMap.computeIfAbsent(word, k -> 1);
        }
        hashMap.entrySet().forEach(System.out::println);
    }

    public static void countWord() {
        String[] split = input.split(" ");
        System.out.println("");

        HashMap<String, Integer> repetitions = new HashMap<>();

        for (int i = 0; i < split.length; ++i) {
            String item = split[i];

            if (repetitions.containsKey(item))
                repetitions.put(item, repetitions.get(item) + 1);
            else
                repetitions.put(item, 1);
        }

        repetitions.entrySet().forEach(System.out::println);
    }
}
