package com.example.android.transgo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

public class StationActivity extends AppCompatActivity {

    Buses item = new Buses();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buses_list);

        final ArrayList<Buses> buses = new ArrayList<Buses>();

        buses.add(new Buses("Maadi", "Jan 5,2019", "15:00"));
        buses.add(new Buses("Dokki", "Jan 6,2019", "18:00"));
        buses.add(new Buses("Tahrir", "Jan 7,2019", "20:00"));
        buses.add(new Buses("Mohandssen", "Jan 8,2019", "15:00"));
        buses.add(new Buses("Giza", "Jan 9,2019", "15:00"));
        buses.add(new Buses("Madent Nasr", "Jan 10,2019", "19:00"));
        buses.add(new Buses("Helwan", "Jan 11,2019", "9:00"));
        buses.add(new Buses("Shobbra", "Jan 12,2019", "20:00"));

        BusesAdapter adapter = new BusesAdapter(this, buses);

        final ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(view.getContext(), "Clicked" + position, Toast.LENGTH_LONG).show();
//            }
//        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(view.getContext(), ObjectDetail.class);
                intent.putExtra("name", buses.get(position).getStation());
                intent.putExtra("date", buses.get(position).getDate());
                intent.putExtra("time", buses.get(position).getTime());

                startActivity(intent);
            }
        });

        }
}
