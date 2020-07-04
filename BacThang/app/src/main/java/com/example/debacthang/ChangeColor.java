package com.example.debacthang;

import android.graphics.Color;

import java.util.Random;

public class ChangeColor {
    public static int getRandomRGB(){
        int MAX = 255;
        int red =  (int) Math.round(Math.random()*MAX);
        int green = (int) Math.round(Math.random()*MAX);
        int blue = (int) Math.round(Math.random()*MAX);
        return Color.rgb(red, green, blue);
    }

    public static int getRandomAlpha(){

        int alpha = (int) Math.round(Math.random()*255);
        alpha = alpha < 150 ? 150 : alpha;
        alpha = Math.max(alpha, 150);
        return Color.alpha(alpha);
    }
}
