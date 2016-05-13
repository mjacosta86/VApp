package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by macostay on 06/05/2016.
 */
public class AgendaItem implements Parcelable {

    private String type;
    private String title;
    private String description;
    private String startDateTime;
    private String endDateTime;
    private String venue;
    private ArrayList<Speaker> speakers;

    public AgendaItem() {
    }

    public AgendaItem(String type, String title, String description, String endStartTime, String startDateTime, String venue, ArrayList<Speaker> speakers) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.endDateTime = endStartTime;
        this.startDateTime = startDateTime;
        this.venue = venue;
        this.speakers = speakers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public ArrayList<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(ArrayList<Speaker> speakers) {
        this.speakers = speakers;
    }

    @Override
    public String toString() {
        return "AgendaItem{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDateTime='" + startDateTime + '\'' +
                ", endDateTime='" + endDateTime + '\'' +
                ", venue='" + venue + '\'' +
                ", speakers=" + speakers +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.type);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.startDateTime);
        dest.writeString(this.endDateTime);
        dest.writeString(this.venue);
        dest.writeTypedList(speakers);
    }

    protected AgendaItem(Parcel in) {
        this.type = in.readString();
        this.title = in.readString();
        this.description = in.readString();
        this.startDateTime = in.readString();
        this.endDateTime = in.readString();
        this.venue = in.readString();
        this.speakers = in.createTypedArrayList(Speaker.CREATOR);
    }

    public static final Creator<AgendaItem> CREATOR = new Creator<AgendaItem>() {
        @Override
        public AgendaItem createFromParcel(Parcel source) {
            return new AgendaItem(source);
        }

        @Override
        public AgendaItem[] newArray(int size) {
            return new AgendaItem[size];
        }
    };
}
