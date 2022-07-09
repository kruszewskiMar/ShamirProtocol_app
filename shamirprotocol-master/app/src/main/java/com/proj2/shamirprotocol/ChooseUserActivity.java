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

public class ChooseUserActivity extends AppCompatActivity {

    private ListView mListView;
    private String[] users = {"Chuj", "Dupa", "Cycki", "Chuj1", "Chuj2", "Dorotka", "Chuj", "Dupa", "Cycki", "Chuj1", "Chuj2",
            "Dorotka", "Chuj", "Dupa", "Cycki", "Chuj1", "Chuj2", "Dorotka", "Chuj", "Dupa", "Cycki", "Chuj1", "Chuj2", "Dorotka"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_user);

        mListView = findViewById(R.id.listViewUser);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, users
        );
        mListView.setAdapter(adapter);
        registerForContextMenu(mListView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
    }

    public void goBackToMenu(View view){
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }


//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//
//
//        if (item.getItemId() == R.id.askForPermission){
//            Chłopaki
//        }
//
//        return false;
//    }
}