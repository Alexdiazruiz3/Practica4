package com.example.alex.practica4;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class FragmentCiudades extends Fragment {

    public static  RadioGroup grpCiudades;
    View v;
    public static RadioButton radioMadrid, radioParis, radioLondes,
            radioRoma, radioBerlin, radioLisboa, radioBruselas, radioAtenas, radioAmsterdan, radioMoscu;

    private OnFragmentInteractionListener mListener;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_fragment_ciudades, container, false);
        grpCiudades = v.findViewById(R.id.grpCiudades);
        radioMadrid = v.findViewById(R.id.radioMadrid);
        radioParis = v.findViewById(R.id.radioParis);
        radioLondes = v.findViewById(R.id.radioLondres);
        radioRoma = v.findViewById(R.id.radioRoma);
        radioBerlin = v.findViewById(R.id.radioBerlin);
        radioLisboa = v.findViewById(R.id.radioLisboa);
        radioBruselas = v.findViewById(R.id.radioBruselas);
        radioAtenas = v.findViewById(R.id.radioAtenas);
        radioAmsterdan = v.findViewById(R.id.radioAmsterdan);
        radioMoscu = v.findViewById(R.id.radioMoscu);
        grpCiudades.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                String capital = ((RadioButton)v.findViewById(grpCiudades.getCheckedRadioButtonId())).getText().toString();
                TextView r = getActivity().findViewById(R.id.lblResultado1);
                r.setText(capital);
            }
        });
            return v;
        }
        public interface OnFragmentInteractionListener {
            // TODO: Update argument type and name
            void onFragmentInteraction(Uri uri);
        }



}
