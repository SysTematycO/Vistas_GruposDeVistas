package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity7 extends AppCompatActivity {

    ToggleButton uno;
    ToggleButton dos;
    Switch switchUno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        uno= (ToggleButton)findViewById(R.id.toggleButtonUno);
        dos= (ToggleButton)findViewById(R.id.toggleButtonDos);
        switchUno= (Switch)findViewById(R.id.switchUno);
    }

    public void onClickToggleUno(View view){
        if(uno.isChecked()){
            Toast toast = Toast.makeText(getApplicationContext(),"Primer Toggle On",Toast.LENGTH_SHORT);
            toast.show();
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"Primer Toggle Off",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void onClickToggleDos(View view){
        if(dos.isChecked()){
            Toast toast = Toast.makeText(getApplicationContext(),"Segundo Toggle On",Toast.LENGTH_SHORT);
            toast.show();
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"Segundo Toggle Off",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void onClickToggleSwitch(View view){
        if(switchUno.isChecked()){
            Toast toast = Toast.makeText(getApplicationContext(),"Switch On",Toast.LENGTH_SHORT);
            toast.show();
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"Switch Off",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void onClickImageButton(View view){
        Toast.makeText(this,"Hello!, I'm a ImageButton!",Toast.LENGTH_SHORT).show();
    }


}