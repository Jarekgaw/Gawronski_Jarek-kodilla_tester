package com.kodilla.collections.adv.immutable.homework;

import java.util.HashSet;
import java.util.Set;


public class BookManager {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        books.add(new Book("Pan Tadeusz","Adam Mickiewicz"));
        books.add(new Book("Bieguni","Olga Tokarczuk"));
        books.add(new Book("Pan Tadeusz","Adam Mickiewicz"));

        System.out.println(books.size());
        for (Book book : books)
            System.out.println(book);
    }
}
