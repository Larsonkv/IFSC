package com.larson.calcularimc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calcularIMC(View view) {

        EditText edt1 = findViewById(R.id.editTextPeso);
        float peso = Float.valueOf(edt1.getText().toString());

        EditText edt2 = findViewById(R.id.editTextAltura);
        float altura = Float.valueOf(edt2.getText().toString());

        TextView textView = findViewById(R.id.textViewIMC);

        float imc = peso / (altura*altura);

        if(imc < 18.5) {
            textView.setText("IMC: " + imc + " Abaixo do peso");
        }else if(imc < 24.9) {
            textView.setText("IMC: " + imc + " Peso normal");
        }else if(imc < 29.9) {
            textView.setText("IMC: " + imc + " Sobrepeso");
        }else if(imc < 34.9) {
            textView.setText("IMC: " + imc + " Obesidade grau 1");
        }else if(imc < 39.9) {
            textView.setText("IMC: " + imc + " Obesidade grau 2");
        }else{
            textView.setText("IMC: " + imc + " Obesidade grau 3");
        }
    }
}
