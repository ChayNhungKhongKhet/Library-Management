package com.java.model;

import java.util.Date;

public class Magazine extends Document {
    private String releaseMonth;
    private int issueNumber;
    private double price;

    @Override
    public String toString() {
        return "[Id= " + ID + ", Producer=" + producer + ", Release number=" + releaseNumber + ", Release month=" + releaseMonth + ", Issue number=" + issueNumber + ", Price=" + price + "]";
    }

    public String getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(String releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = 20000;
    }
}
