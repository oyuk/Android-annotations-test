package com.okysoft.androidannotationstest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

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
    private LayoutInflater mInflater;

    @RootContext
    Context mContext;

    @AfterInject
    void init(){
        myList = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            myList.add("test"+Integer.toString(i));
        }

        mInflater = LayoutInflater.from(mContext);
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

        final ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.cell, parent, false);
            holder.text = (TextView) convertView.findViewById(R.id.textView3);
            holder.checkBox = (CheckBox) convertView.findViewById(R.id.checkBox);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.text.setText(myList.get(position));
        holder.checkBox.setChecked(position % 2 == 0);

        return convertView;
    }

    class ViewHolder {
        TextView text;
        CheckBox checkBox;
    }
}
