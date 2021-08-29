package com.java.model;

public class Book extends Document{
    private String author;
    private int page;

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

    @Override
    public double calcualateCost() {
        return page * 500;
    }
}
