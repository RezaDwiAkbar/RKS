package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class felix extends AppCompatActivity {
    private ListView listViewfelix;
    private ArrayAdapter<String> arrayAdapter;
    private String[] programmingLang = {
            "Kekasih Bayangan", "Aku Milikmu Malam Ini", "Pergilah Kasih", "Damai Bersamamu","Tanpa Batas Waktu", "Bintang Di Surga",
            "Elegi Esok Pagi", "Kemesraan", "Mungkin Nanti", "Tersiksa Rindu", "Berita Kepada Kawan", "Bila Aku Jatuh Cinta",
            "Bintang Di Surga", "Cobalah Mengerti", "Jangan Lupakan"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felix);

        listViewfelix=(ListView) findViewById(R.id.listviewfelix);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listViewfelix.setAdapter(arrayAdapter);
    }
}