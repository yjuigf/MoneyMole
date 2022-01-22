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

    public static double calcTotalCost() {
        // TODO: calcTotalCost method
        System.out.println("Total Cost method reached!");
        return calcTotalCost();
    }
}
