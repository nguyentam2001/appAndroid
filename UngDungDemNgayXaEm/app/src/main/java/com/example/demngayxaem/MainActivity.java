package com.example.demngayxaem;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button btnTinh;
    EditText editText1,editText2;
    Calendar calendarOne,calendarTwo;
    SimpleDateFormat simpleDateFormat;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
        editText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NgayCachXa();
            }
        });

        editText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NgayGapGo();
            }
        });
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int distanceTime= (int) ((calendarTwo.getTimeInMillis()-calendarOne.getTimeInMillis())/(1000*60*60*24));
                textView.setText("So ngay cach xa la: "+distanceTime);

            }
        });
    }
    private  void AnhXa(){
        btnTinh=(Button)findViewById(R.id.button);
        editText1=(EditText)findViewById(R.id.editTextTextPersonName);
        editText2=(EditText)findViewById(R.id.editTextTextPersonName2);
        textView=(TextView)findViewById(R.id.textView2);
    }
    private  void NgayCachXa(){
        calendarOne=Calendar.getInstance();
        int date =calendarOne.get(Calendar.DATE);
        int month=calendarOne.get(Calendar.MONTH);
        int year=calendarOne.get(Calendar.YEAR);
        DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendarOne.set(year,month,dayOfMonth);
                editText1.setText(simpleDateFormat.format(calendarOne.getTime()));
            }
        },year,month,date);
        datePickerDialog.show();
    }

    private  void NgayGapGo(){
        calendarTwo=Calendar.getInstance();
        int date=calendarTwo.get(Calendar.DATE);
        int month=calendarTwo.get(Calendar.MONTH);
        int year=calendarTwo.get(Calendar.YEAR);
        DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendarTwo.set(year,month,dayOfMonth);
                editText2.setText(simpleDateFormat.format(calendarTwo.getTime()));

            }
        },year,month,date);
        datePickerDialog.show();
    }
}