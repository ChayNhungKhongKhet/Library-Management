package com.java.dao;

import com.java.model.Magazine;

import java.util.ArrayList;
import java.util.Scanner;

public class MagazineManagement {

    private ArrayList<Magazine> magazineList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public ArrayList<Magazine> getMagazineList() {
        return magazineList;
    }

    public void showMenu() {
        System.out.println("Welcome to the magazine !");
        System.out.println("Please choose an action !\n1.Add magazine\n2.Remove magazine\n3.Search magazine\n4.Show magazine\n5.Update v\n6.Show magazine\n7.Exit");
    }

    public boolean conditionalID(int id) {
        for (Magazine conditionalAdd : magazineList) {
            if (conditionalAdd.getID() == id) {
                System.err.println("Id of book has exist !");
                return false;
            }
        }
        return true;
    }

    public void addMagazine(Magazine addMagazine) {
        if (conditionalID(addMagazine.getID())) {
            magazineList.add(addMagazine);
        } else {
            System.err.println("Not successfully");
        }

    }

    public void removeMagazine(Magazine removeMagazine) {
        magazineList.remove(removeMagazine);
    }

    public void updateMagazine(Magazine updatedMagazine) {
        System.out.print("Choose order number want update: \n1.Release number\n2.Producer\n3.Id\n");
        int choose = sc.nextInt();
        sc.nextLine();
        if (choose < 1 || choose > 4) {
            System.err.println("The choose does not exist !");
            return;
        }
        if (choose == 1) {
            System.out.print("Enter new release number: ");
            updatedMagazine.setReleaseNumber(sc.nextInt());
        }
        if (choose == 2) {
            System.out.print("Enter new producer: ");
            updatedMagazine.setProducer(sc.nextLine());
        }
        if (choose == 3) {
            while (true) {
                System.out.print("Enter new Id: ");
                int idCheck = sc.nextInt();
                sc.nextLine();
                if (updatedMagazine.getID() != idCheck) {

                    if (!conditionalID(idCheck)) {
                        System.err.println("Update not successfully !, Please retype !");
                    } else {
                        boolean check = updatedMagazine.setID(idCheck);
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


    public Magazine searchByID(int ID) {
        for (Magazine magazine : magazineList) {
            if (magazine.getID() == ID) {
                return magazine;
            }
        }
        System.err.println("Id does not exist !");
        return null;
    }

}
