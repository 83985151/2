package com.example.myapplication3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

// MyListAdapter.java
public class MyListAdapter extends ArrayAdapter<String> {
    public MyListAdapter(Context context, List<String> items) {
        super(context, R.layout.list_item_one, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_one, parent, false);
        }

        ImageView iconView = convertView.findViewById(R.id.icon);
        TextView textView = convertView.findViewById(R.id.text);

        // 假设我们的图标是固定的，但你可以根据实际情况动态设置
        iconView.setImageResource(R.drawable.cat);
        textView.setText(getItem(position));

        return convertView;
    }
}

