package com.example.debacthang;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class MainActivity extends AppCompatActivity {
    TienIch T = new TienIch();
    String MauDo="#FA0505";
    TextView[] HinhVuong;
    TextView[] Bac;
    int flag=1,C=1;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void SetTimeNow()
    {
        Date date= new Date();
        DateFormat time =  new SimpleDateFormat("ss");
        String s = time.format(date);
        T.Save(Integer.parseInt(s));
        //this.T.Save(Integer.parseInt(mm));
    }
    public int GetTimeNow()
    {
        Date date= new Date();
        DateFormat time =  new SimpleDateFormat("ss");
        String s = time.format(date);
        return Integer.parseInt(s);
    }
    @Override
    protected void onStart() {
        super.onStart();

    }
    public boolean CheckTime(int C)
    {
        return C % 2 == 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        //Hinh Vuong
        this.HinhVuong[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(C==1 && CheckTime(GetTimeNow()))
                {
                    HinhVuong[C-1].setBackgroundColor(ChangeColor.getRandomRGB());
                }
                else if(C==1 && !CheckTime(GetTimeNow()))
                {
                    HinhVuong[C-1].setAlpha(ChangeColor.getRandomAlpha());
                }
            }
        });
        this.HinhVuong[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(C==2 && CheckTime(GetTimeNow()))
                {
                    HinhVuong[C-1].setBackgroundColor(ChangeColor.getRandomRGB());
                }
                else if(C==1 && !CheckTime(GetTimeNow()))
                {
                    HinhVuong[C-1].setAlpha(ChangeColor.getRandomAlpha());
                }
            }
        });
        this.HinhVuong[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(C==3 && CheckTime(GetTimeNow()))
                {
                    HinhVuong[C-1].setBackgroundColor(ChangeColor.getRandomRGB());
                }
                else if(C==1 && !CheckTime(GetTimeNow()))
                {
                    HinhVuong[C-1].setAlpha(ChangeColor.getRandomAlpha());
                }
            }
        });
        this.HinhVuong[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(C==4 && CheckTime(GetTimeNow()))
                {
                    HinhVuong[C-1].setBackgroundColor(ChangeColor.getRandomRGB());
                }
                else if(C==1 && !CheckTime(GetTimeNow()))
                {
                    HinhVuong[C-1].setAlpha(ChangeColor.getRandomAlpha());
                }
            }
        });
        //Bac
        this.Bac[0].setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                SetTimeNow();
                flag=1;
                if(C > flag && C != 4)
                {
                    C--;
                    HinhVuong[C-1].setBackgroundColor(Color.parseColor(MauDo));
                    HinhVuong[C].setBackgroundColor(Color.WHITE);
                }

            }
        });
        this.Bac[1].setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                SetTimeNow();
                flag=2;
                if(flag > C)
                {
                    C++;
                    HinhVuong[C-1].setBackgroundColor(Color.parseColor(MauDo));
                    HinhVuong[C-2].setBackgroundColor(Color.WHITE);
                }
                else if(C > flag && C != 4){
                    C--;
                    HinhVuong[C-1].setBackgroundColor(Color.parseColor(MauDo));
                    HinhVuong[C].setBackgroundColor(Color.WHITE);
                }
            }
        });
        this.Bac[2].setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                SetTimeNow();
                flag=3;
                if(flag > C)
                {
                    C++;
                    HinhVuong[C-1].setBackgroundColor(Color.parseColor(MauDo));
                    HinhVuong[C-2].setBackgroundColor(Color.WHITE);
                }
                else if(C > flag && C != 4){
                    C--;
                    HinhVuong[C-1].setBackgroundColor(Color.parseColor(MauDo));
                    HinhVuong[C].setBackgroundColor(Color.WHITE);
                }
            }
        });
        this.Bac[3].setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                SetTimeNow();
                flag=4;
                if(flag > C)
                {
                    C++;
                    HinhVuong[C-1].setBackgroundColor(Color.parseColor(MauDo));
                    HinhVuong[C-2].setBackgroundColor(Color.WHITE);
                }
                else{
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        for(int i =0;i<T.K.size();i++)
        {
            Toast.makeText(this,T.K.get(i),Toast.LENGTH_LONG).show();
        }
    }

    private void AnhXa() {
        this.HinhVuong = new TextView[]{
            findViewById(R.id.IdHinhVuong1),
            findViewById(R.id.idHinhVuong2),
            findViewById(R.id.idHinhVuong3),
            findViewById(R.id.idHinhVuong4),
        };
        this.Bac = new TextView[]{
                findViewById(R.id.IdBac1),
                findViewById(R.id.idBac2),
                findViewById(R.id.idBac3),
                findViewById(R.id.idBac4),
        };
    }
}
