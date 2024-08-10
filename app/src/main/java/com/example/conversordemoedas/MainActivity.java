package com.example.conversordemoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editQuantidadeDolar;
    private EditText editCambioDolar;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editQuantidadeDolar = findViewById(R.id.editQuantidadeDolar);
        editCambioDolar = findViewById(R.id.editCambioDolar);
        textResultado = findViewById(R.id.textResultado);

    }

    public void converter(View view){

        double quantidadeDolar = Double.parseDouble(editQuantidadeDolar.getText().toString());
        double cambioDolar = Double.parseDouble(editCambioDolar.getText().toString());
        double resultado = quantidadeDolar * cambioDolar;

        textResultado.setText("Amount in Kz: " + resultado);

    }

}