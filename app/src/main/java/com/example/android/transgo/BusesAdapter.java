package com.example.android.transgo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class BusesAdapter extends ArrayAdapter<Buses> {

    public BusesAdapter(@NonNull Context context, @NonNull List<Buses> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listViewItem = convertView;
        if(listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Buses currentBus = getItem(position);

        TextView station = listViewItem.findViewById(R.id.station);

        station.setText(currentBus.getStation());

        TextView stationDate = listViewItem.findViewById(R.id.stationDate);

        stationDate.setText(currentBus.getDate());

        TextView stationTime = listViewItem.findViewById(R.id.stationTime);

        stationTime.setText(currentBus.getTime());

        return listViewItem;

    }

}
