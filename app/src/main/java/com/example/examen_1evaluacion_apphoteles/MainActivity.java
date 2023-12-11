package com.example.examen_1evaluacion_apphoteles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener el botón por su ID
        Button botonLogin = findViewById(R.id.botonLogin);

        // Configurar el OnClickListener
        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para iniciar HotelsActivity
                Intent intent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(intent);
            }
        });
    }
}


