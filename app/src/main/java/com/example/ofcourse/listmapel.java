package com.example.ofcourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import java.util.ArrayList;

import Adapter.MapelAdapter;
import Model.Mapel;

public class listmapel extends AppCompatActivity {
    RecyclerView rvMapel;
    MapelAdapter mapelAdapter;
//    private RecyclerView recyclerView;
//    private MapelAdapter mapelAdapter;
//    private ArrayList<Mapel> mapelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmapel);

        mapelAdapter = new MapelAdapter();
        mapelAdapter.setListMapel(generateData());

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvMapel = findViewById(R.id.daftarlistmapel);
        rvMapel.setAdapter(mapelAdapter);
        rvMapel.setLayoutManager(layoutManager);

//        recyclerView = findViewById(R.id.daftarlistmapel);
//        mapelAdapter = new MapelAdapter(mapelArrayList);
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(listmapel.this);
//
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(mapelAdapter);
    }
//    public void getData(){
//        mapelArrayList= new ArrayList<>();
//        mapelArrayList.add(new Mapel("Miftah Mussaumi","Matematika","Padang, Sumatera Barata","5.0"));
//        mapelArrayList.add(new Mapel("Miftah Mussaumi 2","Matematika","Padang, Sumatera Barata","5.0"));
//        mapelArrayList.add(new Mapel("Miftah Mussaumi 3","Matematika","Padang, Sumatera Barata","5.0"));
//        mapelArrayList.add(new Mapel("Miftah Mussaumi 4","Matematika","Padang, Sumatera Barata","5.0"));
//        mapelArrayList.add(new Mapel("Miftah Mussaumi 5","Matematika","Padang, Sumatera Barata","5.0"));
//        mapelArrayList.add(new Mapel("Miftah Mussaumi 6","Matematika","Padang, Sumatera Barata","5.0"));
//    }

    public ArrayList<Mapel> generateData(){
        ArrayList<Mapel> listMapel = new ArrayList<>();
        listMapel.add(new Mapel("Miftah Mussaumi",
                                "Matematika",
                                "Padang, Sumatera Barat",
                                "5.0"));
        listMapel.add(new Mapel("Miftah Mussaumi2",
                                "Matematika2",
                                "Padang, Sumatera Barat2",
                                "5.0"));
        listMapel.add(new Mapel("Miftah Mussaumi3",
                                "Matematika3",
                                "Padang, Sumatera Barat4",
                                "5.0"));
        listMapel.add(new Mapel("Miftah Mussaumi3",
                "Matematika3",
                "Padang, Sumatera Barat4",
                "5.0"));
        listMapel.add(new Mapel("Miftah Mussaumi3",
                "Matematika3",
                "Padang, Sumatera Barat4",
                "5.0"));
        listMapel.add(new Mapel("Miftah Mussaumi3",
                "Matematika3",
                "Padang, Sumatera Barat4",
                "5.0"));


        return listMapel;
    }
}