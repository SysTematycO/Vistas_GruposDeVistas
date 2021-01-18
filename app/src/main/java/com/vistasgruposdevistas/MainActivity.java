package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view){

        switch (view.getId()){
            case R.id.btnUno:
                Intent siguiente = new Intent(this, MainActivity1.class);
                startActivity(siguiente);
                break;
            case R.id.btnDos:
                Intent siguienteDos = new Intent(this, MainActivity2.class);
                startActivity(siguienteDos);
                break;
            case R.id.btnTres:
                Intent siguienteTres = new Intent(this, MainActivity3.class);
                startActivity(siguienteTres);
                break;
            case R.id.btnCuatro:
                Intent siguienteCuatro = new Intent(this, MainActivity4.class);
                startActivity(siguienteCuatro);
                break;
            case R.id.btnCinco:
                Intent siguienteCinco = new Intent(this, MainActivity5.class);
                startActivity(siguienteCinco);
                break;
            case R.id.btnSeis:
                Intent siguienteSeis = new Intent(this, MainActivity6.class);
                startActivity(siguienteSeis);
                break;
            case R.id.btnSiete:
                Intent siguienteSiete = new Intent(this, MainActivity7.class);
                startActivity(siguienteSiete);
                break;
            case R.id.btnOcho:
                Intent siguienteOcho = new Intent(this, MainActivity8.class);
                startActivity(siguienteOcho);
                break;
            case R.id.btnNueve:
                Intent siguienteNueve = new Intent(this, MainActivity9.class);
                startActivity(siguienteNueve);
                break;
            case R.id.btnDiez:
                Intent siguienteDiez = new Intent(this, MainActivity10.class);
                startActivity(siguienteDiez);
                break;
        }
    }
}