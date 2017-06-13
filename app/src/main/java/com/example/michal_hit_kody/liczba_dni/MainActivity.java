package com.example.michal_hit_kody.liczba_dni;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView liczba_dni;
    String czas_teraz;
    String czas_slubu;
    Runnable refresh;
    ImageView zdjecie;
    Drawable drawable;
    Handler handler = new Handler();
    Date d1,d2;

    int n=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liczba_dni = (TextView) findViewById(R.id.textView2);




        refresh = new Runnable() {
            public void run() {
                // Do something
                handler.postDelayed(refresh, 1000);
                // Log.i("data","dupa");

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

                    czas_teraz = sdf.format(new Date());

                    czas_slubu = "13/10/2017 15:00:00";

                    try {
                        d1 = sdf.parse(czas_teraz);
                        d2 = sdf.parse(czas_slubu);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    long diff = d1.getTime() - d2.getTime();

                    long diffSeconds = diff / 1000 % 60;
                    long diffMinutes = diff / (60 * 1000) % 60;
                    long diffHours = diff / (60 * 60 * 1000) % 24;
                    long diffDays = diff / (24 * 60 * 60 * 1000);

                    //  Log.i("data", " " + String.valueOf(diffDays * (-a)));
                    //   Log.i("data", " " + String.valueOf(diffHours * (-a)));
                    //   Log.i("data", " " + String.valueOf(diffMinutes * (-a)));
                    //  Log.i("data", " " + String.valueOf(diffSeconds * (-a)));

                    switch (String.valueOf(diffDays * (-1))) {
                        case "122":
                           // zdjecie.setImageResource(R.drawable.a);
                            break;
                        case "110":
                            break;
                        case "100":
                            break;
                        case "90":
                            break;
                        case "80":
                            break;
                        case "70":
                            break;
                        case "60":
                            break;
                        case "50":
                            break;
                        case "40":
                            break;
                        case "30":
                            break;
                        case "20":
                            break;
                        case "10":
                            break;
                        case "0":
                            break;

                    }

                    liczba_dni.setText(String.valueOf(diffDays * (-1)) + " dni  " + String.valueOf(diffHours * (-1)) + " godz  " +
                            String.valueOf(diffMinutes * (-1)) + " min  " + String.valueOf(diffSeconds * (-1)) + " sek ");
                }

            }

            ;
            handler.post(refresh);



    }
}
