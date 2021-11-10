package com.example.ofcourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


import Adapter.ReviewAdapter;
import Model.Review;

import java.util.ArrayList;

public class detail_guru extends AppCompatActivity {

    RecyclerView rvReview;
    ReviewAdapter reviewAdapter;

    ImageButton buttonHome, buttonCari, buttonList, buttonProfile;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_guru);

        reviewAdapter = new ReviewAdapter();
        reviewAdapter.setListReview(generateData());


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        rvReview= findViewById(R.id.rvReview);
        rvReview.setAdapter(reviewAdapter);
        rvReview.setLayoutManager(layoutManager);


        buttonHome = findViewById(R.id.buttonHome);
        buttonCari = findViewById(R.id.buttonCari);
        buttonList = findViewById(R.id.buttonList);
        buttonProfile = findViewById(R.id.buttonProfile);

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(detail_guru.this, Dashboard.class);
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

    private ArrayList<Review> generateData() {
        ArrayList<Review> listReview = new ArrayList<>();
        listReview.add(new Review("Jennie Jane", "Classes with Mrs. Alia have been so worthwhile. Her lessons were engaging, useful, and fun!"));
        listReview.add(new Review("Renee Jane", "Mrs. Alia have been so worthwhile. Her lessons were engaging, useful, and fun!"));
        listReview.add(new Review("Faye Jane", "Have been so worthwhile. Her lessons were engaging, useful, and fun!"));
        listReview.add(new Review("Rose Jane", "Classes with Mrs. Alia have been so worthwhile. Her lessons were engaging, useful, and fun!"));
        listReview.add(new Review("Jesse Jane", "Alia have been so worthwhile. Her lessons were engaging, useful, and fun!"));

        //        listReview.add(new Review(R.drawable.jennie, "Lisa Jane", "Mrs. Alia have been so worthwhile. Her lessons were engaging, useful, and fun!"));

        return listReview;
    }

}