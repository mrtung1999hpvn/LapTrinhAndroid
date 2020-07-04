package com.example.debacthang;

import java.util.ArrayList;

public class TienIch {
    ArrayList<Integer> K = new ArrayList<Integer>();
    ArrayList<Integer> KChan = new ArrayList<Integer>();
    ArrayList<Integer> KLe = new ArrayList<Integer>();
    public void Save(int N)
    {
        for(int i =0;i<K.size();i++)
        {
            if(N%2==0)
                KChan.add(N);
            else KLe.add(N);
        }
        K.clear();
        for(int i=0;i<KChan.size();i++)
        {
            K.add(KChan.get(i));
        }
        for(int i=0;i<KLe.size();i++)
        {
            K.add(KLe.get(i));
        }
    }
}
