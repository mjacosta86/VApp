package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by macostay on 06/05/2016.
 */
public class NewsItem implements Parcelable {

    private String title;
    private String description;
    private String urlPic;
    private String externalLink;

    public NewsItem() {
    }

    public NewsItem(String title, String description, String urlPic, String externalLink) {
        this.title = title;
        this.description = description;
        this.urlPic = urlPic;
        this.externalLink = externalLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlPic() {
        return urlPic;
    }

    public void setUrlPic(String urlPic) {
        this.urlPic = urlPic;
    }

    public String getExternalLink() {
        return externalLink;
    }

    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink;
    }

    @Override
    public String toString() {
        return "NewsItem{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", urlPic='" + urlPic + '\'' +
                ", externalLink='" + externalLink + '\'' +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.urlPic);
        dest.writeString(this.externalLink);
    }

    protected NewsItem(Parcel in) {
        this.title = in.readString();
        this.description = in.readString();
        this.urlPic = in.readString();
        this.externalLink = in.readString();
    }

    public static final Creator<NewsItem> CREATOR = new Creator<NewsItem>() {
        @Override
        public NewsItem createFromParcel(Parcel source) {
            return new NewsItem(source);
        }

        @Override
        public NewsItem[] newArray(int size) {
            return new NewsItem[size];
        }
    };
}
