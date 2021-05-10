package com.example.listview_57;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Myadapter extends BaseAdapter {
    //声明
    private List<Msg> list;
    private Context context;

    //设置构造方法
    public Myadapter(List<Msg> list,Context context) {
        this.list = list;
        this.context = context;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //设置list的长度
    @Override
    public int getCount()
    {
        return list.size();
    }
    //获取listview每一项的显示效果  其中int表示数据，view表示视图
    @Override
    public View getView(int i, View v, ViewGroup parent) {
       //优化view
        if (v == null) {
            Log.e("TAG", "======" + i);
            //完成对view的设置
            v = LayoutInflater.from(context).inflate(R.layout.item, null);
        }

        //将Msg类的数据给到list
        Msg m = list.get(i);
        //对数据1，2，3，4，5，6.id进行动态设置
        TextView shuju_1 = v.findViewById(R.id.shuju_1);
        shuju_1.setText(m.getOne());

        TextView shuju_2 = v.findViewById(R.id.shuju_2);
        shuju_2.setText(m.getTwo());

        TextView shuju_3 = v.findViewById(R.id.shuju_3);
        shuju_3.setText(m.getThree());

        TextView shuju_4 = v.findViewById(R.id.shuju_4);
        shuju_4.setText(m.getFour());

        TextView shuju_5 = v.findViewById(R.id.shuju_5);
        shuju_5.setText(m.getFive());

        TextView shuju_6 = v.findViewById(R.id.shuju_6);
        shuju_6.setText(m.getSix());

        TextView tv_id = v.findViewById(R.id.tv_id1);
        tv_id.setText(m.getID());
        //返回视图
        return v;
    }
}
