package com.example.exam1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {
    private String data[] = {"Android应用程序开发","移动应用程序测试","高等数学","高职英语","Java程序设计语言","Android游戏开发","心理健康","体育"};
    private String message[] = {"Android是一个优秀的开源手机平台。本课程由浅入深地介绍了Andriod应用程序的开发，内容共分11章，包括Android的简介，开发环境，应用程序、Android生命周期和用户界面，组件通信与广播消息，后台服务，数据存储与访问，位置服务与地图应用，Android NDK开发以及综合示例设计与开发。",
            "移动应用程序测试","高等数学","高职英语","Java程序设计语言","Android游戏开发","心理健康","体育"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ListView listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle bundle = new Bundle();
                bundle.putString("data",data[i]);
                bundle.putString("message", message[i]);
                Intent intent = new Intent();
                intent.putExtras(bundle);
                intent.setClass(Main3Activity.this, Main4Activity.class);
                Log.i("message", message[i]);
                Log.i("data",data[i]);
                startActivity(intent);




            }
        });




    }
}
