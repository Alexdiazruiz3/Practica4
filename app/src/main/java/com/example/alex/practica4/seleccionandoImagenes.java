package com.example.alex.practica4;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class seleccionandoImagenes extends AppCompatActivity {

    Button btnUno;
    Button btnDos;
    Button btnTres;
    Button btnCuatro;
    ImageView imgRosa;
    ImageView imgClavel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionando_imagenes);


        btnUno = findViewById(R.id.btnUno);
        btnDos = findViewById(R.id.btnDos);
        btnTres = findViewById(R.id.btnTres);
        btnCuatro = findViewById(R.id.btnCuatro);
        imgRosa = findViewById(R.id.imgRosa);
        imgClavel = findViewById(R.id.imgClavel);






        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {}
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {}
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {}
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {}
        });



    }
}
