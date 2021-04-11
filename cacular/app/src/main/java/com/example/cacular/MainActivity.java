package com.example.cacular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private String input,answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textVeiw1);
    }
    public void ButtonClick(View view){
        Button button=(Button) view;
        String data=button.getText().toString();
        input=tv.getText().toString();
        switch (data){
            case "AC": input=""; break;
            case "C": if(input.length()>0){
                String text= input.substring(0,input.length()-1);
                input=text;
            } break;
            case "x": Solve(); input+="*"; break;
            case "=": Solve(); answer=input; break;
            default:
                if(input==null)
                    input="";
                if(data.equals("+")||data.equals("-")||data.equals("/")){
                    //in ket qua
                    Solve();
                }
                input+=data;
        }
        tv.setText(input);
    }
    public void Solve(){
        if(input.split("\\*").length==2){
            String number[]=input.split("\\*");
            try {
                double mul=Double.parseDouble(number[0])*Double.parseDouble(number[1]);
                input=mul+"";
            }catch (Exception e){

            }
        }
        if(input.split("\\/").length==2){
            String number[]=input.split("\\/");
            try {
                double div=Double.parseDouble(number[0])/Double.parseDouble(number[1]);
                input=div+"";
            }catch (Exception e){

            }
        }
        if(input.split("\\+").length==2){
            String number[]=input.split("\\+");
            try {
                double sum=Double.parseDouble(number[0])+Double.parseDouble(number[1]);
                input=sum+"";
            }catch (Exception e){

            }
        }
        if(input.split("\\-").length==2){
            String number[]=input.split("\\-");
            try {
                double minus=Double.parseDouble(number[0])-Double.parseDouble(number[1]);
                input=minus+"";
            }catch (Exception e){

            }
        }
        //cat so 0 thua ra vd 6.0 la 6
        String n[]=input.split("\\.");
        if(n.length>1){
            if(n[1].equals("0")){
                input=n[0];
            }
        }
    }
}