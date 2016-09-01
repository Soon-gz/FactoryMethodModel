package com.abings.factorymethodmodel.FactoryMethod;

import android.content.Context;

/**
 * Created by HaomingXu on 2016/9/1.
 */
public class BaoMuFactory implements FactoryMethod {
    private BaoMu baomu;
    private Context context;
    public BaoMuFactory(Context context){
        this.context = context;
    }

    @Override
    public GoodThings createGoodPeople() {
        if (baomu == null){
            baomu = new BaoMu("保姆",context);
        }
        return baomu;
    }
}
