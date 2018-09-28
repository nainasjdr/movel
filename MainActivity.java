package com.example.root.medidas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnImcOnClick(View v) {
        EditText edtPeso = (EditText) findViewById(R.id.edtPeso);
        EditText edtAltura = (EditText) findViewById(R.id.edtAltura);
        TextView txtResultado = (TextView) findViewById(R.id.txtResultado);
        Float peso = Float.parseFloat(edtPeso.getText().toString());
        Float altura = Float.parseFloat(edtAltura.getText().toString());
        Float resultado = peso / (altura * altura);
        if(resultado<19){
            txtResultado.setText("Abaixo do peso! Seu Imc é: "+resultado.toString());
        }else if (resultado >30){
            txtResultado.setText("Acima do Peso! Seu IMC é: "+resultado.toString());
        }else{
            txtResultado.setText("Peso na média! Seu IMC é: "+resultado.toString());
        }
    }
}
