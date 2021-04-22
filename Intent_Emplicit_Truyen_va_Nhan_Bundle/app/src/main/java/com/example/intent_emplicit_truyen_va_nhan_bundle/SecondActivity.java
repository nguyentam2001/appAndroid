package com.example.intent_emplicit_truyen_va_nhan_bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView=(TextView)findViewById(R.id.textView_second);
        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra("Du_Lieu");
        String[] array=bundle.getStringArray("Array_subject");
        SinhVien sv= (SinhVien) bundle.getSerializable("class_SV");

        textView.setText(sv.getAddress());
    }
}