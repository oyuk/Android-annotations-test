package com.okysoft.androidannotationstest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oky on 14/11/22.
 */
@EBean
public class MyListAdapter extends BaseAdapter{

    private List<String> myList;

    @RootContext
    Context mContext;

    @AfterInject
    void init(){
        myList = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            myList.add("test"+Integer.toString(i));
        }
    }

    @Override
    public Object getItem(int position) {
        return myList.get(position);
    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }


}
