package com.example.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication3.util.ToastUtil;

public class MainActivity extends AppCompatActivity {
    private Button mBtnLogin;
    private EditText mEtUser;
    private EditText mEtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       mBtnLogin=findViewById(R.id.btn_login);
        mEtUser=findViewById(R.id.et_1);
        mEtPassword=findViewById(R.id.et_2);
//       mBtnLogin.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//               Intent intent=null;
//               intent=new Intent(MainActivity.this,FunctionActivity2.class);
//               startActivity(intent);
//           }
//       });


    mBtnLogin.setOnClickListener(this::onClick);
    }

    private void onClick(View v){
        String username= mEtUser.getText().toString();
        String password = mEtPassword.getText().toString();

        String ok="登录成功";
        String fails="登录失败";
        Intent intent=null;

        if(username.equals("lyh")&&password.equals("123456")){

           // Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_SHORT).show();
            ToastUtil.showMsg(MainActivity.this,ok);
            intent=new Intent(MainActivity.this, SlideActivity.class);
            startActivity(intent);

        }else{

            Toast fails1 = Toast.makeText(getApplicationContext(), "fails", Toast.LENGTH_SHORT);
            fails1.setGravity(Gravity.CENTER,0,0);
            fails1.show();
        }
    }
}