package com.macostay.vapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.macostay.vapp.R;
import com.macostay.vapp.models.People;

import java.util.ArrayList;

/**
 * Created by macostay on 18/05/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.PeoplesViewHolder> implements View.OnClickListener{

    private View.OnClickListener listener;
    private ArrayList<People> mPeoples;

    public static class PeoplesViewHolder extends RecyclerView.ViewHolder {

        private TextView txtTitulo;
        private TextView txtSubtitulo;

        public PeoplesViewHolder(View itemView) {
            super(itemView);

            txtTitulo = (TextView)itemView.findViewById(R.id.LblTitulo);
            txtSubtitulo = (TextView)itemView.findViewById(R.id.LblSubTitulo);
        }

        public void bindTitular(People p) {
            txtTitulo.setText(p.getNombre());
            txtSubtitulo.setText(p.getFechaNacimiento());
        }
    }

    public RecyclerAdapter(ArrayList<People> peoples){
        this.mPeoples = peoples;
    }

    @Override
    public PeoplesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item, viewGroup, false);

        itemView.setOnClickListener(this);

        PeoplesViewHolder tvh = new PeoplesViewHolder(itemView);

        return tvh;
    }

    @Override
    public void onBindViewHolder(PeoplesViewHolder viewHolder, int pos) {
        People item = mPeoples.get(pos);

        viewHolder.bindTitular(item);
    }

    @Override
    public int getItemCount() {
        return mPeoples.size();
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        if(listener != null)
            listener.onClick(view);
    }


}
