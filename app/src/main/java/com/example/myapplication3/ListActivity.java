package com.example.myapplication3;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListActivity extends Activity {
    private ListView listView;
    private List<Map<String, Object>> data;
    private int selectedPosition = -1; // 用于跟踪选中的列表项

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);

        // 初始化ListView
        listView = findViewById(R.id.listView);

        // 准备数据
        prepareData();

        // 创建SimpleAdapter实例
        SimpleAdapter adapter = new SimpleAdapter(
                this,
                data,
                R.layout.list_item,
                new String[]{"name", "image"},
                new int[]{R.id.nameTextView, R.id.imageView}
        );

        // 设置适配器到ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // 获取被点击的列表项的数据
                Map<String, Object> item = data.get(position);

                // 获取名称
                String name = (String) item.get("name");

                // 显示自定义Toast
                showCustomToast(name);

                // 更新选中的列表项

            }
        });
    }


    private void showCustomToast(String text) {
        // 加载自定义布局
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, null);

        // 设置文本
        TextView textView = layout.findViewById(R.id.text);
        textView.setText(text);

        // 创建Toast并设置布局
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    private void prepareData() {
        data = new ArrayList<>();
        Map<String, Object> item1 = new HashMap<>();
        item1.put("name", "Lion");
        item1.put("image", R.drawable.lion); // 请确保lion是您的图片资源名称
        data.add(item1);

        Map<String, Object> item2 = new HashMap<>();
        item2.put("name", "Tiger");
        item2.put("image", R.drawable.tiger); // 请确保tiger是您的图片资源名称
        data.add(item2);

        Map<String, Object> item3 = new HashMap<>();
        item3.put("name", "Monkey");
        item3.put("image", R.drawable.monkey); // 请确保monkey是您的图片资源名称
        data.add(item3);

        Map<String, Object> item4 = new HashMap<>();
        item4.put("name", "Dog");
        item4.put("image", R.drawable.dog); // 请确保dog是您的图片资源名称
        data.add(item4);

        Map<String, Object> item5 = new HashMap<>();
        item5.put("name", "Cat");
        item5.put("image", R.drawable.cat_one); // 请确保cat是您的图片资源名称
        data.add(item5);

        Map<String, Object> item6 = new HashMap<>();
        item6.put("name", "Elephant");
        item6.put("image", R.drawable.elephant); // 请确保elephant是您的图片资源名称
        data.add(item6);
    }



}
