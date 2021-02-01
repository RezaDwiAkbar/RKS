package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class artist extends AppCompatActivity {
    private Button btnlagu1;
    private Button btnlagu2;
    private Button btnlagu3;
    private Button btnlagu4;
    private Button btnlagu5;
    private Button btnlagu6;
    private Button btnlagu7;
    private Button btnlagu8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        btnlagu3 = findViewById(R.id.btnlagu3);
        btnlagu6 = findViewById(R.id.btnlagu6);
        btnlagu4 = findViewById(R.id.btnlagu4);
        btnlagu5 = findViewById(R.id.btnlagu5);
        btnlagu1 = findViewById(R.id.btnlagu1);
        btnlagu7 = findViewById(R.id.btnlagu7);
        btnlagu2 = findViewById(R.id.btnlagu2);
        btnlagu8 = findViewById(R.id.btnlagu8);

        btnlagu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openipank();
            }
        });

        btnlagu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlasso();
            }
        });

        btnlagu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlastchild();
            }
        });

        btnlagu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openseventeen();
            }
        });

        btnlagu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfelix();
            }
        });

        btnlagu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrizky_febian();
            }
        });

        btnlagu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openafgan();
            }
        });
        btnlagu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openandmesh();
            }
        });
    }

    public void openipank(){
        Intent intent = new Intent(this, ipank.class);
        startActivity(intent);
    }

    public void openfelix(){
        Intent intent = new Intent(this, felix.class);
        startActivity(intent);
    }

    public void openrizky_febian(){
        Intent intent = new Intent(this, rizky_febian.class);
        startActivity(intent);
    }
    public void openafgan(){
        Intent intent = new Intent(this, afgan.class);
        startActivity(intent);
    }
    public void openandmesh(){
        Intent intent = new Intent(this, andmesh.class);
        startActivity(intent);
    }

    public void openseventeen(){
        Intent intent = new Intent(this, seventeen.class);
        startActivity(intent);
    }

    public void openlastchild(){
        Intent intent = new Intent(this, lastchild.class);
        startActivity(intent);
    }

    public void openlasso(){
        Intent intent = new Intent(this, arilasso.class);
        startActivity(intent);
    }
}