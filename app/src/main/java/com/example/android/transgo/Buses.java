package com.example.android.transgo;

import java.util.Date;

public class Buses {

    private String station;
    private String date;
    private String time;

    public  Buses (){

    }

    public Buses(String mStation, String mDate, String mTime) {
        station = mStation;
        date = mDate;
        time = mTime;
    }

    public String getStation() {
        return station;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
