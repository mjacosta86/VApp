package com.macostay.vapp.retrofit;

/**
 * Created by macostay on 05/05/2016.
 */
public class RetrofitListener{

    public interface ResponseListener<T>{
        void onResponse(T response);
    }

    public interface ErrorListener{
        void onErrorResponse(Throwable error);
    }
}
