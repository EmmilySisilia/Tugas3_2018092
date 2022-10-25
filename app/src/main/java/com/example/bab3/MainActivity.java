package com.example.bab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void JambuAir(View view){
        Intent a = new Intent(MainActivity.this, JambuAir.class);
        startActivity(a);
    }
    public void Rambutan (View view){
        Intent a = new Intent(MainActivity.this, Rambutan.class);
        startActivity(a);
    }
}
