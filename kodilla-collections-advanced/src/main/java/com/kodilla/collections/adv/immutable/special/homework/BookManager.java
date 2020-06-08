package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    List<Book> books = new ArrayList<>();

    public BookManager(String title, String author) {
    }

    public BookManager createBook(String title, String author) {
        BookManager bookManager = new BookManager(title, author);

        for (Book book : books) {
            if () ;
        }
    }
}
