package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class temperatura extends AppCompatActivity {

    private EditText txtConvertir;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        txtConvertir = findViewById(R.id.txt_convertir);
        txtResultado = findViewById(R.id.txt_resultado);

        Button btnFahrenheit = findViewById(R.id.btn_Fahrenheit);
        btnFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strConvertir = txtConvertir.getText().toString();
                if (!strConvertir.isEmpty()) {
                    double temperatura = Double.parseDouble(strConvertir);
                    double resultado = (temperatura * 1.8) + 32;
                    String strResultado = String.format("%.2f", resultado) + " °F";
                    txtResultado.setText(strResultado);
                }
            }
        });

        Button btnKelvin = findViewById(R.id.btn_Kelvin);
        btnKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strConvertir = txtConvertir.getText().toString();
                if (!strConvertir.isEmpty()) {
                    double temperatura = Double.parseDouble(strConvertir);
                    double resultado = temperatura + 273.15;
                    String strResultado = String.format("%.2f", resultado) + " K";
                    txtResultado.setText(strResultado);
                }
            }
        });

        Button btnVolver = findViewById(R.id.btn_volver1);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

