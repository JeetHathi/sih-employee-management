package com.airavata.sihemployeemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {
    TextView registerAccountTv;
    EditText usernameEt, passwordEt;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(null, "MainActivity started");
        setContentView(R.layout.activity_login);

        // Find the views
        registerAccountTv = (TextView) findViewById(R.id.fragment_login_register_link);
        loginBtn = (Button) findViewById(R.id.fragment_login_submit);
        usernameEt = (EditText) findViewById(R.id.fragment_login_username);
        passwordEt = (EditText) findViewById(R.id.fragment_login_password);

        // Navigate to the register fragment if the user doesn't have an account.
        registerAccountTv.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(null, "Attempting log in");
                // TODO Login

                // Get the user inputted strings
                String username = usernameEt.getText().toString();
                String password = passwordEt.getText().toString();

                // And then login using those credentials
                performLogin(username, password);
            }
        });
    }

    private void performLogin(final String email, final String password) {
        User user = new User();
        user.setEmail(email);

        APIControll
    }
}
