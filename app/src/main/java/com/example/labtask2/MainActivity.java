package com.example.labtask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText name_txt;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.show_btn);
        name_txt = findViewById(R.id.name_txt);
        pass = findViewById(R.id.pass);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = name_txt.getText().toString();
                String p = pass.getText().toString();
                Intent i = new Intent (MainActivity.this, HomePage.class);
                i.putExtra("k1",name);
                i.putExtra("k2",p);
                startActivity(i);

            }
        });
    }
}