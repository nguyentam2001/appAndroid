package com.example.intentchuyennhanchuoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=(TextView)findViewById(R.id.textView);
        //Nhận chuỗi
        Intent data=getIntent();
        String noiDung=data.getStringExtra("SendData");
        textView.setText(noiDung);
        //Nhận số
        int number=data.getIntExtra("sendNumber",1996);
        textView.setText(number+"");
    }
}