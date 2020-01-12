package com.example.captaincrimson;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank {

    Bitmap background;

    public BitmapBank(Resources res) {

        background = BitmapFactory.decodeResource(res, R.drawable.background);
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
