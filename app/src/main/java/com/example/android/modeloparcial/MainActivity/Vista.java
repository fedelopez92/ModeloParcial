package com.example.android.modeloparcial.MainActivity;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.modeloparcial.R;

/**
 * Created by android on 28/09/17.
 */

public class Vista {

    public RecyclerView recyclerView;
    public RecyclerView.LayoutManager layoutManager;


    public Vista(Activity activity){
        this.recyclerView = (RecyclerView) activity.findViewById(R.id.recyclerView);
        this.layoutManager = new LinearLayoutManager(activity);

        this.recyclerView.setLayoutManager(this.layoutManager);
    }

    public void setearAdapter(RecyclerView.Adapter adapter){
        this.recyclerView.setAdapter(adapter);
    }

}
