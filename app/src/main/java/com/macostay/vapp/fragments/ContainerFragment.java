package com.macostay.vapp.fragments;

import android.os.Bundle;
import android.widget.TextView;

import com.macostay.vapp.R;

import butterknife.Bind;

/**
 * Created by macostay on 03/05/2016.
 */
public class ContainerFragment extends BaseFragment {

    @Bind(R.id.tvTextoContainer)
    TextView mTvTextoContainer;

    public static ContainerFragment newInstance() {

        Bundle args = new Bundle();
        ContainerFragment fragment = new ContainerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initLayout() {
        mLayoutId = R.layout.fragment_container;
    }

    @Override
    protected void fillViews() {
        loadUITexts();
    }

    @Override
    public void loadUITexts() {}

}
