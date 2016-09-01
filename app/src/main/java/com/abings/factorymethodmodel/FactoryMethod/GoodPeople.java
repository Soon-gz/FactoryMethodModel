package com.abings.factorymethodmodel.FactoryMethod;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by HaomingXu on 2016/9/1.
 */
public class GoodPeople implements GoodThings {

    private String name;
    private Context context;
    public GoodPeople(String name,Context context){
        this.name = name;
        this.context = context;
    }

    @Override
    public void cleanHouse() {
        Toast.makeText(context, name+"打扫房间", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void wash() {
        Toast.makeText(context, name+"洗衣服", Toast.LENGTH_SHORT).show();
    }
}
