package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class seventeen extends AppCompatActivity {
    private ListView listViewseventeen;
    private ArrayAdapter<String> arrayAdapter;
    private String[] programmingLang = {
            "Kemarin", "Menemukanmu", "Jaga Slalu Hatimu", "Selalu Mengalah","Sampaiku Menemukanmu", "Jalan Terbaik",
            "Aku", "Hal Terindah", "Untuk Menemukanmu", "HIT", "Cinta Jangan Sembunyi", "Cinta Tak Bertuan",
            "Ayah", "Menunggu Kamu", "Memikirkan Dia", "Tak tepat Waktu","Jangan Dulu Pergi", "Aku Gila"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeen);

        listViewseventeen=(ListView) findViewById(R.id.listviewseventeen);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listViewseventeen.setAdapter(arrayAdapter);
    }
}