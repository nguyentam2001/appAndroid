package com.example.intentchuyennhanchuoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSendData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSendData=(Button)findViewById(R.id.button);
        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("SendData","Nguyen Van Tam");
                intent.putExtra("sendNumber",231141);
                startActivity(intent);
            }
        });
    }
}