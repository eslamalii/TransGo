package com.example.android.transgo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ObjectDetail extends AppCompatActivity {
    private TextView name, date, time;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_detail);

        Button dialog = (Button) findViewById(R.id.confirm);

        extras = getIntent().getExtras();

        name = findViewById(R.id.city);
        date = findViewById(R.id.stationDate);
        time = findViewById(R.id.stationTime);

        if(extras != null){
            name.setText(extras.getString("name"));
            date.setText(extras.getString("date"));
            time.setText(extras.getString("time"));


            dialog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ObjectDetail.this);
                    builder.setTitle("Confirm");
                    builder.setMessage("Are you sure ?");

                    String positiveText = getString(R.string.Confirm);
                    builder.setPositiveButton(positiveText,
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // positive button logic
                                }
                            });

                    String negativeText = getString(android.R.string.cancel);
                    builder.setNegativeButton(negativeText,
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // negative button logic
                                }
                            });

                    AlertDialog dialog = builder.create();
                    // display dialog
                    dialog.show();
                }
            });
        }
    }
}
