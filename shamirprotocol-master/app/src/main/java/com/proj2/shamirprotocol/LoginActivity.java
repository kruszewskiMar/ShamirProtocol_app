package com.proj2.shamirprotocol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){
        EditText emailText = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText passwordText = (EditText) findViewById(R.id.editTextTextPassword);
        String email = emailText.getText().toString();
        String password = passwordText.getText().toString();
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }
}