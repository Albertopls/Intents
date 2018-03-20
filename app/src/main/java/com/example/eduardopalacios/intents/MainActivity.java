package com.example.eduardopalacios.intents;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Toolbar Toolbar;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.boton_aceptar);
        Toolbar=(Toolbar)findViewById(R.id.toolbar);
        Toolbar.setTitle("Contactos");
        Toolbar.setTitleTextColor(Color.parseColor("#ffffffff"));
        setSupportActionBar(Toolbar);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}
