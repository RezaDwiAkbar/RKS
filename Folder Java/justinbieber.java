package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class justinbieber extends AppCompatActivity {
    private ListView listViewjustinbieber;
    private ArrayAdapter<String> arrayAdapter;
    private String[] programmingLang = {
            "List Lagu", "List Lagu", "List Lagu", "List Lagu","List Lagu", "List Lagu",
            "List Lagu", "List Lagu", "List Lagu", "List Lagu", "List Lagu", "List Lagu","List Lagu",
            "List Lagu", "List Lagu"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_justinbieber);

        listViewjustinbieber=(ListView) findViewById(R.id.listviewjustinbieber);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listViewjustinbieber.setAdapter(arrayAdapter);
    }
}