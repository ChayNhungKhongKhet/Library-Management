package com.java.model;

import java.util.ArrayList;

public abstract class Document {
    protected int ID;
    protected String producer;
    protected int releaseNumber;

    public int getID() {
        return ID;
    }


    public boolean setID(int ID) {
        int idClone = ID;
        int count = 1;
        if (ID != 0) {
            while (idClone > 10) {
                idClone = idClone / 10;
                count++;
            }
        }
        if (count == 5) {
            this.ID = ID;
            return true;
        }
        return false;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }
}
