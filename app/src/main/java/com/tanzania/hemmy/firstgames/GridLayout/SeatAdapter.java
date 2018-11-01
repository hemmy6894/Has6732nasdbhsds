package com.tanzania.hemmy.firstgames.GridLayout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tanzania.hemmy.firstgames.R;

import java.util.ArrayList;

public class SeatAdapter extends RecyclerView.Adapter<SeatAdapter.SeatHolder> {

    private ArrayList<Seat> seats;
    private LayoutInflater mInflater;
    private String SeatType;
    private int firstColumn;
    private int lastColumn;
    private int centerColumn;
    private int increment = 0;
    private ItemClickListener mClickListener;
    public SeatAdapter(Context context, ArrayList<Seat> seats, String seatType) {
        this.mInflater = LayoutInflater.from(context);
        this.seats = seats;
        seatTypeCheck(seatType);
    }

    @NonNull
    @Override
    public SeatHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = mInflater.inflate(R.layout.single_view, parent, false);
        return new SeatHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SeatHolder seatHolder, int i) {
            seatHolder.textView.setText(seats.get(i).getLabelView());
            seatHolder.imageView.setImageResource(seats.get(i).getImageView());
            seatHolder.imageView.setVisibility(seats.get(i).getVisiblity());
    }

    private void seatTypeCheck(String seatType){
        firstColumn = Integer.parseInt(Character.toString(seatType.charAt(0)));
        centerColumn = firstColumn + 1;
        lastColumn = Integer.parseInt(Character.toString(seatType.charAt(4)));
    }
    @Override
    public int getItemCount() {
        if (seats != null) {
            return seats.size();
        }else{
            return 0;
        }
    }

    public class SeatHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView textView;
        public SeatHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.viewImage);
            textView = itemView.findViewById(R.id.viewText);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public Seat getItem(int position) {
        if (seats != null) {
            return seats.get(position);
        }else{
            return null;
        }
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
