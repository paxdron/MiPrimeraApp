package com.paxdron.miprimeraapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Actvidad Principal
 *
 */
public class MainActivity extends AppCompatActivity {


    /**
     * Declaración de Variables y de elementos de la interfaz
     */
    private TextView tvHolaMundo;
    private EditText etTexto;
    private Button btnAccion;
    public static final String IDETIFICADOR="KEY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Instancia de los objetos de la interfaz
         */
        tvHolaMundo = (TextView) findViewById(R.id.tvHolaMundo);
        etTexto = (EditText) findViewById(R.id.etEntrada);
        btnAccion = (Button) findViewById(R.id.btnClick);


        /**
         *  Inicia el listener que se encarga de detectar los clicks al boton
         */
        /*
        btnAccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valorET = etTexto.getText().toString();
                tvHolaMundo.setText(valorET);
            }
        });*/
        /**
         * Inicia el listener que se encarga de detectar los clicks al boton
         */
        btnAccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valorET = etTexto.getText().toString(); //Se obtiene el texto del Edittext
                Intent intent = new Intent(getApplication(),Main2Activity.class); //Se inicia el intent (se coloca el context y el objeto generado de la clase de la actividad que se abrirá
                intent.putExtra(IDETIFICADOR,valorET); //Se coloca una cadena en la estructura de datos del intent
                startActivity(intent);  //Se inicia la actividad
            }
        });

    }

    

}
