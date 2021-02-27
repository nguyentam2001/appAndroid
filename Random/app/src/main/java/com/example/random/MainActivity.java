package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView number;
    EditText minNumber,maxNumber;
    Button ranDom1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ánh xạ
        mapping();
        ranDom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String minString=minNumber.getText().toString();
                String maxString=maxNumber.getText().toString();
                int min=Integer.parseInt(minString);
                int max=Integer.parseInt(maxString);
                Random random=new Random();
                int randomNumber=random.nextInt(max-min+1)+min;
                number.setText(randomNumber+"");
            }
        });
    }
    private void mapping(){
        number=(TextView)findViewById(R.id.text1);
        minNumber=(EditText)findViewById(R.id.editText1);
        maxNumber=(EditText)findViewById(R.id.editText2);
        ranDom1=(Button)findViewById(R.id.button1);

    }
}