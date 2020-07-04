package com.example.chuyenbuc;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class TienIch {
    static LinkedList<Integer> K;
    static void KhoiTao()
    {
        K=new LinkedList<Integer>();
        K.add(0);
    }
    public static void Save(int N)
    {
                if( N > Collections.max(K,null))
                {
                    K.addFirst(N);
                }
                else{
                    K.addLast(N);
                }
    }
}
