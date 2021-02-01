package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class arianagrande extends AppCompatActivity {
    private ListView listViewariana;
    private ArrayAdapter<String> arrayAdapter;
    private String[] programmingLang = {
            "List Lagu", "List Lagu", "List Lagu", "List Lagu","List Lagu", "List Lagu",
            "List Lagu", "List Lagu", "List Lagu", "List Lagu", "List Lagu", "List Lagu","List Lagu",
            "List Lagu", "List Lagu"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arianagrande);

        listViewariana=(ListView) findViewById(R.id.listviewariana);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listViewariana.setAdapter(arrayAdapter);
    }
}