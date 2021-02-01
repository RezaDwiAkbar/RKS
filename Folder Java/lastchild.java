package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lastchild extends AppCompatActivity {
    private ListView listViewlastchild;
    private ArrayAdapter<String> arrayAdapter;
    private String[] programmingLang = {
            "Pedih", "Diary Depresiku", "Tak Pernah Ternilai", "Ketidakrelaanku","Seluruh Nafas Ini", "Bernafas Tanpamu",
            "Penantian", "Percayalah", "Sekuat Hatimu", "Lagu Terakhir Untukmu", "Indahkah Perbedaan", "Dunia Untukmu",
            "Duka", "Sadarkan Aku", "Seharusnya"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lastchild);

        listViewlastchild=(ListView) findViewById(R.id.listviewlastchild);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listViewlastchild.setAdapter(arrayAdapter);
    }
}