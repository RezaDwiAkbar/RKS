package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class reggae extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reggae);

        btn1 = (Button)findViewById(R.id.btnbobmarley);
        btn2 = (Button)findViewById(R.id.btntony);
        btn3 = (Button)findViewById(R.id.btnmomonon);
        btn4 = (Button)findViewById(R.id.btndyhohaw);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(reggae.this, bobmarley.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(reggae.this, tony.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(reggae.this, momonon.class));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(reggae.this, dyhohaw.class));
            }
        });
    }
}