package com.example.android.modeloparcial;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by android on 28/09/17.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNombre;
    public TextView tvApellido;
    public TextView tvTelefono;
    public Button btnCompartir;
    public Button btnLlamar;


    public MyViewHolder(View itemView) {
        super(itemView);
        this.tvNombre = (TextView) itemView.findViewById(R.id.txtNombre);
        this.tvApellido = (TextView) itemView.findViewById(R.id.txtApellido);
        this.tvTelefono = (TextView) itemView.findViewById(R.id.txtTelefono);
        this.btnLlamar = (Button) itemView.findViewById(R.id.btnLlamar);
    }
}
