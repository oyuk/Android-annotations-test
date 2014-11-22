package com.okysoft.androidannotationstest;

import android.app.Activity;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;


@EActivity(R.layout.activity_my)
public class MyActivity extends Activity {

    private static final String TAG = MyActivity.class.getSimpleName();

    private int i = 0;

    @ViewById(R.id.textView)
    TextView textView;

    @Click
    void button(){
        textView.setText(Integer.toString(i++));
    }

    @AfterViews
    void initViews(){
        textView.setText("test");

    }

}
