package com.example.ofcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class detail_guru extends AppCompatActivity {

    ImageButton  buttonHome, buttonCari, buttonList, buttonProfile;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_guru);

        buttonHome =  findViewById(R.id.buttonHome);
        buttonCari= findViewById(R.id.buttonCari);
        buttonList = findViewById(R.id.buttonList);
        buttonProfile = findViewById(R.id.buttonProfile);

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(detail_guru.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        buttonCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(detail_guru.this, pencarian.class);
                startActivity(intent);
            }
        });

        buttonList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(detail_guru.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(detail_guru.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}