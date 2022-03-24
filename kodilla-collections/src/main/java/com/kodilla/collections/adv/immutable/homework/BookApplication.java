package com.kodilla.collections.adv.immutable.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book = new Book("Pan Tadeusz", "Adam Mickiewicz");
        Book book2 = new Book ("Bieguni", "Olga Tokarczuk");
        Book book3 = new Book ("Pan Tadeusz", "Adam Mickiewicz");
        System.out.println(book.equals(book3));
        System.out.println(book.equals(book2));
    }

}
