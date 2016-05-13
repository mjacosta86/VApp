package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by macostay on 11/05/2016.
 */
public class ContactData implements Parcelable {

    private ArrayList<Contact> contact_data;

    public ContactData() {
    }

    public ContactData(ArrayList<Contact> contact_data) {
        this.contact_data = contact_data;
    }

    public ArrayList<Contact> getContact_data() {
        return contact_data;
    }

    public void setContact_data(ArrayList<Contact> contact_data) {
        this.contact_data = contact_data;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "contact_data=" + contact_data +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(contact_data);
    }

    protected ContactData(Parcel in) {
        this.contact_data = in.createTypedArrayList(Contact.CREATOR);
    }

    public static final Creator<ContactData> CREATOR = new Creator<ContactData>() {
        @Override
        public ContactData createFromParcel(Parcel source) {
            return new ContactData(source);
        }

        @Override
        public ContactData[] newArray(int size) {
            return new ContactData[size];
        }
    };
}
