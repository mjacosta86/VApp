package com.macostay.vapp.fragments;

import android.os.Bundle;
import com.macostay.vapp.R;

/**
 * Created by macostay on 03/05/2016.
 */
public class ContainerFragment extends BaseFragment {

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
