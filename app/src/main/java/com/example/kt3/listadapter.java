package com.example.kt3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class listadapter extends BaseAdapter {
    private Activity activity;
    private List<pheptinh> x;

    public listadapter(Activity activity, List<pheptinh> x){
        this.activity = activity;
        this.x = x;
    }

    @Override
    public int getCount() {
        return x.size();
    }

    @Override
    public Object getItem(int i) {
        return x.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        return null;
    }
}
