package com.example.eduardopalacios.intents;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Property;
import android.widget.TextView;

import com.example.eduardopalacios.intents.Clases.Usuario_Parceable;
import com.example.eduardopalacios.intents.Clases.Usuario_Serializable;


public class Main2Activity extends AppCompatActivity {

    Toolbar Toolbar;
    TextView muestra_nombre,muestra_telefono,muestra_direccion,muestra_correo;
    final String CLAVE_SER="serializable";
    final String CLAVE_PAR="parceable";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar=(Toolbar)findViewById(R.id.toolbar);

        muestra_nombre=(TextView)findViewById(R.id.nombre);
        muestra_telefono=(TextView)findViewById(R.id.Telefono);
        muestra_direccion=(TextView)findViewById(R.id.Direccion);
        muestra_correo=(TextView)findViewById(R.id.Correo);

        Toolbar.setTitle("Información");
        Toolbar.setTitleTextColor(Color.parseColor("#ffffffff"));
        setSupportActionBar(Toolbar);

        Bundle bundle=getIntent().getExtras();

        //Usuario_Serializable getUsuario=(Usuario_Serializable)getIntent().getSerializableExtra(SER_KEY);


        Intent intent=getIntent();
        Usuario_Parceable getUsuario=bundle.getParcelable(CLAVE_PAR);





        muestra_nombre.setText(getUsuario.getNombre());
        muestra_telefono.setText(getUsuario.getTelefono());
        muestra_direccion.setText(getUsuario.getDireccion());
        muestra_correo.setText(getUsuario.getCorreo());
    }
}
