package com.proj2.shamirprotocol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }

    public void showFiles(View view){
        intent = new Intent(this, ShowFilesActivity.class);
        startActivity(intent);
    }

    public void shareFiles(View view){
        intent = new Intent(this, ShareFilesActivity.class);
        startActivity(intent);
    }

    public void availableFiles(View view){
        intent = new Intent(this, AvailableFilesActivity.class);
        startActivity(intent);
    }

}