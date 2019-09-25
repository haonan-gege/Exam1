package com.example.exam1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView username;
    private ImageView course;
    private ImageView tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        username=findViewById(R.id.username);
        String name=getIntent().getStringExtra("name");
        username.setText(name);

        course=findViewById(R.id.course);
        tool=findViewById(R.id.tool);

        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });


    }
}
