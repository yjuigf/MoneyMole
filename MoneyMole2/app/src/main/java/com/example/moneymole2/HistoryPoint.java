package com.example.moneymole2;

import java.util.Date;

public class HistoryPoint {
    // Contains the purchase instance of an object


    public HistoryPoint(double pointCost, Date pointDate, String pointPurchaseName) {
        this.pointCost = pointCost;
        this.pointDate = pointDate;
        this.pointPurchaseName = pointPurchaseName;
    }

    public double getPointCost() {
        return pointCost;
    }

    public void setPointCost(double pointCost) {
        this.pointCost = pointCost;
    }

    public Date getPointDate() {
        return pointDate;
    }

    public void setPointDate(Date pointDate) {
        this.pointDate = pointDate;
    }

    public String getPointPurchaseName() {
        return pointPurchaseName;
    }

    public void setPointPurchaseName(String pointPurchaseName) {
        this.pointPurchaseName = pointPurchaseName;
    }

    double pointCost;
    Date pointDate;
    String pointPurchaseName;
}
