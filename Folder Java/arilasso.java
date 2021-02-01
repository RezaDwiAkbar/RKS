package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class arilasso extends AppCompatActivity {
    private ListView listViewlasso;
    private ArrayAdapter<String> arrayAdapter;
    private String[] programmingLang = {
            "Badai Pasti Berlalu", "Lirih", "Seandainya", "Aku Bukanlah Diriku","Kisah Kita", "Hampa",
            "Cinta Terakhir", "Misteri Ilahi", "Satu Cinta", "Penjaga Hati", "Arti Cinta", "Perbedaan",
            "Doan Untuk Cinta", "Tolonglah Aku", "Kau"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arilasso);

        listViewlasso=(ListView) findViewById(R.id.listviewlasso);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listViewlasso.setAdapter(arrayAdapter);
    }
}