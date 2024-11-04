package com.example.myapplication3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
// 其他必要的import语句

public class DialogActivity extends AppCompatActivity { // 注意这里应该是 AppCompatActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_button); // 设置Activity的布局

        // 当需要显示对话框时，例如按钮点击事件中
        Button buttonShowDialog = findViewById(R.id.button_show_dialog);
        buttonShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 显示对话框
                CustomDialogFragment dialogFragment = new CustomDialogFragment();
                dialogFragment.show(DialogActivity.this.getSupportFragmentManager(), "CustomDialogFragment");
            }
        });
    }
}