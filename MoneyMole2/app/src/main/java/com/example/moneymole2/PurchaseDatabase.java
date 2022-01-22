package com.example.moneymole2;

public class PurchaseDatabase {
    // Main class used for purchase-related functionality

    // Purchase names for each category to be used when prefilling
    // the category of a purchase.
    String[] alcoholNames;
    String[] foodNames;
    String[] transportNames;
    String[] groceriesNames;
    String[] giftsNames;
    String[] eventsNames;
    String[] hobbyNames;
    String[] shoppingNames;
    String[] uniWorkNames;
    String[] billsNames;
    String[] medicalNames;

    Object[] purchases; // All purchases
    Object[] items; // All items

    public PurchaseDatabase(String[] alcoholNames, String[] foodNames, String[] transportNames, String[] groceriesNames, String[] giftsNames, String[] eventsNames, String[] hobbyNames, String[] shoppingNames, String[] uniWorkNames, String[] billsNames, String[] medicalNames, Object[] purchases, Object[] items) {
        this.alcoholNames = alcoholNames;
        this.foodNames = foodNames;
        this.transportNames = transportNames;
        this.groceriesNames = groceriesNames;
        this.giftsNames = giftsNames;
        this.eventsNames = eventsNames;
        this.hobbyNames = hobbyNames;
        this.shoppingNames = shoppingNames;
        this.uniWorkNames = uniWorkNames;
        this.billsNames = billsNames;
        this.medicalNames = medicalNames;
        this.purchases = purchases;
        this.items = items;
    }

    public String[] getAlcoholNames() {
        return alcoholNames;
    }

    public void setAlcoholNames(String[] alcoholNames) {
        this.alcoholNames = alcoholNames;
    }

    public String[] getFoodNames() {
        return foodNames;
    }

    public void setFoodNames(String[] foodNames) {
        this.foodNames = foodNames;
    }

    public String[] getTransportNames() {
        return transportNames;
    }

    public void setTransportNames(String[] transportNames) {
        this.transportNames = transportNames;
    }

    public String[] getGroceriesNames() {
        return groceriesNames;
    }

    public void setGroceriesNames(String[] groceriesNames) {
        this.groceriesNames = groceriesNames;
    }

    public String[] getGiftsNames() {
        return giftsNames;
    }

    public void setGiftsNames(String[] giftsNames) {
        this.giftsNames = giftsNames;
    }

    public String[] getEventsNames() {
        return eventsNames;
    }

    public void setEventsNames(String[] eventsNames) {
        this.eventsNames = eventsNames;
    }

    public String[] getHobbyNames() {
        return hobbyNames;
    }

    public void setHobbyNames(String[] hobbyNames) {
        this.hobbyNames = hobbyNames;
    }

    public String[] getShoppingNames() {
        return shoppingNames;
    }

    public void setShoppingNames(String[] shoppingNames) {
        this.shoppingNames = shoppingNames;
    }

    public String[] getUniWorkNames() {
        return uniWorkNames;
    }

    public void setUniWorkNames(String[] uniWorkNames) {
        this.uniWorkNames = uniWorkNames;
    }

    public String[] getBillsNames() {
        return billsNames;
    }

    public void setBillsNames(String[] billsNames) {
        this.billsNames = billsNames;
    }

    public String[] getMedicalNames() {
        return medicalNames;
    }

    public void setMedicalNames(String[] medicalNames) {
        this.medicalNames = medicalNames;
    }

    public Object[] getPurchases() {
        return purchases;
    }

    public void setPurchases(Object[] purchases) {
        this.purchases = purchases;
    }

    public Object[] getItems() {
        return items;
    }

    public void setItems(Object[] items) {
        this.items = items;
    }
}
