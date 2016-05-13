package com.macostay.vapp.retrofit;

/**
 * Created by macostay on 05/05/2016.
 */
public class RetrofitListener{

    public interface ResponseListener<T>{
        public void onResponse(T response);
    }

    public interface ErrorListener{
        public void onErrorResponse(Throwable error);
    }
}
