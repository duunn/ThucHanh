package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button b1,b2,b3,b4,b5;
private TextView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(TextView) findViewById(R.id.show);
        b1=(Button) findViewById(R.id.f1);
        b2=(Button) findViewById(R.id.f2);
        b3=(Button) findViewById(R.id.f3);
        b4=(Button) findViewById(R.id.f4);
        b5=(Button) findViewById(R.id.f5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.setText(" "+"bread");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.setText(" "+"cherrycheesecake");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.setText(" "+"gingerbreadhouse");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.setText(" "+"hamburger");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.setText(" "+"sunnysideupeggs");
            }
        });
    }

}