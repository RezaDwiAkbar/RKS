package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class momonon extends AppCompatActivity {
    private ListView listViewmomonon;
    private ArrayAdapter<String> arrayAdapter;
    private String[] programmingLang = {
            "List Lagu", "List Lagu", "List Lagu", "List Lagu","List Lagu", "List Lagu",
            "List Lagu", "List Lagu", "List Lagu", "List Lagu", "List Lagu", "List Lagu","List Lagu",
            "List Lagu", "List Lagu"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_momonon);

        listViewmomonon=(ListView) findViewById(R.id.listviewmomonon);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listViewmomonon.setAdapter(arrayAdapter);
    }
}