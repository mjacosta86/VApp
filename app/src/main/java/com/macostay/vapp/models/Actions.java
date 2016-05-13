package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by macostay on 11/05/2016.
 */
public class Actions implements Parcelable {

    private ArrayList<Action> actions;

    public Actions() {
    }

    public Actions(ArrayList<Action> actions) {
        this.actions = actions;
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    public void setActions(ArrayList<Action> actions) {
        this.actions = actions;
    }

    @Override
    public String toString() {
        return "Actions{" +
                "actions=" + actions +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(actions);
    }

    protected Actions(Parcel in) {
        this.actions = in.createTypedArrayList(Action.CREATOR);
    }

    public static final Creator<Actions> CREATOR = new Creator<Actions>() {
        @Override
        public Actions createFromParcel(Parcel source) {
            return new Actions(source);
        }

        @Override
        public Actions[] newArray(int size) {
            return new Actions[size];
        }
    };
}
