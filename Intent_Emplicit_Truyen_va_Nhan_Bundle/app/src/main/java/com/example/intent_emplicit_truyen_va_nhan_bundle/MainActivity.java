package com.example.intent_emplicit_truyen_va_nhan_bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.teview_once);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                String[] array={"PHP","Java","React Native"};
                Bundle bundle= new Bundle();
                bundle.putString("Ten","Nguyen Van Tam");
                bundle.putInt("Tuoi",3456);
                bundle.putStringArray("Array_subject",array);
                SinhVien sinhVien=new SinhVien("Huong",15,"Bac Giang");
                bundle.putSerializable("class_SV",sinhVien);
                intent.putExtra("Du_Lieu",bundle);
                startActivity(intent);
            }
        });

    }
}