package com.example.fragmentstateadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    private String[] title={"Home","Status"};
    ViewpagerFragmentAdapter adapter;
    ViewPager2 viewPager2;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        viewPager2=findViewById(R.id.viewPager2);
        tabLayout=findViewById(R.id.tabLayout);

        adapter=new ViewpagerFragmentAdapter(this);
        viewPager2.setAdapter(adapter);
        new TabLayoutMediator(tabLayout,viewPager2,((tab, position) -> tab.setText(title[position]))).attach();
    }
}