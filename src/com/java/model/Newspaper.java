package com.java.model;


import java.util.Date;

public class Newspaper extends Document {
    private String releaseDate;
    private double price;


    @Override
    public String toString() {
        return "[Id= " + ID + ", Producer=" + producer + ", Release number=" + releaseNumber + ", Release date=" + releaseDate + ", Price=" + price + "]";
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = 15000;
    }
}
