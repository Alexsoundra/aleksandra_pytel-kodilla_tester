package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook("Flower", "XXX");
        Book book2 = bookManager.createBook("Horse", "LLL");
        Book book3 = bookManager.createBook("Flower", "XXX");
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
    }
}
