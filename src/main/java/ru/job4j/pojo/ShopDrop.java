package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = 0; i < products.length - 1; i++) {
            Product product = products[i];
            if (products[i] == null) {
                products[i] = products[i + 1];
                products[i + 1] = null;
                System.out.println(products[i].getName());
            }
        }
        return products;
    }
}