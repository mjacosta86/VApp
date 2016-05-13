package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by macostay on 06/05/2016.
 */
public class Action implements Parcelable {

    private String action_id;
    private String title;
    private boolean available;

    public Action() {
    }

    public Action(String action_id, String title, boolean available) {
        this.action_id = action_id;
        this.title = title;
        this.available = available;
    }

    public String getAction_id() {
        return action_id;
    }

    public void setAction_id(String action_id) {
        this.action_id = action_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Action{" +
                "action_id='" + action_id + '\'' +
                ", title='" + title + '\'' +
                ", available=" + available +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.action_id);
        dest.writeString(this.title);
        dest.writeByte(available ? (byte) 1 : (byte) 0);
    }

    protected Action(Parcel in) {
        this.action_id = in.readString();
        this.title = in.readString();
        this.available = in.readByte() != 0;
    }

    public static final Creator<Action> CREATOR = new Creator<Action>() {
        @Override
        public Action createFromParcel(Parcel source) {
            return new Action(source);
        }

        @Override
        public Action[] newArray(int size) {
            return new Action[size];
        }
    };
}
