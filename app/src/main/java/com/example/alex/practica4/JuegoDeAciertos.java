package com.example.alex.practica4;

import android.net.Uri;
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

    Map<String, String> solucion = new HashMap<>();

    public static TextView lblResultado1;
    public static TextView lblResultado2;
    FragmentCiudades fragmentCiudades;
    Paises paises;
    Button btnVerificar;
    ImageView imgViewVerificado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_aciertos);

        setTitle("Juego de aciertos");

        solucion.put(getString(R.string.espana), getString(R.string.madrid));
        solucion.put(getString(R.string.grecia), getString(R.string.atenas));
        solucion.put(getString(R.string.rusia), getString(R.string.moscu));
        solucion.put(getString(R.string.belgica), getString(R.string.bruselas));
        solucion.put(getString(R.string.inglaterra), getString(R.string.londres));
        solucion.put(getString(R.string.portugal), getString(R.string.lisboa));
        solucion.put(getString(R.string.francia), getString(R.string.paris));
        solucion.put(getString(R.string.italia), getString(R.string.roma));
        solucion.put(getString(R.string.alemania), getString(R.string.berlin));
        solucion.put(getString(R.string.holanda), getString(R.string.amsterdam));

        lblResultado1 = findViewById(R.id.lblResultado1);
        lblResultado2 = findViewById(R.id.lblResultado2);

        btnVerificar = findViewById(R.id.btnVerificar);

        imgViewVerificado = findViewById(R.id.imgViewVerificado);
        imgViewVerificado.setVisibility(View.INVISIBLE);

       

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void consultar(View view) {
        Log.i("APP", "El país es: " + Almacen.strPaises);
        Log.i("APP", "La capital es: " + Almacen.strCapitales);
    }

}
