package com.macostay.vapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.macostay.vapp.R;
import com.macostay.vapp.adapters.TabsPagerAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by macostay on 13/05/2016.
 */
public class TabsFragment extends BaseFragment {


    @Bind(R.id.tlTabs)
    TabLayout mTabs;
    @Bind(R.id.vpContainer)
    ViewPager mContainer;

    private TabsPagerAdapter mSectionsPagerAdapter;

    public static TabsFragment newInstance() {

        Bundle args = new Bundle();
        TabsFragment fragment = new TabsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initLayout() {
        mLayoutId = R.layout.fragment_tabs;
    }

    @Override
    protected void fillViews() {
        loadUITexts();
    }

    @Override
    public void loadUITexts() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = inflater.inflate(R.layout.fragment_tabs, container, false);

        mSectionsPagerAdapter = new TabsPagerAdapter(getActivity().getSupportFragmentManager());

        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mContainer.setAdapter(mSectionsPagerAdapter);
        mTabs.setupWithViewPager(mContainer);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
