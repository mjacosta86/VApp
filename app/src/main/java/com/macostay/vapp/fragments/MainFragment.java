package com.macostay.vapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
public class MainFragment extends Fragment {
    private static final String TAG = "MainFragment";
    @Bind(R.id.tvTexto)
    TextView mTvTexto;


    public static MainFragment newInstance() {

        KLog.i(TAG, "Method newInstance");
        Bundle args = new Bundle();
        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, rootView);
        KLog.i(TAG, "Method onCreateView");

        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        KLog.i(TAG, "Method onViewCreated");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        KLog.i(TAG, "Method onAttach");
    }

    @Override
    public void onStart() {
        super.onStart();
        KLog.i(TAG, "Method onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        KLog.i(TAG, "Method onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        KLog.i(TAG, "Method onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        KLog.i(TAG, "Method onStop");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        KLog.i(TAG, "Method onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        KLog.i(TAG, "Method onDestroyView");
        ButterKnife.unbind(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        KLog.i(TAG, "Method onDetach");

    }
}
