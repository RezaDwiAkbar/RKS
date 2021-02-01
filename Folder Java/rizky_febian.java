package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class rizky_febian extends AppCompatActivity {
    private ListView listViewfebian;
    private ArrayAdapter<String> arrayAdapter;
    private String[] programmingLang = {
            "Cuek", "Mantra Cinta", "Makna Cinta", "Menari","Berpisah Itu Mudah", "Tak Ingin Pisah Lagi",
            "Ragu", "Indah Pada Waktunya", "Hargai Cinta", "Kesempurnaan Cinta", "Cukup Tau", "Rasakanlah",
            "Nona", "Reuni", "Pergi Menjauh", "Hanya Engkau","Keseriusan", "Bahasa Cinta"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rizky_febian);

        listViewfebian=(ListView) findViewById(R.id.listviewfebian);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listViewfebian.setAdapter(arrayAdapter);
    }
}