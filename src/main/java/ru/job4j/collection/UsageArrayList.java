package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {

    public static void main(String[] args) {
        ArrayList<String> testArr = new ArrayList<>();
        testArr.add("Petr");
        testArr.add("Ivan");
        testArr.add("Stepan");
        for (String names: testArr) {
            System.out.println(names);
        }
    }
}
