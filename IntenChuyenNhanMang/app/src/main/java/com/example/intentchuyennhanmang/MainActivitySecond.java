package com.example.intentchuyennhanmang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivitySecond extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second);
        textView=(TextView)findViewById(R.id.textView);
        Intent data=getIntent();
        String tmp="";
        String[] takeData=data.getStringArrayExtra("SendArray");
        for(int i=0;i<takeData.length;i++){
            tmp=""+tmp+ takeData[i];
        }
        textView.setText(tmp);

    }
}