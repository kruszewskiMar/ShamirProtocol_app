package com.proj2.shamirprotocol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ShowFilesActivity extends AppCompatActivity {

    private ListView mListView;
    private String[] files = {"Chuj", "Dupa", "Cycki", "Chuj1", "Chuj2", "Dorotka", "Chuj", "Dupa", "Cycki", "Chuj1", "Chuj2",
            "Dorotka", "Chuj", "Dupa", "Cycki", "Chuj1", "Chuj2", "Dorotka", "Chuj", "Dupa", "Cycki", "Chuj1", "Chuj2", "Dorotka"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_files);

        mListView = findViewById(R.id.listViewId);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, files
        );
        mListView.setAdapter(adapter);
        registerForContextMenu(mListView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {


        if (item.getItemId() == R.id.chooseAction){
            Intent intent = new Intent(this, ChooseUserActivity.class);
            startActivity(intent);
        }

        return false;
    }
}