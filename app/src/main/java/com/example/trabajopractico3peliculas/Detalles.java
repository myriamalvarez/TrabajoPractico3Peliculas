package com.example.trabajopractico3peliculas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.trabajopractico3peliculas.Modelo.Pelicula;

public class Detalles extends AppCompatActivity {
    private TextView tvTitulo;
    private ImageView ivFoto;
    private TextView tvDescripcion;
    private TextView tvActores;
    private TextView tvDirector;
    private Pelicula lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        setTitle(getClass().getSimpleName());


        /*public void cargarPelicula(Bundle bundle) {
            Pelicula pelicula = (Pelicula) bundle.getSerializable("pelicula");
            this.pelicula.setValue(pelicula);
        }*/
        inicializarVista();
        inicializarValor();
    }

    private void inicializarVista() {
        tvTitulo = findViewById(R.id.titulo);
        ivFoto = findViewById(R.id.foto);
        tvDescripcion = findViewById(R.id.tvDescripcion);
        tvActores = findViewById(R.id.tvActores);
        tvDirector = findViewById(R.id.tvDirector);
    }
    private void inicializarValor(){
        lista = (Pelicula) getIntent().getExtras().getSerializable("detalle");

        tvTitulo.setText(lista.getTitulo());
        ivFoto.setImageResource(lista.getFoto());
        tvDescripcion.setText(lista.getDescripcion());
        tvActores.setText(lista.getActores());
        tvDirector.setText(lista.getDirector());
    }


}