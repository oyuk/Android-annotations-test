package com.okysoft.androidannotationstest;

import android.app.Activity;
import android.widget.ListView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ItemLongClick;
import org.androidannotations.annotations.ItemSelect;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_my_activity2)
public class MyActivity2 extends Activity {

    private static final String TAG = MyActivity2.class.getSimpleName();

    @ViewById(R.id.listView)ListView listView;

    @Bean MyListAdapter myListAdapter;

    @AfterViews
    void init(){
        listView.setAdapter(myListAdapter);
    }

    @ItemClick(R.id.listView)
    public void listItenClicked(String title){
        Toast.makeText(this, title, Toast.LENGTH_SHORT).show();
    }

    @ItemLongClick(R.id.listView)
    public void listItenLongClicked(String title) {
        Toast.makeText(this,title,Toast.LENGTH_LONG).show();
    }

    @ItemSelect(R.id.listView)
    public void listItemSelected(boolean selected, String title) {
        Toast.makeText(this,title+":"+selected,Toast.LENGTH_LONG).show();
    }
}
