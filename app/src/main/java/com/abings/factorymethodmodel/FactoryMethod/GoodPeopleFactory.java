package com.abings.factorymethodmodel.FactoryMethod;

import android.content.Context;

/**
 * Created by HaomingXu on 2016/9/1.
 */
public class GoodPeopleFactory implements FactoryMethod {
    private GoodPeople goodPeople;
    private Context context;
    public GoodPeopleFactory(Context context){
        this.context = context;
    }

    @Override
    public GoodThings createGoodPeople() {
        if (goodPeople == null){
            goodPeople = new GoodPeople("好人",context);
        }
        return goodPeople;
    }
}
