package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class afgan extends AppCompatActivity {
    private ListView listViewafgan;
    private ArrayAdapter<String> arrayAdapter;
    private String[] programmingLang = {
            "Terima Kasih Cinta", "Panah Asmara", "Jodoh Pasti Bertemu", "Bawalah Cintaku","Padamu Ku Bersujud", "Sadis",
            "Sudah", "Tunjukkan", "Untukmu Aku Bertahan", "Jauh", "Without You", "Demi Kamu dan Aku","Tanpa Bahasa",
            "Tak Peduli", "Cinta 2 Hati"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afgan);

        listViewafgan=(ListView) findViewById(R.id.listviewafgan);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listViewafgan.setAdapter(arrayAdapter);
    }
}