package com.macostay.vapp;

import android.app.Application;

import com.macostay.vapp.retrofit.RetrofitApi;

/**
 * Created by macostay on 05/05/2016.
 */
public class VAppApplication extends Application{

    private static VAppApplication sInstance;
    private static RetrofitApi sRetrofitApi;

    @Override
    public void onCreate() {
        super.onCreate();
        sRetrofitApi = new RetrofitApi();
        sInstance = this;
    }
    public static synchronized VAppApplication getInstance() {
        return sInstance;
    }

    public static RetrofitApi getRetrofitApi() {
        return sRetrofitApi;
    }

    public static void setRetrofitApi(RetrofitApi retrofitApi) {
        sRetrofitApi = retrofitApi;
    }

}
