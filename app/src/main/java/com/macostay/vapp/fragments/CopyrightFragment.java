package com.macostay.vapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.macostay.vapp.R;
import com.macostay.vapp.adapters.ListItemAdapter;
import com.macostay.vapp.models.People;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by macostay on 29/04/2016.
 */
public class CopyrightFragment extends BaseFragment {


    @Bind(R.id.gvListaPeople)
    GridView mGvListaPeople;

    public static CopyrightFragment newInstance() {

        Bundle args = new Bundle();
        CopyrightFragment fragment = new CopyrightFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initLayout() {
        mLayoutId = R.layout.fragment_copyright;
    }

    @Override
    protected void fillViews() {
        loadUITexts();
    }

    @Override
    public void loadUITexts() {
        ArrayList<People> peoples = llenarArray();

        ListItemAdapter peopleListItemArray =
                new ListItemAdapter(getActivity().getApplicationContext(), peoples);

        mGvListaPeople.setAdapter(peopleListItemArray);
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
