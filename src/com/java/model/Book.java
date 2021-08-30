package com.java.model;

import java.util.Collections;

public class Book extends Document{
    private String author;
    private int page;
    private String name;
    private double price;

    @Override
    public String toString() {
        return "[Id= " + ID + ", Producer=" + producer + ", Release number=" + releaseNumber + ", Author=" + author + ", Page=" + page + ", Name=" + name + ", Price=" + price + "]";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
