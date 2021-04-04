package com.example.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.clickToLogin);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogLogin();
            }
        });


    }

    private void dialogLogin(){
        Dialog dialog=new Dialog(this);

        //custom cai layout cho dialog
        dialog.setContentView(R.layout.dialog_custom);

        EditText userName;
        EditText password;
        Button buttonConfirm;
        Button buttonCancel;
        //ánh xạ
        userName=(EditText)dialog.findViewById(R.id.edittextLogin);
        password=(EditText)dialog.findViewById(R.id.edittextPass);
        buttonConfirm=(Button)dialog.findViewById(R.id.btnConfirm);
        buttonCancel=(Button)dialog.findViewById(R.id.btnCancel);

        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=userName.getText().toString().trim();
                String pass=password.getText().toString().trim();
                if(name.equals("Tam")&& pass.equals("123")){
                    Toast.makeText(MainActivity.this,"Login success",Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(MainActivity.this,"Login fail",Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //hủy dialog
               //dialog.cancel();
                //hoặc
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}