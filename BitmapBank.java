package com.example.captaincrimson;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

public class BitmapBank {

    Bitmap background;


    public BitmapBank(Resources res) {
        background = BitmapFactory.decodeResource(res, R.drawable.bg1);
    }


    // Return background bitmap
    public Bitmap getBackground() {
        return background;
    }

    //Return Background width
    public int getBackgroundWidth(){
        return background.getWidth();
    }

    //Return Background Height
    public int getBackgroundHeight(){
        return background.getHeight();
    }
}
