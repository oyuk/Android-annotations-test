package com.okysoft.androidannotationstest;

import android.app.Activity;
import android.widget.ListView;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_my_activity2)
public class MyActivity2 extends Activity {

    private static final String TAG = MyActivity2.class.getSimpleName();

    @ViewById(R.id.listView)ListView listView;


    @AfterInject
    void init(){


    }

}