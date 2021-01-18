package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    EditText para;
    EditText mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        para = (EditText) findViewById(R.id.txtFieldPara);
        mensaje = (EditText) findViewById(R.id.txtfieldMensaje);

    }

    public void onClick(View view){

        if(para.getText().toString().equals("")==false && mensaje.getText().toString().equals("")==false) {
            Toast.makeText(this, "Mensaje enviado!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Rellena los campos!", Toast.LENGTH_SHORT).show();
        }
    }
}