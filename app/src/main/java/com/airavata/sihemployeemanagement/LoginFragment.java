package com.airavata.sihemployeemanagement;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class LoginFragment extends Fragment {
    TextView registerAccountTv;
    Button loginBtn;

    public LoginFragment() {
        // Required empty public constructor
    }
    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Find the views
        registerAccountTv = (TextView) getActivity().findViewById(R.id.fragment_login_register_link);
        loginBtn = (Button) getActivity().findViewById(R.id.fragment_login_submit);

        // Navigate to the register fragment if the user doesn't have an account.
        registerAccountTv.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out); // Set the animations
                transaction.addToBackStack(this.getClass().getName());
                transaction.replace(R.id.main_activity_fragment_container, RegisterFragment.newInstance());
                transaction.commit();

            }
        });

        // TODO Implement the click event
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                // TODO Login
            }
        });
    }

}
