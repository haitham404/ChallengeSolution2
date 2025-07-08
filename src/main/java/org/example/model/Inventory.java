package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static List<Book> books = new ArrayList<>();
    public static List<Book> getBooks() {
        return books;
    }
    public static void add(Book book) {
        Inventory.books.add(book);
    }
}

