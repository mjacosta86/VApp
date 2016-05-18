package com.macostay.vapp.fragments;


import android.os.Bundle;
import android.widget.ListView;
import com.macostay.vapp.R;
import com.macostay.vapp.adapters.ListItemAdapter;
import com.macostay.vapp.models.People;
import java.util.ArrayList;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by macostay on 29/04/2016.
 */
public class PeopleFragment extends BaseFragment {

    @Bind(R.id.lvListaPeople)
    ListView mLvListaPeople;


    public static PeopleFragment newInstance() {

        Bundle args = new Bundle();
        PeopleFragment fragment = new PeopleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initLayout() {
        mLayoutId = R.layout.fragment_people;
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

        mLvListaPeople.setAdapter(peopleListItemArray);
    }

    public int restarIndice(int i){

        if(i >= 10){
            do{
                i -= 10;
            }while(i > 10);
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
