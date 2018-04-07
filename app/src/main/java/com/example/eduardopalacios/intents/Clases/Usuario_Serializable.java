package com.example.eduardopalacios.intents.Clases;

import java.io.Serializable;

/**
 * Created by eduardopalacios on 19/03/18.
 */

public class Usuario_Serializable implements Serializable{

    String nombre,telefono,direccion,correo;
    public Usuario_Serializable(String nombre, String telefono, String direccion, String correo)
    {
        this.nombre=nombre;
        this.telefono=telefono;
        this.direccion=direccion;
        this.correo=correo;

    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }
}
