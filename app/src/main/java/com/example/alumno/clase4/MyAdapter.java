package com.example.alumno.clase4;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.*;

/**
 * Created by alumno on 20/09/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);// guarda valor entero

        MyViewHolder holder = new MyViewHolder(v, miAct);

        return holder;
        // inflate xml layout transforma a java view. no podemos
        // crear view y no saber quien es el padre (a quien corresponde)
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
     Persona p = this.lista.get(position);

        holder.txtNombre.setText(p.getNombre());
        holder.txtApellido.setText(p.getApellido());
        holder.setPosition(position);

    }

    @Override
    public int getItemCount() {
        return this.lista.size();
    }

    private MainActivity miAct;
    private List<Persona> lista;
    public MyAdapter(List<Persona> lista, MainActivity main)
    {
        this.lista=lista;
        this.miAct=main;
    }
}
