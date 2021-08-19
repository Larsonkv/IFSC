package com.larson.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("IMC");

        Button botao = (Button) findViewById(R.id.btn_calcular);

        botao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText peso = findViewById(R.id.text_peso);
                EditText altura = findViewById(R.id.text_altura);
                ImageView im1 = findViewById(R.id.imageView1);
                ImageView im2 = findViewById(R.id.imageView2);
                ImageView im3 = findViewById(R.id.imageView3);
                ImageView im4 = findViewById(R.id.imageView4);
                ImageView im5 = findViewById(R.id.imageView5);
                ImageView im6 = findViewById(R.id.imageView6);


                String txt_peso = peso.getText().toString();
                String txt_altura = altura.getText().toString();

                Double p1 = Double.parseDouble(txt_peso);
                Double a1 = Double.parseDouble(txt_altura);
                Double calculo = p1/(a1*a1);

                im1.setVisibility(View.INVISIBLE);
                im2.setVisibility(View.INVISIBLE);
                im3.setVisibility(View.INVISIBLE);
                im4.setVisibility(View.INVISIBLE);
                im5.setVisibility(View.INVISIBLE);
                im6.setVisibility(View.INVISIBLE);

                if (calculo <= 18.5){
                    String resultadoFinal = String.valueOf(calculo);
                    TextView resultado = (TextView) findViewById(R.id.resultado);
                    resultado.setText(resultadoFinal+" \n\n Abaixo do peso \n\n");
                    im1.setVisibility(View.VISIBLE);
                }
                if (calculo >= 18.6 && calculo <=24.9){
                    String resultadoFinal = String.valueOf(calculo);
                    TextView resultado = (TextView) findViewById(R.id.resultado);
                    resultado.setText(resultadoFinal+" \n\n Peso ideal \n\n");
                    im2.setVisibility(View.VISIBLE);
                }
                if (calculo >= 25 && calculo <29.9){
                    String resultadoFinal = String.valueOf(calculo);
                    TextView resultado = (TextView) findViewById(R.id.resultado);
                    resultado.setText(resultadoFinal+" \n\n Acima do peso \n\n");
                    im3.setVisibility(View.VISIBLE);
                }
                if (calculo >= 30 && calculo <=34.9 ){
                    String resultadoFinal = String.valueOf(calculo);
                    TextView resultado = (TextView) findViewById(R.id.resultado);
                    resultado.setText(resultadoFinal+" \n\n Obesidade I \n\n");
                    im4.setVisibility(View.VISIBLE);
                }
                if (calculo >= 35 && calculo <=39.9 ){
                    String resultadoFinal = String.valueOf(calculo);
                    TextView resultado = (TextView) findViewById(R.id.resultado);
                    resultado.setText(resultadoFinal+" \n\n Obesidade II \n\n");
                    im5.setVisibility(View.VISIBLE);
                }
                if (calculo >= 40 ){
                    String resultadoFinal = String.valueOf(calculo);
                    TextView resultado = (TextView) findViewById(R.id.resultado);
                    resultado.setText(resultadoFinal+" \n\n Obesidade III \n\n");
                    im6.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
