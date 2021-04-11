package com.example.democalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.text1);

        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd/MM/yyyy");
        textView.append(simpleDateFormat.format(calendar.getTime())+"\n");
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("h:mm aa");
        textView.append(simpleDateFormat1.format(calendar.getTime()));
    }
}