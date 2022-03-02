package com.example.moneymole2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.moneymole2.fragments.fragmentAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    ViewPager2 pager2;
    fragmentAdapter adapter;
    private FloatingActionButton addPurchaseBtn;

    //TODO: Connect class files
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tabs
        pager2 = findViewById(R.id.mainPager);
        FragmentManager fm = getSupportFragmentManager();
        adapter = new fragmentAdapter(fm, getLifecycle());
        pager2.setAdapter(adapter);
        pager2.setCurrentItem(1,false);
        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }
        });

        //Add Purchase Button
        addPurchaseBtn = findViewById(R.id.addPurchase);
        addPurchaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddPurchaseActivity();
            }
        });
    }
    public void openAddPurchaseActivity() {
        Intent intent = new Intent(this, addPurchaseActivity.class);
        startActivity(intent);
    }
}