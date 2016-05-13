package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by macostay on 06/05/2016.
 */
public class UploadImage implements Parcelable {

    private String event_id;
    private String imageData;

    public UploadImage() {
    }

    public UploadImage(String event_id, String imageData) {
        this.event_id = event_id;
        this.imageData = imageData;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getImageData() {
        return imageData;
    }

    public void setImageData(String imageData) {
        this.imageData = imageData;
    }

    @Override
    public String toString() {
        return "UploadImage{" +
                "event_id='" + event_id + '\'' +
                ", imageData='" + imageData + '\'' +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.event_id);
        dest.writeString(this.imageData);
    }

    protected UploadImage(Parcel in) {
        this.event_id = in.readString();
        this.imageData = in.readString();
    }

    public static final Creator<UploadImage> CREATOR = new Creator<UploadImage>() {
        @Override
        public UploadImage createFromParcel(Parcel source) {
            return new UploadImage(source);
        }

        @Override
        public UploadImage[] newArray(int size) {
            return new UploadImage[size];
        }
    };
}
