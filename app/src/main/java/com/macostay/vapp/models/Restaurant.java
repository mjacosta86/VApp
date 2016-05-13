package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by macostay on 06/05/2016.
 */
public class Restaurant implements Parcelable {

    private String name;
    private String longitud;
    private String latitude;
    private String address;
    private String postalCode;
    private String city;
    private String country;
    private String phone;
    private String web;
    private String email;
    private ArrayList<Picture> pictures;

    public Restaurant() {
    }

    public Restaurant(String name, String longitud, String latitude, String address, String postalCode, String city, String country, String phone, String web, String email, ArrayList<Picture> pictures) {
        this.name = name;
        this.longitud = longitud;
        this.latitude = latitude;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.phone = phone;
        this.web = web;
        this.email = email;
        this.pictures = pictures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", longitud='" + longitud + '\'' +
                ", latitude='" + latitude + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", web='" + web + '\'' +
                ", email='" + email + '\'' +
                ", pictures=" + pictures +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.longitud);
        dest.writeString(this.latitude);
        dest.writeString(this.address);
        dest.writeString(this.postalCode);
        dest.writeString(this.city);
        dest.writeString(this.country);
        dest.writeString(this.phone);
        dest.writeString(this.web);
        dest.writeString(this.email);
        dest.writeTypedList(pictures);
    }

    protected Restaurant(Parcel in) {
        this.name = in.readString();
        this.longitud = in.readString();
        this.latitude = in.readString();
        this.address = in.readString();
        this.postalCode = in.readString();
        this.city = in.readString();
        this.country = in.readString();
        this.phone = in.readString();
        this.web = in.readString();
        this.email = in.readString();
        this.pictures = in.createTypedArrayList(Picture.CREATOR);
    }

    public static final Creator<Restaurant> CREATOR = new Creator<Restaurant>() {
        @Override
        public Restaurant createFromParcel(Parcel source) {
            return new Restaurant(source);
        }

        @Override
        public Restaurant[] newArray(int size) {
            return new Restaurant[size];
        }
    };
}
