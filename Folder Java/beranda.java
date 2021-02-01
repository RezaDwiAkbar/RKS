package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class beranda extends AppCompatActivity {
    private Button btnfavorit;
    private Button btnartis;
    private Button btnplaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        btnartis = findViewById(R.id.btnartis);
        btnplaylist = findViewById(R.id.btnplaylist);
        btnfavorit = findViewById(R.id.btnfavorit);

        btnfavorit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfavorit();
            }
        });

        btnplaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openplaylist();
            }
        });

        btnartis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openartist();
            }
        });
    }
    public void openartist(){
        Intent intent = new Intent(this, artist.class);
        startActivity(intent);
    }

    public void openplaylist(){
        Intent intent = new Intent(this, playlist.class);
        startActivity(intent);
    }

    public void openfavorit(){
        Intent intent = new Intent(this, favorit.class);
        startActivity(intent);
    }

}