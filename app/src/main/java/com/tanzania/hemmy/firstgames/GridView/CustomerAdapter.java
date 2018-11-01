package com.tanzania.hemmy.firstgames.GridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tanzania.hemmy.firstgames.R;

public class CustomerAdapter extends BaseAdapter {
    private Integer[] integers = new Integer[]{
            R.mipmap.seat_driver,
            R.mipmap.seat_empty,
            R.mipmap.seat_taken,
            R.mipmap.seat_holded,
            R.mipmap.seat_vip
    };

    Context context;
    LayoutInflater inflater;
    String imageLabels[];

    CustomerAdapter(Context context, String lbs[]){
        this.context = context;
        inflater = LayoutInflater.from(this.context);
        this.imageLabels = lbs;
    }
    @Override
    public int getCount() {
        return integers.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            view = inflater.inflate(R.layout.single_view,viewGroup,false);
            ImageView imageView = view.findViewById(R.id.viewImage);
            TextView textT = view.findViewById(R.id.viewText);

            imageView.setImageResource(integers[i]);
            textT.setText(imageLabels[i]);
        }
        return view;
    }
}
