package com.macostay.vapp.retrofit;


import com.macostay.vapp.models.Actions;
import com.macostay.vapp.models.Agenda;
import com.macostay.vapp.models.Cliente;
import com.macostay.vapp.models.ContactData;
import com.macostay.vapp.models.Events;
import com.macostay.vapp.models.News;
import com.macostay.vapp.models.Questions;
import com.macostay.vapp.models.Usuario;
import com.macostay.vapp.models.Usuarios;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by macostay on 04/05/2016.
 */
public interface RetrofitInterface {

    //Aqui irían todos los callbacks para cada una de las peticiones

    @GET(RetrofitApi.CLIENTES)//Lista de clientes
    Call<List<Cliente>> getClientes();

    //Lista de usuarios
    @GET(RetrofitApi.USUARIOS)
    Call<List<Usuario>> getUsuarios();

    //Insertar un nuevo usuario
    @POST(RetrofitApi.ADD_USUARIO)
    Call<Usuario> setUsuario(@Body Usuario usuario);

    @GET(RetrofitApi.EVENTS)//Eventos
    Call<Events> getEvents();

    @GET(RetrofitApi.ACTIONS)//Actions
    Call<Actions> getActions();

    @GET(RetrofitApi.AGENDA)//AgendaItem
    Call<Agenda> getAgenda();

    @GET(RetrofitApi.CONTACT_DATA)//Contact Data
    Call<ContactData> getContactData();

    @GET(RetrofitApi.GAMING)//Gaming
    Call<Questions> getGaming();

    @GET(RetrofitApi.NEWS)//Noticias
    Call<News> getNews();
}
