package com.example.alumno.clase4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    List<Persona> personas = new ArrayList<Persona>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personas.add(new Persona("Juan","Perez"));
        personas.add(new Persona("Pedro","Gonzales"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Juan","Perez"));
        personas.add(new Persona("Pedro","Gonzales"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Juan","Perez"));
        personas.add(new Persona("Pedro","Gonzales"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Juan","Perez"));
        personas.add(new Persona("Pedro","Gonzales"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Juan","Perez"));
        personas.add(new Persona("Pedro","Gonzales"));
        personas.add(new Persona("Carlos","Diaz"));


        /*Recycler View componente mas importante, lo usan el 90% de las app android. si lo programamos mal, la app se hace lenta.
Debe estar lo mas optimizado posible*/

        RecyclerView rvPersonas = (RecyclerView) findViewById(R.id.list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvPersonas.setLayoutManager(layoutManager);
        MyAdapter adapter = new MyAdapter(personas,this);
        rvPersonas.setAdapter(adapter);

    }

    public void Llamar(int personaIndex)
    {
        Log.d("LLamando", personas.get(personaIndex).getNombre());
    }
}
