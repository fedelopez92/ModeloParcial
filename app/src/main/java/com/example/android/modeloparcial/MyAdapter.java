package com.example.android.modeloparcial;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by android on 28/09/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    public OnItemClickListener onItemClickListener;
    public Controlador controlador;

    public MyAdapter(Controlador controlador){
        this.controlador = controlador;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v, onItemClickListener);

        return  myViewHolder;
    }//el onCreateViewHolder va a crear los items del RecyclerView que entren en la pantalla

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Contacto c = controlador.getListaContactos().get(position);
        


    }//el onBind va a cargar los datos de los items que crea el onCreateViewHolder
    //al scrolear la pantalla el onCreateViewHolder va a seguir creando items y el onBind los va a cargar

    @Override
    public int getItemCount() {
        return 0;
    }
}
