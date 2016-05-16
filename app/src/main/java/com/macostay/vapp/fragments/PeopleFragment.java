package com.macostay.vapp.fragments;


import android.os.Bundle;
import android.widget.TextView;
import com.macostay.vapp.R;
import butterknife.Bind;

/**
 * Created by macostay on 29/04/2016.
 */
public class PeopleFragment extends BaseFragment {
    @Bind(R.id.tvTextoPeople)
    TextView mTvTextoPeople;


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
        mTvTextoPeople.setText(getResources().getString(R.string.MENU_PEOPLE));
    }

}
