package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by macostay on 06/05/2016.
 */
public class Speaker implements Parcelable {

    private String name;
    private String urlPic;
    private String description;

    public Speaker() {
    }

    public Speaker(String name, String urlPic, String description) {
        this.name = name;
        this.urlPic = urlPic;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlPic() {
        return urlPic;
    }

    public void setUrlPic(String urlPic) {
        this.urlPic = urlPic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "name='" + name + '\'' +
                ", urlPic='" + urlPic + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.urlPic);
        dest.writeString(this.description);
    }

    protected Speaker(Parcel in) {
        this.name = in.readString();
        this.urlPic = in.readString();
        this.description = in.readString();
    }

    public static final Creator<Speaker> CREATOR = new Creator<Speaker>() {
        @Override
        public Speaker createFromParcel(Parcel source) {
            return new Speaker(source);
        }

        @Override
        public Speaker[] newArray(int size) {
            return new Speaker[size];
        }
    };
}
