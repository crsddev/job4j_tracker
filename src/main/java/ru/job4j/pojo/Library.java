package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book firstBook = new Book("Clean code", 500);
        Book secondBook = new Book("Crime and Punishment", 430);
        Book thirdBook = new Book("Idiot", 120);
        Book fourthBook = new Book("Three Comrades", 320);
        Book[] books = new Book[4];
        books[0] = firstBook;
        books[1] = secondBook;
        books[2] = thirdBook;
        books[3] = fourthBook;
        for (int index = 0; index <= books.length - 1; index++) {
            Book currentBook = books[index];
            System.out.println((index + 1) + " " + currentBook.getName() + " - "
                    + currentBook.getSize() + " pages.");
        }
        System.out.println("Replace firstBook and fourthBook");
        Book tempBook = firstBook;
        books[0] = fourthBook;
        books[3] = tempBook;
        for (int j = 0; j <= books.length - 1; j++) {
            Book currentBook = books[j];
            System.out.println((j + 1) + " " + currentBook.getName() + " - "
                    + currentBook.getSize() + " pages.");
        }
        System.out.println("Shown only book with name \"Clean code\" ");
        for (int i = 0; i <= books.length - 1; i++) {
            Book currentBook = books[i];
            if ("Clean code".equals(currentBook.getName())) {
                System.out.println(currentBook.getName() + " - "
                        + currentBook.getSize() + " pages.");
            }
        }
    }
}
