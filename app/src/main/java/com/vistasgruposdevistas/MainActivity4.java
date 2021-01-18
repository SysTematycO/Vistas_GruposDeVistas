package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }

    public void onClick(View view){
        Toast.makeText(this,"Hello!, I'm a Toast!",Toast.LENGTH_SHORT).show();
    }

    public void onClickHi(View view){
        Toast.makeText(this,"Hi!, I'm a Toast!",Toast.LENGTH_SHORT).show();
    }
}