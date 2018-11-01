package com.tanzania.hemmy.firstgames.GridView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class Recy extends RecyclerView.Adapter<Recy.ImageViess> {

    public Recy(){

    }
    @NonNull
    @Override
    public ImageViess onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViess imageViess, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    
    class ImageViess extends RecyclerView.ViewHolder{
        public ImageViess(@NonNull View itemView) {
            super(itemView);
        }
    }
}
