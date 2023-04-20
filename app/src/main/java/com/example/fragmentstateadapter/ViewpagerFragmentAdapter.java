package com.example.fragmentstateadapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewpagerFragmentAdapter extends FragmentStateAdapter {
    private String[] title={"Home","Status"};


    public ViewpagerFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewpagerFragmentAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewpagerFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new HomeFragment();
            case 1: return new StatusFragment();
        }
        return new HomeFragment();
    }

    @Override
    public int getItemCount() {
        return title.length;
    }
}
