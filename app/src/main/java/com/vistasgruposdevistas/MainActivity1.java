package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

    }

    public void onClick(View view){
        Toast.makeText(this,"Hello!, I'm a Toast!",Toast.LENGTH_SHORT).show();
    }

}