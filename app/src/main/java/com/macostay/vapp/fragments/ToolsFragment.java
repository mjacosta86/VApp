package com.macostay.vapp.fragments;

import android.os.Bundle;
import android.widget.TextView;

import com.macostay.vapp.R;

import butterknife.Bind;

/**
 * Created by macostay on 29/04/2016.
 */
public class ToolsFragment extends BaseFragment {
    @Bind(R.id.tvTextoTools)
    TextView mTvTextoTools;


    public static ToolsFragment newInstance() {

        Bundle args = new Bundle();
        ToolsFragment fragment = new ToolsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initLayout() {
        mLayoutId = R.layout.fragment_tools;
    }

    @Override
    protected void fillViews() {
        loadUITexts();
    }

    @Override
    public void loadUITexts() {
        mTvTextoTools.setText(getResources().getString(R.string.MENU_TOOLS));
    }


}
