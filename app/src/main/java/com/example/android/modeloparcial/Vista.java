package com.example.android.modeloparcial;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by android on 28/09/17.
 */

public class Vista {

    public RecyclerView recyclerView;
    public RecyclerView.Adapter adapter;
    public RecyclerView.LayoutManager layoutManager;


    public Vista(RecyclerView.Adapter adapter, Activity activity){
        this.adapter = adapter;
        this.recyclerView = (RecyclerView) activity.findViewById(R.id.recyclerView);
        this.layoutManager = new LinearLayoutManager(activity);

        this.recyclerView.setAdapter(adapter);
        this.recyclerView.setLayoutManager(this.layoutManager);

    }

}
