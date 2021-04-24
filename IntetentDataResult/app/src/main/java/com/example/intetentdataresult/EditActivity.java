package com.example.intetentdataresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {
    EditText editText;
    Button btnConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        editText=(EditText)findViewById(R.id.editText1);
        btnConfirm=(Button)findViewById(R.id.button2);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click vào thì lấy giữ liệu người nhập
                String newName=editText.getText().toString();
                //gửi giữ liệu và đóng intent
                Intent intent=new Intent();
                intent.putExtra("TenMoi",newName);
                setResult(RESULT_OK,intent);
                //dong hoặc kết  thúc màn hình hiện tại
                finish();
            }
        });

    }
}