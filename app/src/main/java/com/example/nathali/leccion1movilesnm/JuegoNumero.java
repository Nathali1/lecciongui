package com.example.nathali.leccion1movilesnm;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class JuegoNumero extends AppCompatActivity {

    TextView tfinal;
    Integer result=0;
    Integer intentos=0;
    String user;
    int num;

    MediaPlayer mp,mp2,mp3,mp4,mp5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_numero);

        tfinal = (TextView)findViewById(R.id.txusuario);

        Intent i = getIntent();
        user = i.getStringExtra("usuarionuevo");

        tfinal.setText("Hola "+user);

        generarRandom();

        mp = MediaPlayer.create(this,R.raw.numero1);
        mp2 = MediaPlayer.create(this,R.raw.numero2);
        mp3 = MediaPlayer.create(this,R.raw.numero3);

    }

    public void generarRandom(){


        Random r = new Random();
        num = (int) (Math.random() * 5) + 1;

        Toast.makeText(getApplicationContext(), "Presione el numero"+num, Toast.LENGTH_LONG).show();


    }

    public void opcion1(View v){

        mp.start();
        Button b = (Button)v;

        String boton1 = b.getText().toString();

        int value=Integer.parseInt(boton1);

        if(value==num){
            Toast.makeText(getApplicationContext(), "Correcto", Toast.LENGTH_SHORT).show();
            result =result+1;
            intentos=intentos+1;
        }else{
            Toast.makeText(getApplicationContext(), "Incorrecto", Toast.LENGTH_SHORT).show();
            intentos=intentos+1;
        }

    }


    public void opcion2(View v){

        mp2.start();
        Button b = (Button)v;
        String boton2 = b.getText().toString();

        int value=Integer.parseInt(boton2);

        if(value==num){
            Toast.makeText(getApplicationContext(), "Correcto", Toast.LENGTH_SHORT).show();
            result =result+1;
            intentos=intentos+1;
        }else{
            Toast.makeText(getApplicationContext(), "Incorrecto", Toast.LENGTH_SHORT).show();
            intentos=intentos+1;
        }

    }

    public void opcion3(View v){

        mp3.start();

        Button b = (Button)v;
        String boton3 = b.getText().toString();

        int value=Integer.parseInt(boton3);

        if(value==num){
            Toast.makeText(getApplicationContext(), "Correcto", Toast.LENGTH_SHORT).show();
            result =result+1;
            intentos=intentos+1;
        }else{
            Toast.makeText(getApplicationContext(), "Incorrecto", Toast.LENGTH_SHORT).show();
            intentos=intentos+1;
        }

    }

    public void opcion4(View v){

        Button b = (Button)v;
        String boton4 = b.getText().toString();

        int value=Integer.parseInt(boton4);

        if(value==num){
            Toast.makeText(getApplicationContext(), "Correcto", Toast.LENGTH_SHORT).show();
            result =result+1;
            intentos=intentos+1;
        }else{
            Toast.makeText(getApplicationContext(), "Incorrecto", Toast.LENGTH_SHORT).show();
            intentos=intentos+1;
        }

    }

    public void opcion5(View v){

        Button b = (Button)v;
        String boton5 = b.getText().toString();

        int value=Integer.parseInt(boton5);

        if(value==num){
            Toast.makeText(getApplicationContext(), "Correcto", Toast.LENGTH_SHORT).show();
            result =result+1;
            intentos=intentos+1;
        }else{
            Toast.makeText(getApplicationContext(), "Incorrecto", Toast.LENGTH_SHORT).show();
            intentos=intentos+1;
        }

    }

    public void reinicio(View v){

        generarRandom();

        if(intentos==2){

            String str1 = String.valueOf(result);

            Intent intent= new Intent(JuegoNumero.this,Resultado.class);
            intent.putExtra("usuarionuevo1",user);
            intent.putExtra("resultadoFinal",str1);
            startActivity(intent);
        }


    }
}
