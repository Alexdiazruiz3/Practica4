package com.example.alex.practica4;

import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class JuegoDeAciertos extends AppCompatActivity implements FragmentCiudades.OnFragmentInteractionListener,
        Paises.OnFragmentInteractionListener{

    Fragment fragment1, fragment2;
    public static TextView lblResultado1;
    public static TextView lblResultado2;
    ImageView imgCorrecto, imgError;
    Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_aciertos);


        imgCorrecto = findViewById(R.id.imgCorrecto);
        imgError = findViewById(R.id.imgError);
        lblResultado1 = findViewById(R.id.lblResultado1);
        lblResultado2 = findViewById(R.id.lblResultado2);
        btnVerificar = findViewById(R.id.btnVerificar);

        btnVerificar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (Paises.radioEspaña.isChecked() && FragmentCiudades.radioMadrid.isChecked())
                {
                    imgCorrecto.setVisibility(View.VISIBLE);
                    imgError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (Paises.radioFrancia.isChecked() && FragmentCiudades.radioParis.isChecked())
                {
                    imgCorrecto.setVisibility(View.VISIBLE);
                    imgError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (Paises.radioInglaterra.isChecked() && FragmentCiudades.radioLondes.isChecked())
                {
                    imgCorrecto.setVisibility(View.VISIBLE);
                    imgError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (Paises.radioRusia.isChecked() && FragmentCiudades.radioMoscu.isChecked())
                {
                    imgCorrecto.setVisibility(View.VISIBLE);
                    imgError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (Paises.radioGrecia.isChecked() && FragmentCiudades.radioAtenas.isChecked())
                {
                    imgCorrecto.setVisibility(View.VISIBLE);
                    imgError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (Paises.radioHolanda.isChecked() && FragmentCiudades.radioAmsterdan.isChecked())
                {
                    imgCorrecto.setVisibility(View.VISIBLE);
                    imgError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (Paises.radioPortugal.isChecked() && FragmentCiudades.radioLisboa.isChecked())
                {
                    imgCorrecto.setVisibility(View.VISIBLE);
                    imgError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (Paises.radioAlemania.isChecked() && FragmentCiudades.radioBerlin.isChecked())
                {
                    imgCorrecto.setVisibility(View.VISIBLE);
                    imgError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (Paises.radioBelgica.isChecked() && FragmentCiudades.radioBruselas.isChecked())
                {
                    imgCorrecto.setVisibility(View.VISIBLE);
                    imgError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (Paises.radioItalia.isChecked() && FragmentCiudades.radioRoma.isChecked())
                {
                    imgCorrecto.setVisibility(View.VISIBLE);
                    imgError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else
                {
                    imgError.setVisibility(View.VISIBLE);
                    imgCorrecto.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.RED);
                }
            }
        });


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
