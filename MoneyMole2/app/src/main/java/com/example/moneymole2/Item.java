package com.example.moneymole2;

public class Item {
    // Contains item's name and list of history points

    String itemName;
    Object[] itemHistory;

    public Item(String itemName, Object[] itemHistory) {
        this.itemName = itemName;
        this.itemHistory = itemHistory;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Object[] getItemHistory() {
        return itemHistory;
    }

    public void setItemHistory(Object[] itemHistory) {
        this.itemHistory = itemHistory;
    }

    public void addHistoryPoint(String[] historyPoint) {
        this.itemHistory[this.itemHistory.length - 1] = historyPoint;
    }
}
