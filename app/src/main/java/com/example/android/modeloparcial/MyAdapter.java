package com.example.android.modeloparcial;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.modeloparcial.MainActivity.Modelo;

/**
 * Created by Fede on 03/10/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private Activity activity;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public MyAdapter(Activity activity){
        this.activity = activity;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v, activity);

        return  myViewHolder;
    }//el onCreateViewHolder va a crear los items del RecyclerView que entren en la pantalla

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Contacto c = Modelo.getListaContactos().get(position);
        holder.tvNombre.setText(c.getNombre());
        holder.tvApellido.setText(c.getApellido());
        holder.tvTelefono.setText(c.getTelefono());

    }//el onBind va a cargar los datos de los items que crea el onCreateViewHolder
    //al scrolear la pantalla el onCreateViewHolder va a seguir creando items y el onBind los va a cargar

    @Override
    public int getItemCount() {
        return Modelo.getListaContactos().size();
    }
}
