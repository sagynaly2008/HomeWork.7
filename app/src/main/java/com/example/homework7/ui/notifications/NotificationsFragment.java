package com.example.homework7.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.homework7.R;
import com.example.homework7.databinding.FragmentNotificationsBinding;
import com.example.homework7.ui.home.PersonAdapter;
import com.example.homework7.ui.notifications.view_pager.PagerAdapter;
import com.google.android.material.tabs.TabLayoutMediator;

public class NotificationsFragment extends Fragment {

    private PagerAdapter pagerAdapter;
    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pagerAdapter = new PagerAdapter(this);
        binding.viewPager.setAdapter(pagerAdapter);

        new TabLayoutMediator(binding.tabsLayout, binding.viewPager,
                (tab, position) -> tab.setIcon( R.drawable.ic_grid_on)
        ).attach();
    }

}