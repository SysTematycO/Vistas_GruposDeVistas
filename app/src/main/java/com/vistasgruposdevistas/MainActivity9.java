package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity9 extends AppCompatActivity {

    TextView estado;
    Spinner ejemplo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        estado = (TextView) findViewById(R.id.txtFieldEstado);
        ejemplo = (Spinner) findViewById(R.id.spinnerEjemplo);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Android_Spinner_Example, android.R.layout.simple_spinner_item);

        ejemplo.setAdapter(adapter);

        ejemplo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                estado.setText("Seleccion: "+ adapterView.getItemAtPosition(i).toString());
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}