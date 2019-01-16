package com.example.alex.practica4;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DesplazandoImagenes extends AppCompatActivity implements FragmentImagen1.OnFragmentInteractionListener,
    Imagen2.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazando_imagenes);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
