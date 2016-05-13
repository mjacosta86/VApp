package com.macostay.vapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.macostay.vapp.R;
import com.socks.library.KLog;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by macostay on 02/05/2016.
 */
public class BaseFragment extends Fragment {
    private static String mClassName;
    protected String mIdString;
    protected int mLayoutId;

    public BaseFragment() {
        // Lots of things need an empty constructor, e.g. the OperativeController.
        Class fragmentClass = ((Object) this).getClass();
        mIdString = fragmentClass.getName();
        mClassName = fragmentClass.getSimpleName();
    }

    public static BaseFragment newInstance() {

        Log.i(mClassName, "Method newInstance");
        Bundle args = new Bundle();
        BaseFragment fragment = new BaseFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        initLayout();
        View rootView = inflater.inflate(mLayoutId, container, false);
        ButterKnife.bind(this, rootView);
        fillViews();
        KLog.i(mClassName, "Method onCreateView");
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        KLog.i(mClassName, "Method onViewCreated");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        KLog.i(mClassName, "Method onAttach");
    }

    @Override
    public void onStart() {
        super.onStart();
        KLog.i(mClassName, "Method onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        KLog.i(mClassName, "Method onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        KLog.w(mClassName, "Method onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        KLog.w(mClassName, "Method onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        KLog.w(mClassName, "Method onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        KLog.w(mClassName, "Method onDestroyView");
        ButterKnife.unbind(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        KLog.w(mClassName, "Method onDetach");
    }

    protected void initLayout() {

    }

    protected void fillViews() {

    }

    public void loadUITexts() {

    }
}
