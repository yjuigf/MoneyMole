package com.example.moneymole2;

import org.w3c.dom.ls.LSOutput;
import java.util.Date;

public class Purchase {
    // Contains data for a single purchase

    String name;
    int category;
    Date date;
    int[] itemList;
    String comments;

    public Purchase(String name, int category, Date date, int[] itemList, String comments) {
        this.name = name;
        this.category = category;
        this.date = date;
        this.itemList = itemList;
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int[] getItemList() {
        return itemList;
    }

    public void setItemList(int[] itemList) {
        this.itemList = itemList;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public double calcTotalCost(int[] itemList) {
        // TODO: transfer data from PurchaseDatabase for item prices
        double output = 0;
        for (int i=0; i<itemList.length; i++) {
            output += items[itemList[i]].price;
        }
        return output;
    }
}
