package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ipank extends AppCompatActivity {
    private ListView listViewipank;
    private ArrayAdapter<String> arrayAdapter;
    private String[] programmingLang = {
            "Fatamorgana", "Den Japuik", "Panggalan Sayuik", "Ratok Anak Daro", "Nak Kandaung", "Mencari Ayah",
            "Ranah Minang", "Baban Barek"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipank);

        listViewipank=(ListView) findViewById(R.id.listviewipank);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listViewipank.setAdapter(arrayAdapter);
    }
}