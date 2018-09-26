package com.example.alumno.clase4;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 20/09/2018.
 */

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView txtNombre;
    TextView txtApellido;
    MainActivity main;
    private int position;

    public void setPosition(int position)
    {     this.position = position; }

    public MyViewHolder(View itemView, MainActivity main) {
        super(itemView);
        txtNombre = (TextView) itemView.findViewById(R.id.txtNombre);
        txtApellido = (TextView) itemView.findViewById(R.id.txtApellido);

        this.main = main;
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
       // posicion = v.getId();

        Log.d("CLick","Se hizo clien en la view");
       Log.d("CLick", Integer.toString(position));
        //Llamar metodo activity
       // main.Llamar(main.personas.lastIndexOf());
       main.Llamar(position);
    }
}
