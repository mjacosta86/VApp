package com.macostay.vapp.fragments;

import android.os.Bundle;
import android.widget.TextView;
import com.macostay.vapp.R;
import butterknife.Bind;

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
