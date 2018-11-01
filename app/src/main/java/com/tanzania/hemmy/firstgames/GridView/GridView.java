package com.tanzania.hemmy.firstgames.GridView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;

import com.tanzania.hemmy.firstgames.R;

public class GridView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        //GridView gridLayout = (GridView) findViewById(R.id.grid_view);

        String myData[] = new String[]{
                "seat taken", "seat_empty", "sear_ava"
        };

        CustomerAdapter adapter = new CustomerAdapter(getApplicationContext(),myData);

      //  gridLayout.set
    }
}
