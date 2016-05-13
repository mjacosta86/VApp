package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by macostay on 06/05/2016.
 */
public class GamingItem implements Parcelable {

    private String event_id;
    private String lang;
    private ArrayList<Answer> answers;
    private String email;
    private String nombre;

    public GamingItem() {
    }

    public GamingItem(String event_id, String lang, ArrayList<Answer> answers, String email, String nombre) {
        this.event_id = event_id;
        this.lang = lang;
        this.answers = answers;
        this.email = email;
        this.nombre = nombre;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "GamingItem{" +
                "event_id='" + event_id + '\'' +
                ", lang='" + lang + '\'' +
                ", answers=" + answers +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.event_id);
        dest.writeString(this.lang);
        dest.writeTypedList(answers);
        dest.writeString(this.email);
        dest.writeString(this.nombre);
    }

    protected GamingItem(Parcel in) {
        this.event_id = in.readString();
        this.lang = in.readString();
        this.answers = in.createTypedArrayList(Answer.CREATOR);
        this.email = in.readString();
        this.nombre = in.readString();
    }

    public static final Creator<GamingItem> CREATOR = new Creator<GamingItem>() {
        @Override
        public GamingItem createFromParcel(Parcel source) {
            return new GamingItem(source);
        }

        @Override
        public GamingItem[] newArray(int size) {
            return new GamingItem[size];
        }
    };
}
