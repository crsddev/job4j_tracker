package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int rsl = -1;
        for (int i = 0; i <= products.length - 1; i++) {
            Product product = products[i];
            if (product == null) {
                return i;
            }
        }
        return rsl;
    }
}