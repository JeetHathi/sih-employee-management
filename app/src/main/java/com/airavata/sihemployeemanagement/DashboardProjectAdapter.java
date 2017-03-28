package com.airavata.sihemployeemanagement;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DashboardProjectAdapter extends RecyclerView.Adapter<DashboardProjectAdapter.ViewHolder> {
    String[] dataset; // TODO Update string[] dataset to cursor or databaseReference

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView projectNameTV;

        public ViewHolder(View view) {
            super(view);
            projectNameTV = (TextView) view.findViewById(R.id.project_item_project_name);
            // TODO View initialization
        }
    }

    // Constructor
    public DashboardProjectAdapter(String[] dataset) { // TODO Change the type of the dataset
        this.dataset = dataset;
    }

    // Called when a new ViewHolder is to be created
    @Override
    public DashboardProjectAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.projects_recycler_view_item, parent, false);
        return new ViewHolder(view); // TODO Inflate the viewholder
    }

    // Called when the data is to be bound to the ViewHolder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.projectNameTV.setText(dataset[position]);
        // TODO Bind the data from the dataset to the viewholder
    }

    // Used to get the length of the dataset
    @Override
    public int getItemCount() {
        return dataset == null ? 0 : dataset.length; // TODO proper implementation
    }

}
