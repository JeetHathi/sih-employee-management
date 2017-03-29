package com.airavata.sihemployeemanagement;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

public class ProjectHomePagerAdapter extends FragmentStatePagerAdapter {
    private Context context;
    private final int tabCount = 2;
    private String[] tabTitles;

    public ProjectHomePagerAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);

        // Set the context
        this.context = context;

        // Initialize the tab's titles
        tabTitles = context.getResources().getStringArray(R.array.tab_names);
    }

    @Override
    public int getCount() {
        return tabTitles == null ? 0 : tabTitles.length;
    }

    @Override
    public Fragment getItem(int position) {
        // TODO Return tabs
        switch (position) {
            case 0:
                return LoginFragment.newInstance();
            case 1:
                return RegisterFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
