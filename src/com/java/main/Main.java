package com.java.main;

import com.java.dao.BookManagement;
import com.java.dao.MagazineManagement;
import com.java.dao.NewspaperManagement;
import com.java.model.Book;
import com.java.model.Document;
import com.java.model.Magazine;
import com.java.model.Newspaper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    static BookManagement bookManagement = new BookManagement();
    static MagazineManagement magazineManagement = new MagazineManagement();
    static NewspaperManagement newspaperManagement = new NewspaperManagement();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) throws ParseException {
        ArrayList<Book> bookArrayList = bookManagement.getBookList();
        ArrayList<Magazine> magazineArrayList = magazineManagement.getMagazineList();
        ArrayList<Newspaper> newspaperArrayList = newspaperManagement.getNewspaperList();
        while (true) {
            showTheBigMenu();
            System.out.println("Please choose an action !");
            int choose = sc.nextInt();
            switch (choose) {


                case 1:
                    bookManagement.showMenu();
                    do1:
                    do {
                        System.out.println("Please choose an action !");
                        choose = sc.nextInt();
                        switch (choose) {
                            case 1:
                                Book bookAdd = inputBook();
                                bookManagement.addBook(bookAdd);
                                break;
                            case 2:
                                System.out.print("Enter id of book want delete: ");
                                int idRemove = sc.nextInt();
                                Book bookRemove = bookManagement.searchByID(idRemove);
                                if (bookRemove == null) {
                                    break;
                                }
                                bookManagement.removeBook(bookRemove);
                                break;
                            case 3:
                                System.out.println("What do you want to search with ? ");
                                System.out.println("1.Search by id\n2.Search by name\n3.Search by author");
                                choose = sc.nextInt();
                                sc.nextLine();
                                if (choose < 1 || choose > 3) {
                                    break;
                                }
                                if (choose == 1) {
                                    System.out.println("Enter id");
                                    int idSearch = sc.nextInt();
                                    Book boookSearchById = bookManagement.searchByID(idSearch);
                                    if (boookSearchById == null) {
                                        break;
                                    }
                                    System.out.println(boookSearchById);
                                }
                                if (choose == 2) {
                                    System.out.println("Enter name");
                                    String nameSearch = sc.nextLine();
                                    ArrayList<Book> bookSearchByName = bookManagement.searchByName(nameSearch);
                                    if (bookSearchByName == null) {
                                        break;
                                    }
                                    for (Book bookListNameSearch : bookSearchByName) {
                                        display(bookListNameSearch);
                                    }
                                }
                                if (choose == 3) {
                                    System.out.println("Enter author");
                                    String author = sc.nextLine();
                                    ArrayList<Book> bookSearchByAuthor = bookManagement.searchByAuthor(author);
                                    if (bookSearchByAuthor == null) {
                                        break;
                                    }
                                    for (Book bookListAuthorSearch : bookSearchByAuthor) {
                                        display(bookListAuthorSearch);
                                    }
                                }
                                break;
                            case 4:
                                if (bookArrayList == null) {
                                    System.err.println("Array list is empty !");
                                    break;
                                }
                                for (Book listBookDisplay : bookArrayList) {
                                    display(listBookDisplay);
                                }
                                break;
                            case 5:
                                System.out.println("Enter id of book want update !");
                                int idUpdate = sc.nextInt();
                                Book bookUpdate = bookManagement.searchByID(idUpdate);
                                if (bookUpdate == null) {
                                    break;
                                }
                                bookManagement.updateBook(bookUpdate);
                                break;
                            case 6:
                                bookManagement.showMenu();
                                break;
                            case 7:
                                System.out.println("Goodbye !!!!!!!!\n");
                                break do1;
                            default:
                                System.err.println("The choose dose not exist");
                                break;
                        }
                    } while (true);
                    break;


                case 2:
                    magazineManagement.showMenu();
                    do2:
                    do {
                        System.out.println("Please choose an action !");
                        choose = sc.nextInt();
                        switch (choose) {
                            case 1:
                                Magazine magazineAdd = inputMagazine();
                                magazineManagement.addMagazine(magazineAdd);
                                break;
                            case 2:
                                System.out.print("Enter id of book want delete: ");
                                int idRemove = sc.nextInt();
                                Magazine magazineRemove = magazineManagement.searchByID(idRemove);
                                if (magazineRemove == null) {
                                    break;
                                }
                                magazineManagement.removeMagazine(magazineRemove);
                                break;
                            case 3:
                                System.out.println("Enter id of magazine want find!!!");
                                int idSearch = sc.nextInt();
                                Magazine magazineSearchById = magazineManagement.searchByID(idSearch);
                                if (magazineSearchById == null) {
                                    break;
                                }
                                display(magazineSearchById);
                                break;
                            case 4:
                                if (magazineArrayList == null) {
                                    System.err.println("Array list is empty !");
                                    break;
                                }
                                for (Magazine listMagazineDisplay : magazineArrayList) {
                                    display(listMagazineDisplay);
                                }
                                break;
                            case 5:
                                System.out.println("Enter id of book want update !");
                                int idUpdate = sc.nextInt();
                                Magazine magazineUpdate = magazineManagement.searchByID(idUpdate);
                                if (magazineUpdate == null) {
                                    break;
                                }
                                magazineManagement.updateMagazine(magazineUpdate);
                                break;
                            case 6:
                                magazineManagement.showMenu();
                                break;
                            case 7:
                                System.out.println("Goodbye !!!!!!!!\n");
                                break do2;
                            default:
                                System.err.println("The choose dose not exist");
                                break;
                        }
                    } while (true);
                    break;

                case 3:
                    newspaperManagement.showMenu();
                    do3:
                    do {
                        System.out.println("Please choose an action !");
                        choose = sc.nextInt();
                        switch (choose) {
                            case 1:
                                Newspaper newspaperAdd = inputNewspaper();
                                newspaperManagement.addNewspaper(newspaperAdd);
                                break;
                            case 2:
                                System.out.print("Enter id of book want delete: ");
                                int idRemove = sc.nextInt();
                                Newspaper newspaperRemove = newspaperManagement.searchByID(idRemove);
                                if (newspaperRemove == null) {
                                    break;
                                }
                                newspaperManagement.removeNewspaper(newspaperRemove);
                                break;
                            case 3:
                                System.out.println("Enter id of newspaper want find!!!");
                                int idSearch = sc.nextInt();
                                Newspaper newspaperSearchById = newspaperManagement.searchByID(idSearch);
                                if (newspaperSearchById == null) {
                                    break;
                                }
                                display(newspaperSearchById);
                                break;
                            case 4:
                                if (newspaperArrayList == null) {
                                    System.err.println("Array list is empty !");
                                    break;
                                }
                                for (Newspaper listNewspaperDisplay : newspaperArrayList) {
                                    display(listNewspaperDisplay);
                                }
                                break;
                            case 5:
                                System.out.println("Enter id of book want update !");
                                int idUpdate = sc.nextInt();
                                Newspaper newspaperUpdate = newspaperManagement.searchByID(idUpdate);
                                if (newspaperUpdate == null) {
                                    break;
                                }
                                newspaperManagement.updateNewspaper(newspaperUpdate);
                                break;
                            case 6:
                                newspaperManagement.showMenu();
                                break;
                            case 7:
                                System.out.println("Goodbye !!!!!!!!\n");
                                break do3;
                            default:
                                System.err.println("The choose dose not exist");
                                break;
                        }
                    } while (true);
                    break;

                case 4:
                    System.err.println("The end program !!!!");
                    return;
                default:
                    System.err.println("Enter 1-4 !!!!");
            }
        }
    }

    public static void showTheBigMenu() {
        System.out.println("Welcome to the library !");

        System.out.println("1.Go to the book.\n2.Go to the magazine.\n3.Go to the newspaper.\n4.Exit");
    }

    public static Book inputBook() {
        Book bookInput = new Book();
        System.out.println("Please enter the following information");
        System.out.print("Enter id: ");
        while (true) {
            int id = sc.nextInt();
            boolean check = bookInput.setID(id);
            if (check) {
                break;
            } else {
                System.err.println("Id including 5 number,please retype !");
            }
        }
        sc.nextLine();
        System.out.print("Enter producer: ");
        bookInput.setProducer(sc.nextLine());
        System.out.print("Enter release number: ");
        bookInput.setReleaseNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter author: ");
        bookInput.setAuthor(sc.nextLine());
        System.out.print("Enter page: ");
        bookInput.setPage(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter name: ");
        bookInput.setName(sc.nextLine());
        bookInput.setPrice(bookInput.getPage() * 500);
        return bookInput;
    }

    public static Magazine inputMagazine() throws ParseException {
        Magazine magazineInput = new Magazine();
        System.out.println("Please enter the following information");
        System.out.print("Enter id: ");
        while (true) {
            int id = sc.nextInt();
            boolean check = magazineInput.setID(id);
            if (check) {
                break;
            } else {
                System.err.println("Id including 5 number,please retype !");
            }
        }
        sc.nextLine();
        System.out.print("Enter producer: ");
        magazineInput.setProducer(sc.nextLine());
        System.out.print("Enter release number: ");
        magazineInput.setReleaseNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter release month: ");
        magazineInput.setReleaseMonth(sc.nextLine());
        System.out.print("Enter issue number: ");
        magazineInput.setIssueNumber(sc.nextInt());
        magazineInput.setPrice(20000);
        return magazineInput;
    }

    public static Newspaper inputNewspaper() throws ParseException {
        Newspaper newspaperInput = new Newspaper();
        System.out.println("Please enter the following information");
        System.out.print("Enter id: ");
        while (true) {
            int id = sc.nextInt();
            boolean check = newspaperInput.setID(id);
            if (check) {
                break;
            } else {
                System.err.println("Id including 5 number,please retype !");
            }
        }
        sc.nextLine();
        System.out.print("Enter producer: ");
        newspaperInput.setProducer(sc.nextLine());
        System.out.print("Enter release number: ");
        newspaperInput.setReleaseNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter release date: ");
        newspaperInput.setReleaseDate(sc.nextLine());
        newspaperInput.setPrice(15000);
        return newspaperInput;
    }

    public static void display(Document modelOfDocument) {
        System.out.println(modelOfDocument.toString());
    }
}
