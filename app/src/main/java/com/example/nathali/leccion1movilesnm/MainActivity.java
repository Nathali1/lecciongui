package com.example.nathali.leccion1movilesnm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tuser = (EditText)findViewById(R.id.editusuario);

    }

    public void abrirJuego(View v){

        String tuser1 = tuser.getText().toString();

        Intent intent= new Intent(MainActivity.this,JuegoNumero.class);
        intent.putExtra("usuarionuevo",tuser1);
        startActivity(intent);

    }
}
