package com.example.ofcourse;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pencarian extends AppCompatActivity {
    ImageButton gurua, buttonMap;
    ImageButton buttonHome, buttonCari, buttonList, buttonProfile;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencarian);

        gurua = findViewById(R.id.gurua);
        buttonMap = findViewById(R.id.buttonMap);

        buttonHome =  findViewById(R.id.buttonHome);
        buttonCari= findViewById(R.id.buttonCari);
        buttonList = findViewById(R.id.buttonList);
        buttonProfile = findViewById(R.id.buttonProfile);


        gurua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(pencarian.this, detail_guru.class);
                startActivity(intent);
            }
        });

        buttonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(pencarian.this, hasil_cari.class);
                startActivity(intent);
            }
        });

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(pencarian.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        buttonCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(pencarian.this, pencarian.class);
                startActivity(intent);
            }
        });

        buttonList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(pencarian.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(pencarian.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}