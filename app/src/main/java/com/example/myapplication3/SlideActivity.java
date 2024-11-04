package com.example.myapplication3;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SlideActivity extends AppCompatActivity {
private ImageView mIvHead;
private SlideMenu slideMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_slide);
     mIvHead=findViewById(R.id.iv_head);
     slideMenu = findViewById(R.id.slideMenu);

     mIvHead.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             slideMenu.switchMenu();
         }
     });

    }
}