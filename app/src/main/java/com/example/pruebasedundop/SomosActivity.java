package com.example.pruebasedundop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SomosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_somos);

        Button btn_somos = (Button) findViewById(R.id.btn_return);
        btn_somos.setOnClickListener(v -> {
            Intent intent = new Intent(String.valueOf(MainActivity.class));
            startActivity(intent);
        });
    }
}