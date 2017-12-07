package com.example.ajisaputrars.intermediatefinalproject;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class RecycleViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView title;
    public String overview;
    public String backdrop;
    public String thn;
    public ImageView img;
    public String vote;
    public String id_film;

    private void initAll(){
        title = itemView.findViewById(R.id.title_card);
        img = itemView.findViewById(R.id.image_card);
        img.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public RecycleViewHolders(View itemView){
        super(itemView);
        initAll();
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }
}
