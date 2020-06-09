package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    List<Book> books = new ArrayList<>();

    public Book createBook(String title, String author) {
        for (Book book0 : books) {
            if (book0.getTitle().equals(title) && book0.getAuthor().equals(author)) {
                return book0;
            }
        }
        Book book = new Book(title, author);
        books.add(book);
        return book;
    }

}
