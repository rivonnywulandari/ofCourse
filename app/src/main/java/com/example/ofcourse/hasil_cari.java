package com.example.ofcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class hasil_cari extends AppCompatActivity {
    ImageButton gurua;
    ImageButton buttonHome, buttonCari, buttonList, buttonProfile;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_cari);
        gurua = findViewById(R.id.gurua);

        buttonHome =  findViewById(R.id.buttonHome);
        buttonCari= findViewById(R.id.buttonCari);
        buttonList = findViewById(R.id.buttonList);
        buttonProfile = findViewById(R.id.buttonProfile);

        gurua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(hasil_cari.this, detail_guru.class);
                startActivity(intent);
            }
        });

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(hasil_cari.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        buttonCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(hasil_cari.this, pencarian.class);
                startActivity(intent);
            }
        });

        buttonList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(hasil_cari.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(hasil_cari.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}