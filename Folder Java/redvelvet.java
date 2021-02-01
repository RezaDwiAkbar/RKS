package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class redvelvet extends AppCompatActivity {
    private ListView listViewredvelvet;
    private ArrayAdapter<String> arrayAdapter;
    private String[] programmingLang = {
            "List Lagu", "List Lagu", "List Lagu", "List Lagu","List Lagu", "List Lagu",
            "List Lagu", "List Lagu", "List Lagu", "List Lagu", "List Lagu", "List Lagu","List Lagu",
            "List Lagu", "List Lagu"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redvelvet);

        listViewredvelvet=(ListView) findViewById(R.id.listviewredvelvet);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listViewredvelvet.setAdapter(arrayAdapter);
    }
}