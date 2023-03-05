package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class peso extends AppCompatActivity {

    private EditText txtConvertir;
    private Button btnLibras;
    private Button btnOnzas;
    private TextView txtEspacioo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);

        txtConvertir = findViewById(R.id.txt_convertir);
        btnLibras = findViewById(R.id.btn_libras);
        btnOnzas = findViewById(R.id.btn_onzas);
        txtEspacioo = findViewById(R.id.txt_espacioo);

        btnLibras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valorIngresado = txtConvertir.getText().toString();
                if (!valorIngresado.isEmpty()) {
                    double valor = Double.parseDouble(valorIngresado);
                    double valorLibras = valor / 0.45359237;
                    txtEspacioo.setText(valor + " kilogramos son " + valorLibras + " libras");
                } else {
                    Toast.makeText(getApplicationContext(), "Ingresa un valor", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnOnzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valorIngresado = txtConvertir.getText().toString();
                if (!valorIngresado.isEmpty()) {
                    double valor = Double.parseDouble(valorIngresado);
                    double valorLibras = valor / 0.45359237;
                    double valorOnzas = (valorLibras % 1) * 16;
                    txtEspacioo.setText(valor + " kilogramos son " + (int)valorLibras + " libras y " + (int)valorOnzas + " onzas");
                } else {
                    Toast.makeText(getApplicationContext(), "Ingresa un valor", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
