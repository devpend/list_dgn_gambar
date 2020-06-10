package com.contoh;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    ListView lv;
    adapter adapter;
    ArrayList<ListViewBean> arr_bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.a, "Android 1"));
        arr_bean.add(new ListViewBean(R.drawable.b, "Android 2"));
        arr_bean.add(new ListViewBean(R.drawable.c,"Android sdfg"));
        arr_bean.add(new ListViewBean(R.drawable.d, "Android sdgssa"));
        arr_bean.add(new ListViewBean(R.drawable.e, "Android sewww"));
        adapter=new adapter(arr_bean,this);
        lv.setAdapter(adapter);



    }
}
