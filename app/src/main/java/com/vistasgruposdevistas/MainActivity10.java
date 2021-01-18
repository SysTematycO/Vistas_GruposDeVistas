package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }

    public void onClickImageButton(View view){
        Toast.makeText(this,"Hello!, I'm a ImageButton Correct!",Toast.LENGTH_SHORT).show();

    }
    public void onClickImageButtonDos(View view){
        Toast.makeText(this,"Hello!, I'm a ImageButton Incorrect!",Toast.LENGTH_SHORT).show();
    }
}