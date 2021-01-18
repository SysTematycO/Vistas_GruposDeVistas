package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {

    CheckBox milk;
    CheckBox sugar;
    CheckBox lemon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        milk = (CheckBox) findViewById(R.id.checkBoxMilk);
        sugar = (CheckBox) findViewById(R.id.checkBoxSugar);
        lemon = (CheckBox) findViewById(R.id.checkBoxLemon);
    }

    public void onClick(View view){
        if(view.getId()==R.id.btnHot){
            seleccion();
        }

    }

    public void seleccion(){

        String datos = "";

            if (milk.isChecked()) {
                datos += "Milk" + " ";
            }
            if (sugar.isChecked()) {
                datos += "Sugar" + " ";
            }
            if (lemon.isChecked()) {
                datos += "Lemon" + " ";
            }

        if(datos.equals("")==false){
            Toast.makeText(this,datos.trim(),Toast.LENGTH_SHORT).show();
        }
        datos = "";
    }
}