package com.example.myapplication3;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {


    private static final int FONT_SIZE_SMALL = 10;
    private static final int FONT_SIZE_MEDIUM = 16;
    private static final int FONT_SIZE_LARGE = 20;
    private TextView textView;
//    private  final int FONT_SIZE_SMALL = 10;
//    private static final int FONT_SIZE_MEDIUM = 16;
//    private static final int FONT_SIZE_LARGE = 20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
        textView = findViewById(R.id.text_view);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.font_size_small) {
            textView.setTextSize(FONT_SIZE_SMALL);
            return true;
        } else if (item.getItemId() == R.id.font_size_medium) {
            textView.setTextSize(FONT_SIZE_MEDIUM);
            return true;
        } else if (item.getItemId() == R.id.font_size_large) {
            textView.setTextSize(FONT_SIZE_LARGE);
            return true;
        } else if (item.getItemId() == R.id.menu_normal_item) {
            Toast.makeText(this, "这是一个普通菜单项的Toast提示", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.font_color_red) {
            textView.setTextColor(Color.RED);
            return true;
        } else if (item.getItemId() == R.id.font_color_black) {
            textView.setTextColor(Color.BLACK);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}




