package com.example.chuyenbuc;

import android.graphics.Color;

import java.util.Random;

public class ChangeColor {
    public static int r,g,b,alpha;
    public static int getColorARGB()
    {
        return Color.argb(alpha,r,g,b);
    }
    public static int getColorRGB()
    {
        return  Color.rgb(r,g,b);
    }
    public static void getRandomRGB(){
        int MAX = 255;
        r =  (int) Math.round(Math.random()*MAX);
        g = (int) Math.round(Math.random()*MAX);
        b = (int) Math.round(Math.random()*MAX);
    }

    public static void getRandomAlpha(){

        alpha = (int) Math.round(Math.random()*255);
        alpha = alpha < 150 ? 150 : alpha;
        alpha = Math.max(alpha, 150);
    }
}
