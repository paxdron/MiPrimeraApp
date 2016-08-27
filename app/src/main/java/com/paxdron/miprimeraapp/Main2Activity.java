package com.paxdron.miprimeraapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public TextView tvTextoRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvTextoRecibido=(TextView)findViewById(R.id.tvTextoRecibido); //se instancia el TextView

        Intent intent= getIntent();   //Se obtiene el intent del que se manda a llamar esta actividad
        String texto = intent.getStringExtra(MainActivity.IDETIFICADOR); //Se coloca el texto recibido en una variable de tipo string

        tvTextoRecibido.setText(texto); //Se coloca el texto recibido en el tv

    }
}
