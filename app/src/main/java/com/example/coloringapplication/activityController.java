package com.example.coloringapplication;

import android.util.Log;
import android.view.View;

public class activityController implements View.OnClickListener {
    private drawClass prClassView;
    private activityModel activityModel;

    public activityController(drawClass viewingTheClass) {
        prClassView = viewingTheClass;
        activityModel = prClassView.getActivityModel();

    }

    public void onClick(View v) {
        Log.d("asdf", "test");
        activityModel.blowOutCandles();
        prClassView.invalidate();
    }
}

