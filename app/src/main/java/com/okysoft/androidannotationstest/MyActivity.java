package com.okysoft.androidannotationstest;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;


@EActivity(R.layout.activity_my)
public class MyActivity extends Activity {

    private static final String TAG = MyActivity.class.getSimpleName();

    private int i = 0;

    @Bean Singleton singleton;

    @ViewById(R.id.textView)TextView textView;
    @ViewById(R.id.button2)Button button2;

    @Click(R.id.button)
    void button(){

        textView.setText(Integer.toString(i++));

        singleton = Singleton_.getInstance_(this);

        singleton.countUp();
    }

    @Click(R.id.button2)
    void button2(){

        Intent intent = new Intent(MyActivity.this,MyActivity2_.class);
        startActivity(intent);
    }

    @AfterViews
    void initViews(){
        textView.setText("test");
        button2.setText("move View");
        singleton.countUp();
    }


}
