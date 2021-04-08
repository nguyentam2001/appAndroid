package com.example.calendardialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editText1);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickDialogCalendar();
            }
        });
    }
    private  void  pickDialogCalendar(){
        Calendar calendar=Calendar.getInstance();
        int day=calendar.get(Calendar.DATE);
        int month=calendar.get(Calendar.MONTH);
        int year=calendar.get(Calendar.YEAR);
        DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(year,month,dayOfMonth);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
                editText.setText(simpleDateFormat.format(calendar.getTime()));
            }
        },year,month,day);
        datePickerDialog.show();
    }
}