package com.airavata.sihemployeemanagement;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProjectDetailsFragment extends Fragment {
    TextView projectNameTV, projectOwnerTV, projectDeadlineTV, projectBudgetTV, projectStartDateTV, projectCommentsTV;

    public ProjectDetailsFragment() {
        // Required empty public constructor
    }
    public static ProjectDetailsFragment newInstance() {
        return new ProjectDetailsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_project_details, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Find the views
        projectNameTV = (TextView) getActivity().findViewById(R.id.fragment_project_details_project_name);
        projectOwnerTV = (TextView) getActivity().findViewById(R.id.fragment_project_details_project_owner);
        projectDeadlineTV = (TextView) getActivity().findViewById(R.id.fragment_project_details_project_deadline);
        projectBudgetTV = (TextView) getActivity().findViewById(R.id.fragment_project_details_project_budget);
        projectStartDateTV = (TextView) getActivity().findViewById(R.id.fragment_project_details_project_start_date);
        projectCommentsTV = (TextView) getActivity().findViewById(R.id.fragment_project_details_project_comments);

        // TODO initialize the views with data from the database
    }

}
