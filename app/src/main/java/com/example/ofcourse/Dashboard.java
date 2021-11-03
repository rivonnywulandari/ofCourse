package com.example.ofcourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {
    public CardView matematika,kimia,fisika,biologi,english,tpa;
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

        matematika.setOnClickListener(this);
        kimia.setOnClickListener(this);
        fisika.setOnClickListener(this);
        biologi.setOnClickListener(this);
        english.setOnClickListener(this);
        tpa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.matematika:
                i = new Intent(this,listmatpel.class);
                startActivity(i);
                break;
        }
    }
}