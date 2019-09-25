package com.example.exam1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    private TextView text1;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        Bundle bundle=getIntent().getExtras();
        String message=bundle.getString("message");
        String data=bundle.getString("data");
        TextView mate=(TextView) findViewById(R.id.text);
        TextView mess=(TextView) findViewById(R.id.text1);
        mess.setText(message);
        mate.setText(data);


    }
}
