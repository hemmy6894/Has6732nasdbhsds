package com.tanzania.hemmy.firstgames.GridLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.tanzania.hemmy.firstgames.R;

import java.util.ArrayList;

public class GridLayout extends AppCompatActivity implements SeatAdapter.ItemClickListener {

    SeatAdapter seatAdapter;

    ArrayList<Seat> seats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        seats = new ArrayList<Seat>();

        seats.add(new Seat(R.mipmap.seat_empty,"A1",View.INVISIBLE));
        seats.add(new Seat(R.mipmap.seat_empty,"A2",View.INVISIBLE));
        seats.add(new Seat(R.mipmap.seat_taken,"A3",View.INVISIBLE));
        seats.add(new Seat(R.mipmap.seat_holded,"A4",View.INVISIBLE));
        seats.add(new Seat(R.mipmap.seat_driver,"A5",View.VISIBLE));

        seats.add(new Seat(R.mipmap.seat_empty,"A1",View.VISIBLE));
        seats.add(new Seat(R.mipmap.seat_empty,"A2",View.VISIBLE));
        seats.add(new Seat(R.mipmap.seat_taken,"A3",View.INVISIBLE));
        seats.add(new Seat(R.mipmap.seat_holded,"A4",View.VISIBLE));
        seats.add(new Seat(R.mipmap.seat_vip,"A5",View.VISIBLE));

        seats.add(new Seat(R.mipmap.seat_empty,"B1",View.VISIBLE));
        seats.add(new Seat(R.mipmap.seat_empty,"B2",View.VISIBLE));
        seats.add(new Seat(R.mipmap.seat_taken,"B3",View.INVISIBLE));
        seats.add(new Seat(R.mipmap.seat_holded,"B4",View.VISIBLE));
        seats.add(new Seat(R.mipmap.seat_vip,"B5",View.VISIBLE));


        seats.add(new Seat(R.mipmap.seat_empty,"C1",View.VISIBLE));
        seats.add(new Seat(R.mipmap.seat_empty,"C2",View.VISIBLE));
        seats.add(new Seat(R.mipmap.seat_taken,"C3",View.INVISIBLE));
        seats.add(new Seat(R.mipmap.seat_holded,"C4",View.VISIBLE));
        seats.add(new Seat(R.mipmap.seat_vip,"C5",View.VISIBLE));

        seats.add(new Seat(R.mipmap.seat_empty,"D1",View.VISIBLE));
        seats.add(new Seat(R.mipmap.seat_empty,"D2",View.VISIBLE));
        seats.add(new Seat(R.mipmap.seat_taken,"D3",View.INVISIBLE));
        seats.add(new Seat(R.mipmap.seat_holded,"D4",View.VISIBLE));
        seats.add(new Seat(R.mipmap.seat_vip,"D5",View.VISIBLE));

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rvNumbers);
        int numberOfColumns = 5;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.spacing);
        recyclerView.addItemDecoration(new SpaceDecoration(spacingInPixels));

        seatAdapter = new SeatAdapter(this, seats,"2_X_2");
        seatAdapter.setClickListener(this);
        recyclerView.setAdapter(seatAdapter);

    }

    @Override
    public void onItemClick(View view, int position) {

    }
}
