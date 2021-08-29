package com.java.dao;

import com.java.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }
    public void updateBook(Book updatedBook) {
        for (Book book: books) {
            if (book.getID() == updatedBook.getID()) {
                book.setReleaseNumber(updatedBook.getReleaseNumber());
                book.setAuthor(updatedBook.getAuthor());
            }
        }
    }

    public Book searchByID(int ID) {
        for (Book book: books) {
            if (book.getID() == ID) {
                return book;
            }
        }
        return null;
    }

}
