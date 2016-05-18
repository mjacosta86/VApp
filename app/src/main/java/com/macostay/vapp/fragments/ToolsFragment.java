package com.macostay.vapp.fragments;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.macostay.vapp.R;
import com.macostay.vapp.adapters.DividerItemDecoration;
import com.macostay.vapp.adapters.ListItemAdapter;
import com.macostay.vapp.adapters.RecyclerAdapter;
import com.macostay.vapp.models.People;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by macostay on 29/04/2016.
 */
public class ToolsFragment extends BaseFragment {

    @Bind(R.id.rvListaPeople)
    RecyclerView mRvListaPeople;

    public static ToolsFragment newInstance() {

        Bundle args = new Bundle();
        ToolsFragment fragment = new ToolsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initLayout() {
        mLayoutId = R.layout.fragment_tools;
    }

    @Override
    protected void fillViews() {
        loadUITexts();
    }

    @Override
    public void loadUITexts() {
        ArrayList<People> peoples = llenarArray();

        mRvListaPeople.setHasFixedSize(true);

        final RecyclerAdapter adapter = new RecyclerAdapter(peoples);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("DemoRecView", "Pulsado el elemento " + mRvListaPeople.getChildItemId(v));
                //Toast.makeText(getActivity().getApplicationContext(),"weo", Toast.LENGTH_LONG).show();
            }
        });

        mRvListaPeople.setAdapter(adapter);

        mRvListaPeople.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext(),LinearLayoutManager.VERTICAL,false));

        mRvListaPeople.addItemDecoration(new DividerItemDecoration(getActivity().getApplicationContext(),DividerItemDecoration.VERTICAL_LIST));

        mRvListaPeople.setItemAnimator(new DefaultItemAnimator());

    }
    public int restarIndice(int i){

        if(i >= 10){
            do{
                i -= 10;
            }while(i >= 10);
        }
        return i;
    }

    public ArrayList<People> llenarArray(){

        ArrayList<People> peopleArrayList = new ArrayList<>();

        for (int i = 0; i < 40; ++i) {

            int anno = restarIndice(i);

            People p = new People(i + 1,        //id
                    "00000000" + i + "-A",      //dni
                    "Nombre" + i,               //nombre
                    "Apellidos" + i,            //apellidos
                    "01-01-200" + anno,         //fecha de nacimiento
                    i + 1,                      //edad
                    "Cadiz");                   //lugar de nacimiento

            peopleArrayList.add(p);
        }
        return peopleArrayList;
    }
}
