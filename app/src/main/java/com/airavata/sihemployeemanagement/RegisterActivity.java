package com.airavata.sihemployeemanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
    Button signUpButton;
    EditText usernameEt, emailEt, passwordEt, confirmPasswordEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Find the views
        usernameEt = (EditText) findViewById(R.id.fragment_register_username);
        emailEt = (EditText) findViewById(R.id.fragment_register_email);
        passwordEt = (EditText) findViewById(R.id.fragment_register_password);
        confirmPasswordEt = (EditText) findViewById(R.id.fragment_register_confirm_password);
        signUpButton = (Button) findViewById(R.id.fragment_register_submit);

        // TODO Implement an onclick event to register
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                // TODO Register

                // Get the user inputted strings
                String username = usernameEt.getText().toString();
                String email = emailEt.getText().toString();
                String password = passwordEt.getText().toString();
                String confirmPassword = confirmPasswordEt.getText().toString();

                // And then register using those credentials
                performRegister(username, email, password, confirmPassword);
            }
        });
    }

    private void performRegister(final String username, final String email, final String password, final String confirmPassword) {
        // Instantiate the RequestQueue
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = ""; // TODO set the url of the webservice

        Map<String, String> jsonParams = new HashMap<String, String>();
        jsonParams.put("email", email);
        jsonParams.put("password", password);

        // Request a jsonArray response from the provided url
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                url,
                new Response.Listener<JSONArray>() {
                    @Override public void onResponse(JSONArray jsonArray) {
                        // TODO parse the array
                        Log.i(null, "JSON Received: " + jsonArray.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override public void onErrorResponse(VolleyError volleyError) {
                        Log.e(null, volleyError.getMessage());
                    }

                }
        ){
            @Override protected Map<String, String> getParams() {
                Map<String,String> params = new HashMap<String, String>();
                params.put("email", email);
                params.put("password", password);

                return params;
            }
        };

        // Add the request to the requestQueue
        queue.add(jsonArrayRequest);
    }
}
