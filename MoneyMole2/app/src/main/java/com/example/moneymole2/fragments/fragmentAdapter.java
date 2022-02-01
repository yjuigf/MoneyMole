package com.example.moneymole2.fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.moneymole2.fragments.analysis.anaylsis;
import com.example.moneymole2.fragments.history.history;

public class fragmentAdapter extends FragmentStateAdapter {
    public fragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new anaylsis();
            case 1:
                return new history();
        }
        return new history();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
