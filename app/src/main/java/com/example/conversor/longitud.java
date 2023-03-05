package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class longitud extends AppCompatActivity {

    EditText txt_conve;
    Button btn_centimetros, btn_kilometros, btn_volver;
    TextView txt_espacio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);

        txt_conve = findViewById(R.id.txt_conve);
        btn_centimetros = findViewById(R.id.btn_centimetros);
        btn_kilometros = findViewById(R.id.btn_kilometros);
        btn_volver = findViewById(R.id.btn_volver);
        txt_espacio = findViewById(R.id.txt_espacio);

        btn_centimetros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt_conve.getText().toString();
                if (!s.equals("")) {
                    double metros = Double.parseDouble(s);
                    double centimetros = metros * 100;
                    txt_espacio.setText(metros + " metros son " + centimetros + " centímetros.");
                } else {
                    txt_espacio.setText("Ingresa un valor válido.");
                }
            }
        });

        btn_kilometros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt_conve.getText().toString();
                if (!s.equals("")) {
                    double metros = Double.parseDouble(s);
                    double kilometros = metros / 1000;
                    txt_espacio.setText(metros + " metros son " + kilometros + " kilómetros.");
                } else {
                    txt_espacio.setText("Ingresa un valor válido.");
                }
            }
        });

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
