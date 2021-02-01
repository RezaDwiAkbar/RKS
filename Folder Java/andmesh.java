package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class andmesh extends AppCompatActivity {
    private ListView listViewandmesh;
    private  ArrayAdapter<String> arrayAdapter;
    private String[] programmingLang = {
            "Indonesia Raya", "Jangan Rubah Takdirku", "Cinta Luar Biasa", "Hanya Rindu","Nyaman", "Kumau Dia",
            "Jangan Lupakan Aku", "Hanya Rindu", "Sampai Tua Nanti", "Senyumlah", "Apalah Cinta"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andmesh);

        listViewandmesh=(ListView) findViewById(R.id.listviewandmesh);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listViewandmesh.setAdapter(arrayAdapter);
    }
}