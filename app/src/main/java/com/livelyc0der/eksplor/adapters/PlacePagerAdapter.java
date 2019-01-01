package com.livelyc0der.eksplor.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.livelyc0der.eksplor.R;
import com.livelyc0der.eksplor.fragments.AttractionFragment;
import com.livelyc0der.eksplor.fragments.BeachFragment;
import com.livelyc0der.eksplor.fragments.NearByFragment;
import com.livelyc0der.eksplor.fragments.RestaurantFragment;

public class PlacePagerAdapter extends FragmentPagerAdapter {

    private final Context context;

    public PlacePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int pos) {
        switch (pos) {
            case 0:
                return new AttractionFragment();
            case 1:
                return new BeachFragment();
            case 2:
                return new NearByFragment();
            case 3:
                return new RestaurantFragment();
            default:
                return new AttractionFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.attractions);
            case 1:
                return context.getString(R.string.beaches);
            case 2:
                return context.getString(R.string.near_by);
            case 3:
                return context.getString(R.string.restaurants);
            default:
                return context.getString(R.string.attractions);
        }
    }
}
