package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by macostay on 11/05/2016.
 */
public class Events implements Parcelable {

    private ArrayList<Event> events;

    public Events() {
    }

    public Events(ArrayList<Event> events) {
        this.events = events;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "Events{" +
                "events=" + events +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(events);
    }

    protected Events(Parcel in) {
        this.events = in.createTypedArrayList(Event.CREATOR);
    }

    public static final Creator<Events> CREATOR = new Creator<Events>() {
        @Override
        public Events createFromParcel(Parcel source) {
            return new Events(source);
        }

        @Override
        public Events[] newArray(int size) {
            return new Events[size];
        }
    };
}
