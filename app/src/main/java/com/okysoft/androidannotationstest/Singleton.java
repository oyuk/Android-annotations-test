package com.okysoft.androidannotationstest;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

/**
 * Created by oky on 14/11/22.
 */

@EBean(scope = EBean.Scope.Singleton)
public class Singleton {
    private static final String TAG = Singleton.class.getSimpleName();

    @RootContext Context mContext;
    @RootContext Activity mActivity;

    private  int count;

    @AfterInject
    void init(){
        count = 0;
    }

    public void countUp(){
        Log.d(TAG,"count:"+ ++count);
    }
}
