package com.airavata.sihemployeemanagement;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DashboardProjectAdapter extends RecyclerView.Adapter<DashboardProjectAdapter.ViewHolder> {
    String[] dataSet; // TODO Update string[] dataSet to cursor or databaseReference

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView projectNameTV;

        public ViewHolder(View view) {
            super(view);
            projectNameTV = (TextView) view.findViewById(R.id.project_item_project_name);
            // TODO View initialization
            view.setOnClickListener(this);
        }

        @Override public void onClick(View view) {
            // TODO Open the project and view/modify it's details
        }
    }

    // Constructor
    public DashboardProjectAdapter(String[] dataSet) { // TODO Change the type of the dataSet
        this.dataSet = dataSet;
    }

    // Called when a new ViewHolder is to be created
    @Override
    public DashboardProjectAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.projects_recycler_view_item, parent, false);
        return new ViewHolder(view); // TODO Inflate the ViewHolder
    }

    // Called when the data is to be bound to the ViewHolder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.projectNameTV.setText(dataSet[position]);
        // TODO Bind the data from the dataSet to the ViewHolder
    }

    // Used to get the length of the dataSet
    @Override
    public int getItemCount() {
        return dataSet == null ? 0 : dataSet.length; // TODO proper implementation
    }

}
