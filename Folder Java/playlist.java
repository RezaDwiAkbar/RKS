package com.dwiakbarreza.joox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class playlist extends AppCompatActivity {
    private Button playlist1;
    private Button playlist2;
    private Button playlist4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        playlist1 = (Button)findViewById(R.id.btnplaylist1);
        playlist2 = (Button)findViewById(R.id.btnplaylist2);
        playlist4 = (Button)findViewById(R.id.btnplaylist4);

        playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(playlist.this, internasional.class));
            }
        });

        playlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(playlist.this, kpop.class));
            }
        });

        playlist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(playlist.this, reggae.class));
            }
        });
    }
}