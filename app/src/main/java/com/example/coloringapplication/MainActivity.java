package com.example.coloringapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    drawClass prDrawClass;
    activityController prActivityController;
    private float x;
    private float y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        prDrawClass = findViewById(R.id.layoutClass);
        prActivityController = new activityController(prDrawClass);
        prDrawClass.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                x = event.getX();
                y = event.getY();
                if(event.getAction() == MotionEvent.ACTION_MOVE) {
                    drawClass.getValue(x,y);

                }
                return true;
            }
        });
    }
}