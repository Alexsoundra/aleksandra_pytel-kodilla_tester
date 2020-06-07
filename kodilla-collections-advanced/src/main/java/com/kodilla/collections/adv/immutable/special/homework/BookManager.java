package com.kodilla.collections.adv.immutable.special.homework;

public class BookManager {

    public BookManager(Book book){
        super();
    }

    public Book createBook(String title, String author){
        Book book = new Book("Angels and demons", "Dan Brown");
        return book;
    }
}
