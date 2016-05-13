package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by macostay on 11/05/2016.
 */
public class News implements Parcelable {

    private ArrayList<NewsItem> news;

    public News() {
    }

    public News(ArrayList<NewsItem> news) {
        this.news = news;
    }

    public ArrayList<NewsItem> getNews() {
        return news;
    }

    public void setNews(ArrayList<NewsItem> news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "News{" +
                "news=" + news +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(news);
    }

    protected News(Parcel in) {
        this.news = in.createTypedArrayList(NewsItem.CREATOR);
    }

    public static final Creator<News> CREATOR = new Creator<News>() {
        @Override
        public News createFromParcel(Parcel source) {
            return new News(source);
        }

        @Override
        public News[] newArray(int size) {
            return new News[size];
        }
    };
}
