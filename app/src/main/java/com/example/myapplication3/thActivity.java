package com.example.myapplication3;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;

import java.util.ArrayList;
import java.util.List;

// MainActivity.java or YourFragment.java
public class thActivity extends AppCompatActivity {

    private ListView listView;
    private MyListAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);

        listView = findViewById(R.id.listView);
        List<String> items = new ArrayList<>();
        items.add("One");
        items.add("Two");
        items.add("Three");
        items.add("Four");
        items.add("Five");

        adapter = new MyListAdapter(this, items);
        listView.setAdapter(adapter);

        // 设置长按监听器以启用上下文操作模式
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                startSupportActionMode(new ActionMode.Callback() {
                    @Override
                    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                        getMenuInflater().inflate(R.menu.context_menu, menu); // 加载上下文菜单资源
                        return true;
                    }

                    @Override
                    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                        return false; // 不做任何准备
                    }

                    @Override
                    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                        if (item.getItemId() == R.id.action_delete) {
                            // 处理删除逻辑
                            // 例如，删除选中的项目
                            items.remove(position); // 假设position是选中的项目的位置
                            adapter.notifyDataSetChanged();
                            mode.finish(); // 结束上下文操作模式
                            return true;
                        } else {
                            // 处理其他菜单项的逻辑或者返回 false
                            return false;
                        }
                        // 如果菜单项被处理，返回 true
                    }

                    @Override
                    public void onDestroyActionMode(ActionMode mode) {
                        // 关闭上下文操作模式时执行的操作
                    }
                });
                return true;
            }
        });
    }
}