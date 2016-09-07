package com.example.android.quakereport;

import java.util.Locale;

/**
 * Created by sushant on 7/9/16.
 */
public class Earthquake {
    double magnitude;
    String place;
    long time;

    public Earthquake(double magnitude, String place, long time) {
        this.magnitude = magnitude;
        this.place = place;
        this.time = time;
    }

    public Earthquake() {
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,"%s R.S at %s on DATE",this.getMagnitude(),this.getPlace());
    }
}
