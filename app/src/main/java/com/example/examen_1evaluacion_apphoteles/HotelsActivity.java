package com.example.examen_1evaluacion_apphoteles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.widget.Toolbar;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HotelsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HotelAdapter adapter;
    private List<Hotel> hotelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Configurar el ImageButton en el Toolbar
        ImageButton btnVisited = findViewById(R.id.btnVisited);
        btnVisited.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lanzar VisitedActivity
                Intent intent = new Intent(HotelsActivity.this, Activity_visited.class);
                startActivity(intent);
            }
        });


        recyclerView = findViewById(R.id.recyclerHoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        // inicializamos array hoteles
        hotelList = new ArrayList<>();
        hotelList.add(new Hotel("Hotel Maravilla", "Ciudad Costera", R.drawable.hotel1));
        hotelList.add(new Hotel("Hotel Montaña", "Valle Verde", R.drawable.hotel2));
        hotelList.add(new Hotel("Hotel Castañes", "kazajistan", R.drawable.hotel3));
        hotelList.add(new Hotel("Hotel Sorpresas", "Villahermosa sin rio", R.drawable.hotel4));
        hotelList.add(new Hotel("Hotel Escopeta", "Eslida", R.drawable.hotel5));



        adapter = new HotelAdapter(hotelList);
        recyclerView.setAdapter(adapter);
    }
}

