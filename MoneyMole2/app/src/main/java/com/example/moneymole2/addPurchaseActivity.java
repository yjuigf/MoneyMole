package com.example.moneymole2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.moneymole2.fragments.addPurchase.addPurchaseInput;

public class addPurchaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_purchase);

        //Fragments (multi-page form)
        getSupportFragmentManager().beginTransaction().add(R.id.purchaseFragment, new addPurchaseInput()).commit();
    }
}