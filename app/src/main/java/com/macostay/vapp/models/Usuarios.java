package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/**
 * Created by macostay on 19/05/2016.
 */
public class Usuarios implements Parcelable {

    private ArrayList<Usuario> mUsuarios;

    public Usuarios() {
    }

    public Usuarios(ArrayList<Usuario> usuarios) {
        mUsuarios = usuarios;
    }

    public ArrayList<Usuario> getUsuarios() {
        return mUsuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        mUsuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "mUsuarios=" + mUsuarios +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(mUsuarios);
    }

    protected Usuarios(Parcel in) {
        this.mUsuarios = in.createTypedArrayList(Usuario.CREATOR);
    }

    public static final Parcelable.Creator<Usuarios> CREATOR = new Parcelable.Creator<Usuarios>() {
        @Override
        public Usuarios createFromParcel(Parcel source) {
            return new Usuarios(source);
        }

        @Override
        public Usuarios[] newArray(int size) {
            return new Usuarios[size];
        }
    };
}
