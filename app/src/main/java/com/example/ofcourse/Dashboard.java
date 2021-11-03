package com.example.ofcourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {
    public CardView matematika,kimia,fisika,biologi,english,tpa;
    ImageButton buttonHome, buttonCari, buttonList, buttonProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        matematika = (CardView) findViewById(R.id.matematika);
        kimia = (CardView) findViewById(R.id.kimia);
        fisika = (CardView) findViewById(R.id.fisika);
        biologi = (CardView) findViewById(R.id.biologi);
        english = (CardView) findViewById(R.id.english);
        tpa = (CardView) findViewById(R.id.tpa);

        buttonHome =  findViewById(R.id.buttonHome);
        buttonCari= findViewById(R.id.buttonCari);
        buttonList = findViewById(R.id.buttonList);
        buttonProfile = findViewById(R.id.buttonProfile);

        matematika.setOnClickListener(this);
        kimia.setOnClickListener(this);
        fisika.setOnClickListener(this);
        biologi.setOnClickListener(this);
        english.setOnClickListener(this);
        tpa.setOnClickListener(this);

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Dashboard.this, Dashboard.class);
                startActivity(intent);
            }
        });

        buttonCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Dashboard.this, pencarian.class);
                startActivity(intent);
            }
        });

        buttonList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Dashboard.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Dashboard.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.matematika:
                i = new Intent(this,listmapel.class);
                startActivity(i);
                break;
        }
    }
}