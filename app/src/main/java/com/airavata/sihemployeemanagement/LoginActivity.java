package com.airavata.sihemployeemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView registerAccountTv;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Find the views
        registerAccountTv = (TextView) findViewById(R.id.fragment_login_register_link);
        loginBtn = (Button) findViewById(R.id.fragment_login_submit);

        // Navigate to the register fragment if the user doesn't have an account.
        registerAccountTv.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
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
