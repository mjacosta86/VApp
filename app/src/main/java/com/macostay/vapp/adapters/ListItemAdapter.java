package com.macostay.vapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.macostay.vapp.R;
import com.macostay.vapp.models.Person;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by macostay on 18/05/2016.
 */

public class ListItemAdapter extends ArrayAdapter<Person> {

    ArrayList<Person> mPeoples;

    public ListItemAdapter(Context context, ArrayList<Person> peoples) {
        super(context, R.layout.list_item, peoples);
        mPeoples = peoples;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View item = convertView;
        ViewHolder holder;

        if (item == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            item = inflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder(item);
            item.setTag(holder);
        }
        else{
            holder = (ViewHolder)item.getTag();
        }

        holder.mLblTitulo.setText(mPeoples.get(position).getNombre());
        holder.mLblSubTitulo.setText(mPeoples.get(position).getFechaNacimiento());

        return (item);
    }

    class ViewHolder {
        @Bind(R.id.LblTitulo)
        TextView mLblTitulo;
        @Bind(R.id.LblSubTitulo)
        TextView mLblSubTitulo;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
