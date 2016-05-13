package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by macostay on 06/05/2016.
 */
public class Picture implements Parcelable {

    private String urlThumbnail;
    private String urlPic;

    public Picture() {
    }

    public Picture(String urlThumbnail, String urlPic) {
        this.urlThumbnail = urlThumbnail;
        this.urlPic = urlPic;
    }

    public String getUrlThumbnail() {
        return urlThumbnail;
    }

    public void setUrlThumbnail(String urlThumbnail) {
        this.urlThumbnail = urlThumbnail;
    }

    public String getUrlPic() {
        return urlPic;
    }

    public void setUrlPic(String urlPic) {
        this.urlPic = urlPic;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "urlThumbnail='" + urlThumbnail + '\'' +
                ", urlPic='" + urlPic + '\'' +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.urlThumbnail);
        dest.writeString(this.urlPic);
    }

    protected Picture(Parcel in) {
        this.urlThumbnail = in.readString();
        this.urlPic = in.readString();
    }

    public static final Creator<Picture> CREATOR = new Creator<Picture>() {
        @Override
        public Picture createFromParcel(Parcel source) {
            return new Picture(source);
        }

        @Override
        public Picture[] newArray(int size) {
            return new Picture[size];
        }
    };
}
