package com.example.pruebasedundop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CursosActivity extends AppCompatActivity {
    private RecyclerView recyclerViewContacto;
    private CursosAdaptador contactoAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
        recyclerViewContacto=(RecyclerView) findViewById(R.id.recycleContactos);
        recyclerViewContacto.setLayoutManager(new LinearLayoutManager(this));


        DeveloperBD developerBD=new DeveloperBD(getApplicationContext());


        contactoAdaptador=new CursosAdaptador(developerBD.mostrarCursos());
        recyclerViewContacto.setAdapter(contactoAdaptador);
    }
}