package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by macostay on 06/05/2016.
 */
public class Event implements Parcelable {
    private int event_id;
    private String name;
    private String event_description;
    private ArrayList<Picture> pictures;
    private String startDateTime;
    private String endDateTime;
    private String venue;
    private String address;
    private String postalCode;
    private String city;
    private String country;
    private String latitude;
    private String longitude;
    private String web;
    private ArrayList<Restaurant> restaurants;
    private ArrayList<Hotel> hotels;
    private ArrayList<Place> places_of_interest;

    public Event() {
    }

    public Event(int id, String name, String description, ArrayList<Picture> pictures, String startDateTime, String endDateTime, String venue, String address, String postalCode, String city, String country, String latitude, String longitude, String web, ArrayList<Restaurant> restaurants, ArrayList<Hotel> hotels, ArrayList<Place> places_of_interest) {
        this.event_id = id;
        this.name = name;
        this.event_description = description;
        this.pictures = pictures;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.venue = venue;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.web = web;
        this.restaurants = restaurants;
        this.hotels = hotels;
        this.places_of_interest = places_of_interest;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEvent_description() {
        return event_description;
    }

    public void setEvent_description(String event_description) {
        this.event_description = event_description;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }

    public ArrayList<Place> getPlaces_of_interest() {
        return places_of_interest;
    }

    public void setPlaces_of_interest(ArrayList<Place> places_of_interest) {
        this.places_of_interest = places_of_interest;
    }

    @Override
    public String toString() {
        return "Event{" +
                "event_id=" + event_id +
                ", name='" + name + '\'' +
                ", event_description='" + event_description + '\'' +
                ", pictures=" + pictures +
                ", startDateTime='" + startDateTime + '\'' +
                ", endDateTime='" + endDateTime + '\'' +
                ", venue='" + venue + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", web='" + web + '\'' +
                ", restaurants=" + restaurants +
                ", hotels=" + hotels +
                ", places_of_interest=" + places_of_interest +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.event_id);
        dest.writeString(this.name);
        dest.writeString(this.event_description);
        dest.writeTypedList(pictures);
        dest.writeString(this.startDateTime);
        dest.writeString(this.endDateTime);
        dest.writeString(this.venue);
        dest.writeString(this.address);
        dest.writeString(this.postalCode);
        dest.writeString(this.city);
        dest.writeString(this.country);
        dest.writeString(this.latitude);
        dest.writeString(this.longitude);
        dest.writeString(this.web);
        dest.writeTypedList(restaurants);
        dest.writeTypedList(hotels);
        dest.writeTypedList(places_of_interest);
    }

    protected Event(Parcel in) {
        this.event_id = in.readInt();
        this.name = in.readString();
        this.event_description = in.readString();
        this.pictures = in.createTypedArrayList(Picture.CREATOR);
        this.startDateTime = in.readString();
        this.endDateTime = in.readString();
        this.venue = in.readString();
        this.address = in.readString();
        this.postalCode = in.readString();
        this.city = in.readString();
        this.country = in.readString();
        this.latitude = in.readString();
        this.longitude = in.readString();
        this.web = in.readString();
        this.restaurants = in.createTypedArrayList(Restaurant.CREATOR);
        this.hotels = in.createTypedArrayList(Hotel.CREATOR);
        this.places_of_interest = in.createTypedArrayList(Place.CREATOR);
    }

    public static final Creator<Event> CREATOR = new Creator<Event>() {
        @Override
        public Event createFromParcel(Parcel source) {
            return new Event(source);
        }

        @Override
        public Event[] newArray(int size) {
            return new Event[size];
        }
    };
}
