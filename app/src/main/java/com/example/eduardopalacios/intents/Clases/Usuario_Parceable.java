package com.example.eduardopalacios.intents.Clases;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by eduardopalacios on 21/03/18.
 */

public class Usuario_Parceable implements Parcelable{

    String nombre,telefono,direccion,correo;
    public Usuario_Parceable(String nombre,String telefono,String direccion,String correo)
    {
        this.nombre=nombre;
        this.telefono=telefono;
        this.direccion=direccion;
        this.correo=correo;
    }


    public Usuario_Parceable(Parcel in) {
        nombre = in.readString();
        telefono = in.readString();
        direccion = in.readString();
        correo = in.readString();
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(telefono);
        parcel.writeString(direccion);
        parcel.writeString(correo);
    }

    public static final Creator<Usuario_Parceable> CREATOR = new Creator<Usuario_Parceable>() {
        @Override
        public Usuario_Parceable createFromParcel(Parcel in) {
            return new Usuario_Parceable(in);
        }

        @Override
        public Usuario_Parceable[] newArray(int size) {
            return new Usuario_Parceable[size];
        }
    };

}
