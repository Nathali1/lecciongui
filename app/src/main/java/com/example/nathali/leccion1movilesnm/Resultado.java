package com.example.nathali.leccion1movilesnm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {


    TextView tfinal1;
    TextView resultado1;
    String user1;
    String resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tfinal1 = (TextView)findViewById(R.id.txusuario2);

        resultado1 = (TextView)findViewById(R.id.txusuario3);

        Intent i = getIntent();
        user1 = i.getStringExtra("usuarionuevo1");

        resultado = i.getStringExtra("resultadoFinal");


        resultado1.setText("Hola "+user1);


        tfinal1.setText("Aciertos "+resultado+"/2");
    }


}
