package com.macostay.vapp.fragments;

import android.os.Bundle;
import android.widget.TextView;

import com.macostay.vapp.R;

import butterknife.Bind;

/**
 * Created by macostay on 29/04/2016.
 */
public class InfoFragment extends BaseFragment {
    @Bind(R.id.tvTextoInfo)
    TextView mTvTextoInfo;


    public static InfoFragment newInstance() {

        Bundle args = new Bundle();
        InfoFragment fragment = new InfoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initLayout() {
        mLayoutId = R.layout.fragment_info;
    }

    @Override
    protected void fillViews() {
        loadUITexts();
    }

    @Override
    public void loadUITexts() {
        mTvTextoInfo.setText(getResources().getString(R.string.MENU_INFO));
    }
}
