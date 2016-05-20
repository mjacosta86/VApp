package com.macostay.vapp.retrofit;

import com.macostay.vapp.models.Actions;
import com.macostay.vapp.models.Agenda;
import com.macostay.vapp.models.Cliente;
import com.macostay.vapp.models.ContactData;
import com.macostay.vapp.models.Events;
import com.macostay.vapp.models.News;
import com.macostay.vapp.models.Questions;
import com.macostay.vapp.models.Usuario;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by macostay on 05/05/2016.
 */
public class RetrofitApi {

    //La URL del endpoint
    public static final String ENDPOINT = "http://servicio-monkydevs.rhcloud.com";
    public static final String ENDPOINT_TEST = "http://54.197.255.238";
    public static final String ENDPOINT_HOSTINGER = "http://mjacosta86.esy.es";

    //La URL de los recursos
    public static final String CLIENTES = "/clientes";
    public static final String EVENTS = "/mocks/Mediolanum/json/getEvents.json";
    public static final String ACTIONS = "/mocks/Mediolanum/json/getActions.json";
    public static final String AGENDA = "/mocks/Mediolanum/json/getAgenda.json";
    public static final String CONTACT_DATA = "/mocks/Mediolanum/json/getContactData.json";
    public static final String GAMING = "/mocks/Mediolanum/json/getGaming.json";
    public static final String NEWS = "/mocks/Mediolanum/json/getNews.json";
    public static final String USUARIOS = "/CursoAndroid/select.php";
    public static final String ADD_USUARIO = "/CursoAndroid/insert.php";

    private RetrofitInterface service;

    public RetrofitApi(){
//        service = ServiceGenerator.createService(RetrofitInterface.class, ENDPOINT);
//        service = ServiceGenerator.createService(RetrofitInterface.class, ENDPOINT_TEST);
        service = ServiceGenerator.createService(RetrofitInterface.class, ENDPOINT_HOSTINGER);
    }


    public void getClientes(final RetrofitListener.ResponseListener responseListener,
                            final RetrofitListener.ErrorListener error){

        Call<List<Cliente>> call = service.getClientes();
        call.enqueue(new Callback<List<Cliente>>() {
            @Override
            public void onResponse(Call<List<Cliente>> call, Response<List<Cliente>> response) {
                responseListener.onResponse(response);
            }

            @Override
            public void onFailure(Call<List<Cliente>> call, Throwable t) {
                error.onErrorResponse(t);
            }
        });
    }

    public void getUsuarios(final RetrofitListener.ResponseListener responseListener,
                            final RetrofitListener.ErrorListener error){

        Call<List<Usuario>> call = service.getUsuarios();
        call.enqueue(new Callback<List<Usuario>>() {
            @Override
            public void onResponse(Call<List<Usuario>> call, Response<List<Usuario>> response) {
                responseListener.onResponse(response);
            }

            @Override
            public void onFailure(Call<List<Usuario>> call, Throwable t) {
                error.onErrorResponse(t);
            }
        });

    }


    public void insertarUsuario(final RetrofitListener.ResponseListener responseListener,
                                final RetrofitListener.ErrorListener error,
                                Usuario newUsuario){

        Call<Usuario> call = service.insertarUsuario(newUsuario.getNombre(), newUsuario.getTelefono());

        call.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                responseListener.onResponse(response);
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                error.onErrorResponse(t);
            }
        });
    }

//    public void setUsuario(final RetrofitListener.ResponseListener responseListener,
//                           final RetrofitListener.ErrorListener error,
//                           Usuario usuario){
//
//        Call<Usuario> call = service.setUsuario(usuario);
//        call.enqueue(new Callback<Usuario>() {
//            @Override
//            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
//                responseListener.onResponse(response);
//            }
//
//            @Override
//            public void onFailure(Call<Usuario> call, Throwable t) {
//                error.onErrorResponse(t);
//            }
//        });
//    }

    public void getEvents(final RetrofitListener.ResponseListener responseListener,
                          final RetrofitListener.ErrorListener error){

        Call<Events> call = service.getEvents();
        call.enqueue(new Callback<Events>() {
            @Override
            public void onResponse(Call<Events> call, Response<Events> response) {
                responseListener.onResponse(response);
            }

            @Override
            public void onFailure(Call<Events> call, Throwable t) {
                error.onErrorResponse(t);
            }
        });
    }

    public void getActions(final RetrofitListener.ResponseListener responseListener,
                           final RetrofitListener.ErrorListener error){

        Call<Actions> call = service.getActions();
        call.enqueue(new Callback<Actions>() {
            @Override
            public void onResponse(Call<Actions> call, Response<Actions> response) {
                responseListener.onResponse(response);
            }

            @Override
            public void onFailure(Call<Actions> call, Throwable t) {
                error.onErrorResponse(t);
            }
        });
    }

    public void getAgenda(final RetrofitListener.ResponseListener responseListener,
                          final RetrofitListener.ErrorListener error){

        Call<Agenda> call = service.getAgenda();
        call.enqueue(new Callback<Agenda>() {
            @Override
            public void onResponse(Call<Agenda> call, Response<Agenda> response) {
                responseListener.onResponse(response);
            }

            @Override
            public void onFailure(Call<Agenda> call, Throwable t) {
                error.onErrorResponse(t);
            }
        });
    }

    public void getContactData(final RetrofitListener.ResponseListener responseListener,
                               final RetrofitListener.ErrorListener error){

        Call<ContactData> call = service.getContactData();
        call.enqueue(new Callback<ContactData>() {
            @Override
            public void onResponse(Call<ContactData> call, Response<ContactData> response) {
                responseListener.onResponse(response);
            }

            @Override
            public void onFailure(Call<ContactData> call, Throwable t) {
                error.onErrorResponse(t);
            }
        });
    }

    public void getGaming(final RetrofitListener.ResponseListener responseListener,
                          final RetrofitListener.ErrorListener error){

        Call<Questions> call = service.getGaming();
        call.enqueue(new Callback<Questions>() {
            @Override
            public void onResponse(Call<Questions> call, Response<Questions> response) {
                responseListener.onResponse(response);
            }

            @Override
            public void onFailure(Call<Questions> call, Throwable t) {
                error.onErrorResponse(t);
            }
        });
    }

    public void getNews(final RetrofitListener.ResponseListener responseListener,
                        final RetrofitListener.ErrorListener error){

        Call<News> call = service.getNews();
        call.enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                responseListener.onResponse(response);
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {
                error.onErrorResponse(t);
            }
        });
    }


}
