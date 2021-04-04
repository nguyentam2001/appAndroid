package com.example.alterdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.Listview1);
        arrayList=new ArrayList<>();
        addList();
        adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        
        listView.setAdapter(adapter);
//longlick item trong listview
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String content=arrayList.get(position);
                xacNhanXoa(position,content);
                return false;
            }
        });

    }

    private  void xacNhanXoa(int position,String content){
        AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
        alertDialog.setTitle("Message!");
        alertDialog.setIcon(R.mipmap.ic_launcher);
        alertDialog.setMessage("You want to delete subject "+content+" ?");
        //positive khẳng định thực hiện
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                arrayList.remove(position);//soa khoi array list
                adapter.notifyDataSetChanged();//cap nhật lại sau khi remove
            }
        });
        //Negative phủ định không làm
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialog.show();

    }

    private  void addList(){
        arrayList.add("PHP");
        arrayList.add("Java");
        arrayList.add("HTML");
        arrayList.add("NodeJS");
        arrayList.add("Android");
    }
}