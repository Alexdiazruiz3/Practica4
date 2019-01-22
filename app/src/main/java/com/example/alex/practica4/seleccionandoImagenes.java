package com.example.alex.practica4;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class seleccionandoImagenes extends AppCompatActivity implements rosa.OnFragmentInteractionListener,
        clavel.OnFragmentInteractionListener,
        jazmin.OnFragmentInteractionListener,
        tulipan.OnFragmentInteractionListener{

    rosa rosa ;
    clavel clavel;
    jazmin jazmin;
    tulipan tulipan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionando_imagenes);
        rosa = new rosa();
        clavel = new clavel();
        jazmin = new jazmin();
        tulipan = new tulipan();

       getSupportFragmentManager().beginTransaction().add(R.id.imagenes, rosa).commit();
    }

        public void onClick(View v)
        {
            FragmentTransaction Transaction = getSupportFragmentManager().beginTransaction();

            switch (v.getId())
            {
                case R.id.btnRosa:
                    Transaction.replace(R.id.imagenes, rosa);
                    break;
                case R.id.btnClavel:
                    Transaction.replace(R.id.imagenes, clavel);
                    break;
                case R.id.btnJazmin:
                    Transaction.replace(R.id.imagenes, jazmin);
                    break;
                case R.id.btnTulipan:
                    Transaction.replace(R.id.imagenes, tulipan);
                    break;

            }
            Transaction.commit();
        }
        @Override
        public void onFragmentInteraction(Uri uri) {

        }
}
