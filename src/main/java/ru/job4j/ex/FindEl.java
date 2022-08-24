package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length - 1; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element missing");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] testStr = new String[]{"Abc", "dwa", "admin", "root"};
        try {
            indexOf(testStr, "abc");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
}