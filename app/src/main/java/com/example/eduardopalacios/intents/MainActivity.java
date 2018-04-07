package com.example.eduardopalacios.intents;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.eduardopalacios.intents.Clases.Usuario_Serializable;
import com.example.eduardopalacios.intents.Clases.Usuario_Parceable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Toolbar Toolbar;
    EditText nombre,telefono,direecion,correo;
    Button btnenviar,btnserializable,btnparceable;
    final String CLAVE_SER="serializable";
    final String CLAVE_PAR="parceable";

    Usuario_Serializable usuario_serializable;
    Usuario_Parceable usuario_parceable=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnenviar=(Button)findViewById(R.id.botondatosPrimitivos);
        btnserializable=(Button)findViewById(R.id.boton_serializable);
        btnparceable=(Button)findViewById(R.id.boton_parceable);

        btnenviar.setOnClickListener(this);
        btnserializable.setOnClickListener(this);
        btnparceable.setOnClickListener(this);

        nombre=(EditText)findViewById(R.id.nombre);
        telefono=(EditText)findViewById(R.id.Telefono);
        direecion=(EditText)findViewById(R.id.Direccion);
        correo=(EditText)findViewById(R.id.Correo);

        Toolbar=(Toolbar)findViewById(R.id.toolbar);
        Toolbar.setTitle("Contactos");
        Toolbar.setTitleTextColor(Color.parseColor("#ffffffff"));
        setSupportActionBar(Toolbar);


    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.botondatosPrimitivos)
        {

            Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
            Bundle bundle=new Bundle();
            bundle.putString("clave_nombre",nombre.getText().toString());
            bundle.putString("clave_telefono",telefono.getText().toString());
            bundle.putString("clave_direccion",direecion.getText().toString());
            bundle.putString("clave_correo",correo.getText().toString());

            //intent.putExtra("clave_nombre",nombre.getText().toString());
            //intent.putExtra("clave_telefono",telefono.getText().toString());
            //intent.putExtra("clave_direccion",direecion.getText().toString());
            //intent.putExtra("clave_correo",correo.getText().toString());
            intent.putExtras(bundle);

            startActivity(intent);


        }
        if (view.getId()==R.id.boton_serializable)
        {
             usuario_serializable=new Usuario_Serializable(nombre.getText().toString(),telefono.getText().toString(),direecion.getText().toString(),
                    correo.getText().toString());

            Intent intent= new Intent(getApplicationContext(),Main2Activity.class);
            Bundle bundle=new Bundle();
            bundle.putSerializable(CLAVE_SER,usuario_serializable);
            intent.putExtras(bundle);
            startActivity(intent);


        }

        if (view.getId()==R.id.boton_parceable)
        {
              usuario_parceable=new Usuario_Parceable(nombre.getText().toString(),telefono.getText().toString(),direecion.getText().toString(),
                    correo.getText().toString());

            Intent intent= new Intent(getApplicationContext(),Main2Activity.class);
            Bundle bundle=new Bundle();
            bundle.putParcelable(CLAVE_PAR,usuario_parceable);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }



}
