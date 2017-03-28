package com.airavata.sihemployeemanagement;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class DashboardProjectAdapter extends RecyclerView.Adapter<DashboardProjectAdapter.ViewHolder> {
    String[] dataset; // TODO Update string[] dataset to cursor or databaseReference
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
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
        return new ViewHolder(null); // TODO Inflate the viewholder
    }

    // Called when the data is to be bound to the ViewHolder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // TODO Bind the data from the dataset to the viewholder
    }

    @Override
    public int getItemCount() {
        return dataset.length; // TODO proper implementation
    }

}
