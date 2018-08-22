package com.example.luisa.pruebaadapter.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.example.luisa.pruebaadapter.R;
import com.example.luisa.pruebaadapter.modelo.Alarma;

import java.util.List;

public class AlarmaAdapter extends ArrayAdapter<Alarma> {
    public AlarmaAdapter(@NonNull Context context,List<Alarma> objetos) {
        super(context, R.layout.list_template,objetos);

    }



    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.list_template,null);

        TextView titulo= item.findViewById(R.id.titulo);
        final Switch subtitulo= item.findViewById(R.id.subtitulo);

        subtitulo.setChecked(false);
        titulo.setText(getItem(position).getHora());
        subtitulo.setText(R.string.desactivado);
        subtitulo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    subtitulo.setText(R.string.activo);
                }else{
                    subtitulo.setText(R.string.desactivado);
                }

            }
        });



        return item;
    }
}
