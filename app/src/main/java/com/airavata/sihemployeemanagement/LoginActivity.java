package com.airavata.sihemployeemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

public class LoginActivity extends AppCompatActivity {
    TextView registerAccountTv;
    EditText usernameEt, passwordEt;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

        // TODO Implement the click event
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO Login

                // Get the user inputted strings
                String username = usernameEt.getText().toString();
                String password = passwordEt.getText().toString();

                // And then login using those credentials
                performLogin(username, password);
            }
        });
    }

    private void performLogin(String username, String password) {
        // Instantiate the RequestQueue
        RequestQueue queue = Volley.newRequestQueue(this);
        String url; // TODO set the url of the webservice

        // Request a string response from the provided url
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                url,
                new Response.Listener<JSONArray>() {
                    @Override public void onResponse(JSONArray jsonArray) {
                        // TODO parse the array
                    }
                },
                new Response.ErrorListener() {
                    @Override public void onErrorResponse(VolleyError volleyError) {
                        Log.e(null, volleyError.getMessage());
                    }
                }
        );

        // Add the request to the requestQueue
        queue.add(jsonArrayRequest);
    }
}
