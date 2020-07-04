package com.example.chuyenbuc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //public String MauDo ="#FF0000";
    public String MauXanhBien="#4AB6E6";
    public String MauXanhLaCay="#00FF62";
    public String MauVang="#FFEB3B";
    LinearLayout Buc1[],Buc2[],Hop1[],Hop2[];
    String Mang[] = new String[]{MauXanhBien,MauXanhLaCay,MauVang};
    public int Flag[] = new int[]{0,0};
    public int Hop =1;
    public void XuLy(int XuLy)
    {

        if(XuLy==1)
        {
            this.Flag[0]++;
            for(int i=0;i<3;i++)
            {
                Buc1[i].setBackgroundColor(Color.parseColor(Mang[Flag[0]-1]));
            }
        }
        else if(XuLy==2)
        {
            this.Flag[1]++;
            for(int i=0;i<3;i++)
            {
                Buc2[i].setBackgroundColor(Color.parseColor(Mang[Flag[1]-1]));
            }
        }
        if(Flag[0]==3)
        {
            this.Flag[0]=0;
        }
        if(Flag[1]==3)
        {
            this.Flag[1]=0;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
    }

    @Override
    protected void onStart() {
        super.onStart();
        TienIch.KhoiTao();
    }

    private void AnhXa() {
        this.Buc1 = new LinearLayout[]{
                findViewById(R.id.idBuc1_1),
                findViewById(R.id.idBuc1_2),
                findViewById(R.id.idBuc1_3),
        };
        this.Buc2 = new LinearLayout[]{
                findViewById(R.id.idBuc2_1),
                findViewById(R.id.idBuc2_2),
                findViewById(R.id.idBuc2_3),
        };
        this.Hop1 = new LinearLayout[]{
                findViewById(R.id.IdHop1_1),
                findViewById(R.id.IdHop1_2),
        };
        this.Hop2 = new LinearLayout[]{
                findViewById(R.id.IdHop2_1),
                findViewById(R.id.IdHop2_2),
        };
    }


    public void ClickBac1(View view)
    {
        XuLy(1);
    }
    public void ClickBac2(View view)
    {
        XuLy(2);
    }
    public void ClickHop1(View view)
    {
        XuLyHop(1);
    }
    public void ClickHop2(View view)
    {
        XuLyHop(2);
    }
    public void XuLyHop(int _Hop)
    {
        Random r = new Random();
        TienIch.Save(r.nextInt(1000));
        Date datenow = new Date();
        DateFormat dateFormat = new SimpleDateFormat("ss");
        String ss = dateFormat.format(datenow);
        if(_Hop==1)
        {
            if(Integer.parseInt(ss)%2!=0)
            {
                ChangeColor.getRandomRGB();
                for(int i =0;i<2;i++)
                {
                    Hop1[i].setBackgroundColor(Color.WHITE);
                    Hop2[i].setBackgroundColor(ChangeColor.getColorRGB());
                }
            }
            else{
                ChangeColor.getRandomAlpha();
                for(int i =0;i<2;i++)
                {
                    Hop1[i].setBackgroundColor(Color.WHITE);
                    Hop2[i].setBackgroundColor(ChangeColor.getColorARGB());
                }
            }
        }
        else{
            if(Integer.parseInt(ss)%2!=0)
            {
                ChangeColor.getRandomRGB();
                for(int i =0;i<2;i++)
                {
                    Hop2[i].setBackgroundColor(Color.WHITE);
                    Hop1[i].setBackgroundColor(ChangeColor.getColorRGB());
                }
            }
            else{
                ChangeColor.getRandomAlpha();
                for(int i =0;i<2;i++)
                {

                    Hop2[i].setBackgroundColor(Color.WHITE);
                    Hop1[i].setBackgroundColor(ChangeColor.getColorARGB());
                }
            }
        }
    }
    @Override
    protected void onStop() {
        super.onStop();
        int TongLe=0;
        for(int i=0;i<TienIch.K.size();i++)
        {
            if(TienIch.K.get(i)%2!=0)
            {
                TongLe++;
            }
        }
        Toast.makeText(this,"Tong Le : "+String.valueOf(TongLe),Toast.LENGTH_LONG).show();
    }
}
