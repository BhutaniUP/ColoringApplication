package com.example.coloringapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

import androidx.core.content.ContextCompat;

public class drawClass extends SurfaceView {
    private activityModel ActivityModel;



    public activityModel getActivityModel(){return this.ActivityModel;}

    private Paint eveningSun;
    private Paint brownLegs;
    private Paint straightWhite;
    private Paint grey;
    private Paint black;
    private boolean bitmapUpdated;

    public drawClass(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.ActivityModel = new activityModel();
        setWillNotDraw(false);
        color();
    }

    private void color() {
        this.eveningSun = new Paint();
        this.eveningSun.setColor(0xFFFFd700);
        this.eveningSun.setStyle(Paint.Style.FILL);

        this.brownLegs = new Paint();
        this.brownLegs.setColor(0xFF8b4513);
        this.brownLegs.setStyle(Paint.Style.FILL);

        this.straightWhite = new Paint();
        this.straightWhite.setColor(0xFFFFFFFF);
        this.straightWhite.setStyle(Paint.Style.FILL);

        this.grey = new Paint();
        this.grey.setColor(0xFF808080);
        this.grey.setStyle(Paint.Style.FILL);

        this.black = new Paint();
        this.black.setColor(0xFF000000);
        this.black.setStyle(Paint.Style.FILL);
    }

    public void onDraw(Canvas canvas) {

        customRect(0.0f, 650.0f, 5000.0f, 5000.0f, this.eveningSun);
        canvas.drawRect(330f, 0.0f, 2000f, 650.0f, this.grey);
        canvas.drawRect(0f, 0f, 400f, 650f, this.black);
        canvas.drawRect(300f, 500.0f, 400f, 700.0f, this.brownLegs);
        canvas.drawRect(700f, 500.0f, 800f, 700.0f, this.brownLegs);
        canvas.drawRect(200f, 550.0f, 900f, 500.0f, this.straightWhite);
        bitmapUpdated = true;
        ContextCompat.getColor()
    }
    public


}














    //Bot       x: 0 - 5000     y: 650 - 5000
    //Right     x: 330 - 2000   y: 0 - 650
    //Left      x: 0 - 400      y: 0 - 650
    //leftLeg   x: 300 - 400    y: 500 - 700
    //RightLeg  x: 700 - 800    y: 500 - 700
    //TableTop  x: 200 - 900    y: 550 - 500

/*
    public void getValue(float x, float y) {
        if(y >  && y < ){
            if(x < && x >) {

        }
    }
        if(y > 500 && y < 700){
            if(x < && x >) {

            }
        }


}

*/

