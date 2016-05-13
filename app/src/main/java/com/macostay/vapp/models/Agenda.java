package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by macostay on 11/05/2016.
 */
public class Agenda implements Parcelable {

    private ArrayList<AgendaItem> agenda;

    public Agenda() {
    }

    public Agenda(ArrayList<AgendaItem> agenda) {
        this.agenda = agenda;
    }

    public ArrayList<AgendaItem> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<AgendaItem> agenda) {
        this.agenda = agenda;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "agenda=" + agenda +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(agenda);
    }

    protected Agenda(Parcel in) {
        this.agenda = in.createTypedArrayList(AgendaItem.CREATOR);
    }

    public static final Creator<Agenda> CREATOR = new Creator<Agenda>() {
        @Override
        public Agenda createFromParcel(Parcel source) {
            return new Agenda(source);
        }

        @Override
        public Agenda[] newArray(int size) {
            return new Agenda[size];
        }
    };
}
