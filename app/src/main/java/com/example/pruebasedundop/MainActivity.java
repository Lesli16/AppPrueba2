package com.example.pruebasedundop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_somos,btn_curso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_somos=(Button)findViewById(R.id.btn_somos) ;
        btn_curso=(Button)findViewById(R.id.btn_curso) ;


        btn_somos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SomosActivity.class);
                startActivity(intent);
            }
        });


        btn_curso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CursoActivity.class);
                startActivity(intent);
            }
        });




        Button closeButton = findViewById(R.id.btn_salir);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });


    }
}