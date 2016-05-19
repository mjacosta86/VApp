package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by macostay on 18/05/2016.
 */
public class Person implements Parcelable {

    private int id;
    private String dni;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private int edad;
    private String lugarNacimiento;

    public Person() {
    }

    public Person(int id, String dni, String nombre, String apellidos, String fechaNacimiento, int edad, String lugarNacimiento) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.lugarNacimiento = lugarNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", edad=" + edad +
                ", lugarNacimiento='" + lugarNacimiento + '\'' +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.dni);
        dest.writeString(this.nombre);
        dest.writeString(this.apellidos);
        dest.writeString(this.fechaNacimiento);
        dest.writeInt(this.edad);
        dest.writeString(this.lugarNacimiento);
    }

    protected Person(Parcel in) {
        this.id = in.readInt();
        this.dni = in.readString();
        this.nombre = in.readString();
        this.apellidos = in.readString();
        this.fechaNacimiento = in.readString();
        this.edad = in.readInt();
        this.lugarNacimiento = in.readString();
    }

    public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel source) {
            return new Person(source);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };
}
