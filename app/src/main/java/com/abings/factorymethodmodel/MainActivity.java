package com.abings.factorymethodmodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.abings.factorymethodmodel.FactoryMethod.BaoMuFactory;
import com.abings.factorymethodmodel.FactoryMethod.FactoryMethod;
import com.abings.factorymethodmodel.FactoryMethod.GoodPeopleFactory;
import com.abings.factorymethodmodel.FactoryMethod.GoodThings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //创建好人的工厂方法
        FactoryMethod factoryMethod = new GoodPeopleFactory(this);
        //创建保姆的工厂方法
        FactoryMethod factoryMethod1 = new BaoMuFactory(this);

        //创建好人
        GoodThings goodThings = factoryMethod.createGoodPeople();
        //创建保姆
        GoodThings goodThings1 = factoryMethod1.createGoodPeople();

        //工作
        goodThings.cleanHouse();
        goodThings1.wash();
    }
}
