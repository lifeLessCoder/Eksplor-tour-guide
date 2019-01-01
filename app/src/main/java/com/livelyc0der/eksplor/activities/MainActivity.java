package com.livelyc0der.eksplor.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.livelyc0der.eksplor.R;
import com.livelyc0der.eksplor.adapters.PlacePagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null)
            getSupportActionBar().setElevation(0);

        ViewPager viewPager = findViewById(R.id.viewpager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);

        PlacePagerAdapter adapter = new PlacePagerAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_attraction);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_beach);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_nearby);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_restaurant);
    }
}
