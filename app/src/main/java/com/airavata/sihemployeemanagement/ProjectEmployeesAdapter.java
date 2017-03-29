package com.airavata.sihemployeemanagement;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProjectEmployeesAdapter extends RecyclerView.Adapter<ProjectEmployeesAdapter.ViewHolder> {
    private Context context;
    String[] dataSet; // TODO Update string[] dataSet to cursor or databaseReference

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private Context context;
        TextView employeeNameTV;

        public ViewHolder(Context context, View view) {
            super(view);
            this.context = context;
            employeeNameTV = (TextView) view.findViewById(R.id.employee_item_employee_name);
            // TODO View initialization

            view.setOnClickListener(this); // Allow it to receive click events
        }

        @Override
        public void onClick(View view) {
            // TODO Show employee details
        }
    }

    // Constructor
    public ProjectEmployeesAdapter(Context context, String[] dataSet) {
        this.context = context;
        this.dataSet = dataSet;
    }

    // Called when the new ViewHolder is to be created
    @Override
    public ProjectEmployeesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.project_employees_recycler_view_item, parent, false);
        return new ViewHolder(context, view);
    }

    // Called when the data is to be bound to the ViewHolder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.employeeNameTV.setText(dataSet[position]);
    }

    // Used to get the length of the dataSet
    @Override
    public int getItemCount() {
        return dataSet == null ? 0 : dataSet.length;
    }
}
