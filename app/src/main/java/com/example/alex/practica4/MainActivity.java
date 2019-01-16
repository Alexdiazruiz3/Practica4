package com.example.alex.practica4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgImagen;
    Button btnNumero;
    Button btnListado;
    Button btnImagenes;
    Button btnFlores;
    AppCompatActivity numeros;
    AppCompatActivity listado;
    AppCompatActivity imagenes;
    AppCompatActivity flores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeros = this;
        listado = this;
        imagenes = this;
        flores = this;
        imgImagen = findViewById(R.id.imgImagen);
        btnNumero = findViewById(R.id.btnNumero);
        btnListado = findViewById(R.id.btnListado);
        btnImagenes = findViewById(R.id.btnImagenes);
        btnFlores = findViewById(R.id.btnFlores);

        btnNumero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(numeros,NumerosPrimos.class);
                        startActivity(intent);
            }
        });

        btnListado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(listado, JuegoDeAciertos.class);
                startActivity(intent);
            }
        });

        btnImagenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(imagenes, DesplazandoImagenes.class);
                startActivity(intent);
            }
        });

        btnFlores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(flores, seleccionandoImagenes.class);
                startActivity(intent);
            }
        });
    }
}
