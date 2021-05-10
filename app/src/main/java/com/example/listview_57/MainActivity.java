package com.example.listview_57;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //声明变量
    private ListView lv_listview;
    private List<Msg> list = new ArrayList<>();
    private String[] res = {"设备1","设备2","设备3","设备4","设备5","设备6"};
    private String[] shuju = {"1","2","3","4","5","6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_listview = findViewById(R.id.lv_listview);
        //需要传的参数
        BaseAdapter adapter = new Myadapter(list,this);
        //设置适配器
        lv_listview.setAdapter(adapter);
        Log.e("TAG","-------");
        init();
    }
    //给Msg传入数据
    private void init() {
        for (int i=1;i<=6;i++){
            Msg m = new Msg(res[i-1],shuju[i-1],shuju[i-1],shuju[i-1],shuju[i-1],shuju[i-1],shuju[i-1]);
            //将Msg中的数据传给list
            list.add(m);
        }
    }
}