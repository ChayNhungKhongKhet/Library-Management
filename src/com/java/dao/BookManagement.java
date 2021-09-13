package com.java.dao;

import com.java.model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManagement {

    private ArrayList<Book> bookList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void showMenu() {
        System.out.println("Welcome to the book !");
        System.out.println("Please choose an action !\n1.Add book\n2.Remove book\n3.Search book\n4.Show book\n5.Update book\n6.Show menu\n7.Exit");
    }

    public boolean conditionalID(int id) {
        for (Book conditionalAdd : bookList) {
            if (conditionalAdd.getID() == id) {
                System.err.println("Id of book has exist !");
                return false;
            }
        }
        return true;
    }

    public void addBook(Book addBook) {
        if (conditionalID(addBook.getID())) {
            bookList.add(addBook);
        } else {
            System.err.println("Not successfully");
        }

    }

    public void removeBook(Book removeBook) {
        bookList.remove(removeBook);
    }

    public void updateBook(Book updatedBook) {
        System.out.print("Choose order number want update: \n1.Release number\n2.Producer\n3.Id\n4.Author\n");
        int choose = sc.nextInt();
        sc.nextLine();
        if (choose < 1 || choose > 4) {
            System.err.println("The choose does not exist !");
            return;
        }
        if (choose == 1) {
            System.out.print("Enter new release number: ");
            updatedBook.setReleaseNumber(sc.nextInt());
        }
        if (choose == 2) {
            System.out.print("Enter new producer: ");
            updatedBook.setProducer(sc.nextLine());
        }
        if (choose == 3) {
            while (true) {
                System.out.print("Enter new Id: ");
                int idCheck = sc.nextInt();
                sc.nextLine();
                if (updatedBook.getID() != idCheck) {

                    if (!conditionalID(idCheck)) {
                        System.err.println("Update not successfully !, Please retype !");
                    } else {
                        boolean check = updatedBook.setID(idCheck);
                        if (check) {
                            break;
                        } else {
                            System.err.println("Id including 5 number !");
                        }
                    }
                } else {
                    System.err.println("Please enter new id ,this is old id");
                }
            }
        }
        if (choose == 4) {
            System.out.print("Enter author:");
            updatedBook.setAuthor(sc.nextLine());
        }

    }


    public Book searchByID(int ID) {
        for (Book book : bookList) {
            if (book.getID() == ID) {
                return book;
            }
        }
        System.err.println("Id does not exist !");
        return null;
    }

    public ArrayList<Book> searchByName(String name) {
        ArrayList<Book> listCheckName = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getName().equalsIgnoreCase(name)) {
                listCheckName.add(book);
            }
        }
        if (listCheckName.size() == 0) {
            System.err.println("Id does not exist !");
            return null;
        }
        return listCheckName;
    }

    public ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> listCheckAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                listCheckAuthor.add(book);
            }
        }
        if (listCheckAuthor.size() == 0) {
            System.err.println("Id does not exist !");
            return null;
        }
        return listCheckAuthor;
    }


}

