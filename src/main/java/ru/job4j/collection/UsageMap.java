package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("example@ex.com", "Example Explamlovich Eksik");

        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println("key: " + key + System.lineSeparator() + "value: " + value);
        }
    }
}
