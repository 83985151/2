package com.example.myapplication3;
//
//
//import android.annotation.SuppressLint;
//import android.os.Bundle;
//import android.view.ActionMode;
//import android.view.Menu;
//import android.view.MenuInflater;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class ModelActivity extends AppCompatActivity {
//    private ListView listView;
//    private ArrayAdapter<String> adapter;
//    private String[] items = {"One", "Two", "Three", "Four", "Five"};
//    private ActionMode mActionMode;
//    private int selectedItemIndex = -1;
//
//    @SuppressLint("MissingInflatedId")
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        listView = findViewById(R.id.listView);
//        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                if (mActionMode != null) {
//                    return false;
//                }
//                selectedItemIndex = position;
//                // 确保导入的是 androidx.appcompat.view.ActionMode.Callback
//                mActionMode = startSupportActionMode(new ActionMode.Callback() {
//                    // 实现回调方法
//                    @Override
//                    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
//                        getMenuInflater().inflate(R.menu.context_menu, menu);
//                        return true;
//                    }
//
//                    @Override
//                    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
//                        return false;
//                    }
//
//                    @Override
//                    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
//                        if (item.getItemId() == R.id.action_delete) {
//                            if (selectedItemIndex >= 0) {
//                                items.remove(selectedItemIndex);
//                                adapter.notifyDataSetChanged();
//                                selectedItemIndex = -1;
//                            }
//                            mode.finish();
//                            return true;
//                        }
//                        return false;
//                    }
//
//                    @Override
//                    public void onDestroyActionMode(ActionMode mode) {
//                        mActionMode = null;
//                        selectedItemIndex = -1;
//                    }
//                });
//                view.setSelected(true);
//                return true;
//            }
//        });
//    }

//    private ActionMode.Callback mActionModeCallback = new ActionMode.Callback() {
//        @Override
//        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
//            getMenuInflater().inflate(R.menu.context_menu, menu);
//            return true;
//        }
//
//        @Override
//        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
//            return false;
//        }
//
//        @Override
//        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.action_delete:
//                    if (selectedItemIndex >= 0) {
//                        items = removeItemAtIndex(items, selectedItemIndex);
//                        adapter.notifyDataSetChanged();
//                        selectedItemIndex = -1;
//                    }
//                    mode.finish();
//                    return true;
//                default:
//                    return false;
//            }
//        }
//
//        @Override
//        public void onDestroyActionMode(ActionMode mode) {
//            mActionMode = null;
//            selectedItemIndex = -1;
//        }
//    };
