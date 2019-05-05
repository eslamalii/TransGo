package com.example.android.transgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        ImageButton schedule = (ImageButton) findViewById(R.id.schedule);
        ImageButton time = (ImageButton) findViewById(R.id.timeShifts);

        // Set a click listener on that View
        schedule.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(menu.this, StationActivity.class);
                    startActivity(intent);
            }
        });


        time.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, Shifts.class);
                startActivity(intent);
            }
        });
    }
}
