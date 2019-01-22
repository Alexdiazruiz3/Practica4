package com.example.alex.practica4;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Paises extends Fragment {

    View v;
    public static RadioGroup grpPaises;
    public static RadioButton radioEspaña,radioFrancia, radioBelgica, radioItalia,
            radioAlemania, radioPortugal, radioHolanda, radioGrecia, radioRusia, radioInglaterra;

    private OnFragmentInteractionListener mListener;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_paises, container, false);
        grpPaises = v.findViewById(R.id.grpPaises);
        radioEspaña = v.findViewById(R.id.radioEspaña);
        radioFrancia = v.findViewById(R.id.radioFrancia);
        radioBelgica = v.findViewById(R.id.radioBelgica);
        radioItalia = v.findViewById(R.id.radioItalia);
        radioAlemania = v.findViewById(R.id.radioAlemania);
        radioPortugal = v.findViewById(R.id.radioPortugal);
        radioHolanda = v.findViewById(R.id.radioHolanda);
        radioGrecia = v.findViewById(R.id.radioGrecia);
        radioRusia = v.findViewById(R.id.radioRusia);
        radioInglaterra = v.findViewById(R.id.radioInglaterra);

        grpPaises.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String paises = ((RadioButton)v.findViewById(grpPaises.getCheckedRadioButtonId())).getText().toString();
                TextView r = getActivity().findViewById(R.id.lblResultado2);
                r.setText(paises);
            }
        });
            return v;
        }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
