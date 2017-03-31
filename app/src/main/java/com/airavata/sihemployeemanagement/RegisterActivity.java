package com.airavata.sihemployeemanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
    Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Find the views
        signUpButton = (Button) findViewById(R.id.fragment_register_submit);

        // TODO Implement an onclick event to register
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                // TODO Register
            }
        });
    }
}
