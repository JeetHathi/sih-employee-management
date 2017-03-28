package com.airavata.sihemployeemanagement;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class RegisterFragment extends Fragment {
    Button signUpButton;
    public RegisterFragment() {
        // Required empty public constructor
    }

    public static RegisterFragment newInstance() {
        return new RegisterFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Initialize the views
        signUpButton = (Button) getActivity().findViewById(R.id.fragment_register_submit);

        // TODO Implement an onclick event to register
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                // TODO Register
            }
        });
    }

}
