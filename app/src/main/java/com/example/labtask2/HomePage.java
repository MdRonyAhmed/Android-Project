package com.example.labtask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    TextView tv;
    TextView pa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        tv = findViewById(R.id.dis);
        pa = findViewById(R.id.disPass);
        Intent a = getIntent();
        String value = a.getStringExtra("k1");
        String valuePass = a.getStringExtra("k2");
        tv.setText(value);
        pa.setText(valuePass);

    }
}