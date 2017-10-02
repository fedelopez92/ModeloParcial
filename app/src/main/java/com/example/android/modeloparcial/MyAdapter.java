package com.example.android.modeloparcial;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by android on 28/09/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> implements View.OnClickListener {

    private Modelo modelo;
    private Activity activity;

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public MyAdapter(Modelo modelo, Activity activity){
        this.modelo = modelo;
        this.activity = activity;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);

        return  myViewHolder;
    }//el onCreateViewHolder va a crear los items del RecyclerView que entren en la pantalla

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Contacto c = modelo.getListaContactos().get(position);
        holder.tvNombre.setText(c.getNombre());
        holder.tvApellido.setText(c.getApellido());
        holder.tvTelefono.setText(c.getTelefono());
        holder.btnLlamar.setOnClickListener(this);

    }//el onBind va a cargar los datos de los items que crea el onCreateViewHolder
    //al scrolear la pantalla el onCreateViewHolder va a seguir creando items y el onBind los va a cargar

    @Override
    public int getItemCount() {
        return modelo.getListaContactos().size();
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btnLlamar){

            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+this.modelo.getListaContactos().get().getTelefono()));
            this.activity.startActivity(intent);
        }
    }
}
