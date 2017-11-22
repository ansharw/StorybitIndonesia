package com.example.android.storybitindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton img1 = (ImageButton)findViewById(R.id.imageButton1);
        ImageButton img2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton img3 = (ImageButton)findViewById(R.id.imageButton3);
        ImageButton img4 = (ImageButton)findViewById(R.id.imageButton4);
        ImageButton img5 = (ImageButton)findViewById(R.id.imageButton5);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jb = new Intent(MainActivity.this,jawaBarat.class);
                startActivity(jb);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jt = new Intent(MainActivity.this,jawaTengah.class);
                startActivity(jt);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jtm = new Intent(MainActivity.this,jawaTimur.class);
                startActivity(jtm);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ss = new Intent(MainActivity.this,sulSel.class);
                startActivity(ss);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kb = new Intent(MainActivity.this,kalBar.class);
                startActivity(kb);
            }
        });

    }
}
