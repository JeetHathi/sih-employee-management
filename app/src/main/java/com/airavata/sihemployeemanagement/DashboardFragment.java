package com.airavata.sihemployeemanagement;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DashboardFragment extends Fragment {
    RecyclerView projectsRecyclerView;
    FloatingActionButton newProjectFAB;

    public DashboardFragment() {
        // Required empty public constructor
    }

    public static DashboardFragment newInstance() {
        return new DashboardFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Find the views
        projectsRecyclerView = (RecyclerView) getActivity().findViewById(R.id.fragment_dashboard_projects_recycler);
        newProjectFAB = (FloatingActionButton) getActivity().findViewById(R.id.fragment_dashboard_new_project_fab);

        // Initialize projectsRecyclerView
        RecyclerView.LayoutManager projectsLayoutManager = new LinearLayoutManager(getContext());
        projectsRecyclerView.setLayoutManager(projectsLayoutManager);

        RecyclerView.Adapter projectsAdapter = new DashboardProjectAdapter(null);
        projectsRecyclerView.setAdapter(projectsAdapter);

    }

}
