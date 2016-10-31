package com.example.linux.myapplication_listviewsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // listView1
        final ListView lsView = (ListView)findViewById(R.id.listView1);

        String[] mTestArray;
        ArrayAdapter<String> adapter;

        mTestArray = getResources().getStringArray(R.array.country_array);

        adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                mTestArray);

        lsView.setAdapter(adapter);
    }




}
