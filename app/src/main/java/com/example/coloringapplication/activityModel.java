package com.example.coloringapplication;

public class activityModel {
    boolean candlesLit = true;
    int candles = 2;
    boolean cakeHasFrosting = true;
    boolean cakeHasCandles = true;

    public void blowOutCandles() {
        if(candlesLit == false) {
            candlesLit = true;
        }
        else {
            candlesLit = false;
        }
    }
}
