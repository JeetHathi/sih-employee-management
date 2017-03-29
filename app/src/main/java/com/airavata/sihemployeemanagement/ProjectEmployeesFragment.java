package com.airavata.sihemployeemanagement;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProjectEmployeesFragment extends Fragment {
    RecyclerView employeesRecyclerView;
    FloatingActionButton newEmployeeFAB;

    public ProjectEmployeesFragment() {
        // Required empty public constructor
    }

    public static ProjectEmployeesFragment newInstance() {
        ProjectEmployeesFragment fragment = new ProjectEmployeesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_project_employees, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Find the views
        employeesRecyclerView = (RecyclerView) getActivity().findViewById(R.id.fragment_project_employees_recycler);
        newEmployeeFAB = (FloatingActionButton) getActivity().findViewById(R.id.fragment_project_employees_new_employee_fab);

        // Initialize employeesRecyclerView
        RecyclerView.LayoutManager employeesLayoutManager = new LinearLayoutManager(getContext());
        employeesRecyclerView.setLayoutManager(employeesLayoutManager);

        // And set it's adapter
        RecyclerView.Adapter adapter = new ProjectEmployeesAdapter(getContext(), new String[]{"Bill Gates", "Steve Jobs"});
        employeesRecyclerView.setAdapter(adapter);
    }

}