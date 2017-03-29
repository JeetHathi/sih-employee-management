package com.airavata.sihemployeemanagement;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

public class ProjectHomeFragment extends Fragment {
    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter adapter;

    public ProjectHomeFragment() {
        // Required empty public constructor
    }

    public static ProjectHomeFragment newInstance() {
        return new ProjectHomeFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_project_home, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Find the views
        viewPager = (ViewPager) getActivity().findViewById(R.id.fragment_project_home_viewpager);
        tabLayout = (TabLayout) getActivity().findViewById(R.id.fragment_project_home_tab_layout);
        adapter = new ProjectHomePagerAdapter(getContext(), getActivity().getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }
}
