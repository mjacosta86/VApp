package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by macostay on 06/05/2016.
 */
public class City implements Parcelable {

    private ArrayList<Restaurant> restaurants;
    private ArrayList<Hotel> hotels;
    private ArrayList<Place> places_of_interest;

    public City() {
    }

    public City(ArrayList<Restaurant> restaurants, ArrayList<Hotel> hotels, ArrayList<Place> places_of_interest) {
        this.restaurants = restaurants;
        this.hotels = hotels;
        this.places_of_interest = places_of_interest;
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
        return "City{" +
                "restaurants=" + restaurants +
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
        dest.writeTypedList(restaurants);
        dest.writeTypedList(hotels);
        dest.writeTypedList(places_of_interest);
    }

    protected City(Parcel in) {
        this.restaurants = in.createTypedArrayList(Restaurant.CREATOR);
        this.hotels = in.createTypedArrayList(Hotel.CREATOR);
        this.places_of_interest = in.createTypedArrayList(Place.CREATOR);
    }

    public static final Creator<City> CREATOR = new Creator<City>() {
        @Override
        public City createFromParcel(Parcel source) {
            return new City(source);
        }

        @Override
        public City[] newArray(int size) {
            return new City[size];
        }
    };
}
