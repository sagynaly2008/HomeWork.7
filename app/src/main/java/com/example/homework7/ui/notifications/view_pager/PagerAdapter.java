package com.example.homework7.ui.notifications.view_pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter extends FragmentStateAdapter {

    public static final int NUM_PAGES = 2;

    public PagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 :
                return new FirstFragment();
            case 1:
                return new FragmentBlank2();
                
            default:
                return new FirstFragment();
        }
    }

    @Override
    public int getItemCount() {
        return NUM_PAGES;
    }
}
