package com.example.luisa.pruebaadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.luisa.pruebaadapter.Adapter.AlarmaAdapter;

import java.util.ArrayList;

public class Despertador extends AppCompatActivity {
    ListView hora;
    TextView opcion;
    ArrayList<com.example.luisa.pruebaadapter.modelo.Alarma> alarmas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despertador);

        final String[] titulo= getResources().getStringArray(R.array.Horas);
        final String[] subtitulo = getResources().getStringArray(R.array.estado);
        alarmas = new ArrayList<>();

        for(int i=0;i<titulo.length;i++){
            alarmas.add(new com.example.luisa.pruebaadapter.modelo.Alarma(titulo[i],subtitulo[i]));
        }
        AlarmaAdapter adapter = new AlarmaAdapter(this, alarmas);
        hora = findViewById(R.id.lista);
        opcion= findViewById(R.id.opcion);

        hora.setAdapter(adapter);

//        hora.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                opcion.setText("Opcion: "+ titulo[position]);
//            }
//        });
    }
}
