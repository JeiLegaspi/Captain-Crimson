package com.example.captaincrimson;

import android.content.Context;

public class AppConstants {

    static BitmapBank bitmapBank; //Bitmap object reference
    static GameEngine gameEngine;

    public static void initialization (Context context){
        bitmapBank = new BitmapBank(context.getResources());
        gameEngine = new GameEngine();
    }

        //Return Bitmap instance
    public static BitmapBank getBitmapBank(){
        return bitmapBank;
    }

        //Return GameEngine instance
    public static GameEngine getGameEngine (){
        return gameEngine;
    }

}
