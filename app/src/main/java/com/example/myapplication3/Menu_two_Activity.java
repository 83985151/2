package com.example.myapplication3;
//
//import android.graphics.Color;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ListView;
//import android.widget.SimpleAdapter;
//import android.widget.Toast;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//public class Menu_two_Activity extends AppCompatActivity {
//    private ListView listView;
//    private List<Map<String, Object>> data;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_model);
//        listView = findViewById(R.id.listView);
//        List<String> items = new ArrayList<>();
//        items.add("One");
//        items.add("Two");
//        items.add("Three");
//        items.add("Four");
//        items.add("Five");
//
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
//
//
//    // 准备数据
//    prepareData();
//
//    // 创建SimpleAdapter实例
//    SimpleAdapter adapter = new SimpleAdapter(
//            this,
//            data,
//            R.layout.list_item,
//            new String[]{"name", "image"},
//            new int[]{R.id.nameTextView, R.id.imageView}
//    );
//
//    // 设置适配器到ListView
//    listView.setAdapter(adapter);
//
//    listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//        @Override
//        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            // 获取被点击的列表项的数据
//            Map<String, Object> item = data.get(position);
//
//            // 获取名称
//            String name = (String) item.get("name");
//
//            // 显示自定义Toast
//            showCustomToast(name);
//
//            // 更新选中的列表项
//
//        }
//
//        @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.context_menu, menu);
//        return true;
//    }
//
//        @Override
//        public boolean onOptionsItemSelected(MenuItem item) {
//            if (item.getItemId() == R.id.action_delete) {
//                item.rem
//                return true;
//            } else if (item.getItemId() == R.id.font_color_black) {
//                textView.setTextColor(Color.BLACK);
//                return true;
//            }
//            return super.onOptionsItemSelected(item);
//        }}
//
//}
//
//}
