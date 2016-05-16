package com.macostay.vapp.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.macostay.vapp.R;
import com.macostay.vapp.VAppApplication;
import com.macostay.vapp.dialogs.DialogoConfirmacion;
import com.macostay.vapp.fragments.CopyrightFragment;
import com.macostay.vapp.fragments.MenuDownFragment;
import com.macostay.vapp.fragments.PeopleFragment;
import com.macostay.vapp.fragments.TabsFragment;
import com.macostay.vapp.fragments.ToolsFragment;
import com.macostay.vapp.models.Actions;
import com.macostay.vapp.models.Agenda;
import com.macostay.vapp.models.Cliente;
import com.macostay.vapp.models.ContactData;
import com.macostay.vapp.models.Events;
import com.macostay.vapp.models.News;
import com.macostay.vapp.models.Questions;
import com.macostay.vapp.retrofit.RetrofitListener;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.flMainContainer)
    FrameLayout mFlMainContainer;
    @Bind(R.id.nav_view)
    NavigationView mNavView;
    @Bind(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawerLayout, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        mNavView.setNavigationItemSelectedListener(this);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.flMainContainer, MenuDownFragment.newInstance())
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                .commit();

//        Clientes();
//        Events();
//        Actions();
//        Agenda();
//        ContactData();
//        Gaming();
//        News();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.tools) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flMainContainer, ToolsFragment.newInstance())
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                    .commit();
        } else if (id == R.id.people) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flMainContainer, PeopleFragment.newInstance())
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                    .commit();
        } else if (id == R.id.copyright) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flMainContainer, CopyrightFragment.newInstance())
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                    .commit();
        } else if (id == R.id.menu_down) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flMainContainer, MenuDownFragment.newInstance())
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                    .commit();
        }else if (id == R.id.menu_tabs) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.flMainContainer, EventFragment.newInstance())
//                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
//                    .commit();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flMainContainer, TabsFragment.newInstance())
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                    .commit();
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            DialogoConfirmacion dialogo = new DialogoConfirmacion();
            dialogo.show(fragmentManager, "tagAlerta");

            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void Clientes(){
        VAppApplication.getRetrofitApi().getClientes(new RetrofitListener.ResponseListener<Response<List<Cliente>>>() {
            @Override
            public void onResponse(Response<List<Cliente>> response) {
                // Recogemos la informacion del servicio
                Toast.makeText(getApplicationContext(),response.body().toString(), Toast.LENGTH_LONG).show();
            }
        }, new RetrofitListener.ErrorListener(){
            @Override
            public void onErrorResponse(Throwable error) {
                //Recogemos el error
                Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void Events(){
        VAppApplication.getRetrofitApi().getEvents(new RetrofitListener.ResponseListener<Response<Events>>() {
            @Override
            public void onResponse(Response<Events> response) {
                // Recogemos la informacion del servicio
                Toast.makeText(getApplicationContext(),response.body().toString(), Toast.LENGTH_LONG).show();
            }
        }, new RetrofitListener.ErrorListener(){
            @Override
            public void onErrorResponse(Throwable error) {
                //Recogemos el error
                Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void Actions(){
        VAppApplication.getRetrofitApi().getActions(new RetrofitListener.ResponseListener<Response<Actions>>() {
            @Override
            public void onResponse(Response<Actions> response) {
                // Recogemos la informacion del servicio
                Toast.makeText(getApplicationContext(),response.body().toString(), Toast.LENGTH_LONG).show();
            }
        }, new RetrofitListener.ErrorListener(){
            @Override
            public void onErrorResponse(Throwable error) {
                //Recogemos el error
                Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void Agenda(){
        VAppApplication.getRetrofitApi().getAgenda(new RetrofitListener.ResponseListener<Response<Agenda>>() {
            @Override
            public void onResponse(Response<Agenda> response) {
                // Recogemos la informacion del servicio
                Toast.makeText(getApplicationContext(),response.body().toString(), Toast.LENGTH_LONG).show();
            }
        }, new RetrofitListener.ErrorListener(){
            @Override
            public void onErrorResponse(Throwable error) {
                //Recogemos el error
                Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void ContactData(){
        VAppApplication.getRetrofitApi().getContactData(new RetrofitListener.ResponseListener<Response<ContactData>>() {
            @Override
            public void onResponse(Response<ContactData> response) {
                // Recogemos la informacion del servicio
                Toast.makeText(getApplicationContext(),response.body().toString(), Toast.LENGTH_LONG).show();
            }
        }, new RetrofitListener.ErrorListener(){
            @Override
            public void onErrorResponse(Throwable error) {
                //Recogemos el error
                Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void Gaming(){
        VAppApplication.getRetrofitApi().getGaming(new RetrofitListener.ResponseListener<Response<Questions>>() {
            @Override
            public void onResponse(Response<Questions> response) {
                // Recogemos la informacion del servicio
                Toast.makeText(getApplicationContext(),response.body().toString(), Toast.LENGTH_LONG).show();
            }
        }, new RetrofitListener.ErrorListener(){
            @Override
            public void onErrorResponse(Throwable error) {
                //Recogemos el error
                Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void News(){
        VAppApplication.getRetrofitApi().getNews(new RetrofitListener.ResponseListener<Response<News>>() {
            @Override
            public void onResponse(Response<News> response) {
                // Recogemos la informacion del servicio
                Toast.makeText(getApplicationContext(),response.body().toString(), Toast.LENGTH_LONG).show();
            }
        }, new RetrofitListener.ErrorListener(){
            @Override
            public void onErrorResponse(Throwable error) {
                //Recogemos el error
                Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

}
