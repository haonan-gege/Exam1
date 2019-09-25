package com.example.exam1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if("".equals(username.getText().toString()))
                {
                    Toast.makeText(MainActivity.this,"账号不能为空",Toast.LENGTH_SHORT).show();
                    return;
                }
                if("".equals(password.getText().toString()))
                {
                    Toast.makeText(MainActivity.this,"密码不能为空",Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("name", username.getText().toString().trim());
                    startActivity(intent);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
