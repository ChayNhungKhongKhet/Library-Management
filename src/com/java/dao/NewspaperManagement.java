package com.java.dao;


import com.java.model.Newspaper;

import java.util.ArrayList;
import java.util.Scanner;

public class NewspaperManagement {

    private ArrayList<Newspaper> newsPaperList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public ArrayList<Newspaper> getNewspaperList() {
        return newsPaperList;
    }

    public void showMenu() {
        System.out.println("Welcome to the book !");
        System.out.println("Please choose an action !\n1.Add book\n2.Remove book\n3.Search book\n4.Show book\n5.Update book\n6.Show menu\n7.Exit");
    }

    public boolean conditionalID(int id) {
        for (Newspaper conditionalAdd : newsPaperList) {
            if (conditionalAdd.getID() == id) {
                System.err.println("Id of book has exist !");
                return false;
            }
        }
        return true;
    }

    public void addNewspaper(Newspaper addNewspaper) {
        if (conditionalID(addNewspaper.getID())) {
            newsPaperList.add(addNewspaper);
        } else {
            System.err.println("Not successfully");
        }

    }

    public void removeNewspaper(Newspaper removeBook) {
        newsPaperList.remove(removeBook);
    }

    public void updateNewspaper(Newspaper updatedNewspaper) {
        System.out.print("Choose order number want update: \n1.Release number\n2.Producer\n3.Id\n");
        int choose = sc.nextInt();
        sc.nextLine();
        if (choose < 1 || choose > 4) {
            System.err.println("The choose does not exist !");
            return;
        }
        if (choose == 1) {
            System.out.print("Enter new release number: ");
            updatedNewspaper.setReleaseNumber(sc.nextInt());
        }
        if (choose == 2) {
            System.out.print("Enter new producer: ");
            updatedNewspaper.setProducer(sc.nextLine());
        }
        if (choose == 3) {
            while (true) {
                System.out.print("Enter new Id: ");
                int idCheck = sc.nextInt();
                sc.nextLine();
                if (updatedNewspaper.getID() != idCheck) {

                    if (!conditionalID(idCheck)) {
                        System.err.println("Update not successfully !, Please retype !");
                    } else {
                        boolean check = updatedNewspaper.setID(idCheck);
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

    }


    public Newspaper searchByID(int ID) {
        for (Newspaper newspaper : newsPaperList) {
            if (newspaper.getID() == ID) {
                return newspaper;
            }
        }
        System.err.println("Id does not exist !");
        return null;
    }

}
