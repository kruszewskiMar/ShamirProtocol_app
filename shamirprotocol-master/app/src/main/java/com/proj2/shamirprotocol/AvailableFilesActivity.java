package com.proj2.shamirprotocol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AvailableFilesActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_files);

        ListView listView = findViewById(R.id.listViewOpen);

        List<String> list = new ArrayList<>();
        list.add("lista.txt");
        list.add("lista1.txt");
        list.add("lista2.txt");
        list.add("lista3.txt");
        list.add("lista.txt");
        list.add("lista1.txt");
        list.add("lista2.txt");
        list.add("lista3.txt");
        list.add("lista.txt");
        list.add("lista1.txt");
        list.add("lista2.txt");
        list.add("lista3.txt");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivities(new Intent[]{new Intent(AvailableFilesActivity.this, TextActivity.class)});
            }
        });
    }
}