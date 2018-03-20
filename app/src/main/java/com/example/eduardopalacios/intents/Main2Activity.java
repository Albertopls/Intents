package com.example.eduardopalacios.intents;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Main2Activity extends AppCompatActivity {

    Toolbar Toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar=(Toolbar)findViewById(R.id.toolbar);
        Toolbar.setTitle("Información");
        Toolbar.setTitleTextColor(Color.parseColor("#ffffffff"));
        setSupportActionBar(Toolbar);
    }
}
