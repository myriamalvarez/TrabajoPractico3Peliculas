package com.example.trabajopractico3peliculas;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabajopractico3peliculas.Modelo.Pelicula;

import java.io.Serializable;
import java.util.ArrayList;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.RecyclerHolder> {
    private ArrayList<Pelicula> lista;
    //private Context context;
    //private LayoutInflater layoutInflater;

    public PeliculaAdapter(ArrayList<Pelicula> lista) {
        this.lista = lista;
        //this.context = context;
        //this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pelicula, parent, false);
        return new RecyclerHolder(view);
    }
    // Referenciar a la vista item y pasarsela al ViewHolder
    /*public PeliculaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view= layoutInflater.inflate(R.layout.item_pelicula, parent, false);
        return new ViewHolder(view);
    }*/

    @Override
    //se ejecuta por cada item de la vista
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
        final Pelicula pelicula = lista.get(position);
        holder.tvTitulo.setText(pelicula.getTitulo());
        holder.ivFoto.setImageResource(pelicula.getFoto());
        holder.tvResenia.setText(pelicula.getResenia());

        holder.btDetalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), Detalles.class);
                intent.putExtra("detalle", pelicula);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder {
        private TextView tvTitulo, tvResenia;
        private ImageView ivFoto;
        private Button btDetalles;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvResenia = itemView.findViewById(R.id.tvResenia);
            ivFoto = itemView.findViewById(R.id.ivFoto);
            btDetalles = itemView.findViewById(R.id.btDetalles);
        }
    }
}
