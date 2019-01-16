package com.example.alex.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumerosPrimos extends AppCompatActivity {

    TextView txtNumero;
    EditText editNumero;
    Button btnCalcular;
    EditText editMostrarNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_primos);

        txtNumero = findViewById(R.id.txtNumero);
        editNumero = findViewById(R.id.editNumero);
        btnCalcular = findViewById(R.id.btnCalcular);
        editMostrarNumero = findViewById(R.id.editMostrarNumero);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean prime = true;
                int num = Integer.parseInt(editNumero.getText().toString());
                for(int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime)
                    editMostrarNumero.setText("Este número es primo.");
                else
                    editMostrarNumero.setText("Este número no es primo.");
            }

        });
    }
}
