package com.macostay.vapp.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by macostay on 05/05/2016.
 */
public class ServiceGenerator {

    //Aqui se crea la única instancia del objeto Retrofit

    private static Retrofit.Builder createRequest(final String url){

        Retrofit.Builder retrofit = new Retrofit.Builder()
                .baseUrl(url)//Url del servidor que contiene el recurso
                .addConverterFactory(GsonConverterFactory.create());

        return retrofit;
    }

    public static <S> S createService(Class<S> serviceClass, String url) {
        // set endpoint url and use OkHTTP as HTTP client

        Retrofit adapter = createRequest(url).build();

        return adapter.create(serviceClass);
    }

}
