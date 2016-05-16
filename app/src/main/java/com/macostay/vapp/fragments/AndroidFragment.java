package com.macostay.vapp.fragments;

import android.os.Bundle;
import android.widget.TextView;
import com.macostay.vapp.R;
import butterknife.Bind;

/**
 * Created by macostay on 29/04/2016.
 */
public class AndroidFragment extends BaseFragment {
    @Bind(R.id.tvTextoAndroid)
    TextView mTvTextoAndroid;


    public static AndroidFragment newInstance() {

        Bundle args = new Bundle();
        AndroidFragment fragment = new AndroidFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initLayout() {
        mLayoutId = R.layout.fragment_android;
    }

    @Override
    protected void fillViews() {
        loadUITexts();
    }

    @Override
    public void loadUITexts() {
        mTvTextoAndroid.setText(getResources().getString(R.string.MENU_ANDROID));
    }
}
