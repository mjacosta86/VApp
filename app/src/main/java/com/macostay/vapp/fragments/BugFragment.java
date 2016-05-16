package com.macostay.vapp.fragments;

import android.os.Bundle;
import android.widget.TextView;
import com.macostay.vapp.R;
import butterknife.Bind;

/**
 * Created by macostay on 29/04/2016.
 */
public class BugFragment extends BaseFragment {
    @Bind(R.id.tvTextoBug)
    TextView mTvTextoBug;


    public static BugFragment newInstance() {

        Bundle args = new Bundle();
        BugFragment fragment = new BugFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initLayout() {
        mLayoutId = R.layout.fragment_bug;
    }

    @Override
    protected void fillViews() {
        loadUITexts();
    }

    @Override
    public void loadUITexts() {
        mTvTextoBug.setText(getResources().getString(R.string.MENU_BUG));
    }
}
