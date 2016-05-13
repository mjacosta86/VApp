package com.macostay.vapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.macostay.vapp.R;
import com.socks.library.KLog;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by macostay on 29/04/2016.
 */
public class CopyrightFragment extends BaseFragment {
    @Bind(R.id.tvTextoCopyright)
    TextView mTvTextoCopyright;


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
        mTvTextoCopyright.setText(getResources().getString(R.string.MENU_COPYRIGHT));
    }
}
