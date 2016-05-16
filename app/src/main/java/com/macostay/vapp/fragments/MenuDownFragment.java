package com.macostay.vapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.krpiotrek.library.BottomNavigation;
import com.macostay.vapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by macostay on 02/05/2016.
 */
public class MenuDownFragment extends BaseFragment {


    @Bind(R.id.flMenuDownContainer)
    FrameLayout mFlMenuDownContainer;
    @Bind(R.id.bottom_navigation)
    BottomNavigation mBottomNavigation;

    public static int MENU_BUG = 0;
    public static int MENU_ANDROID = 1;
    public static int MENU_INFO = 2;

    public static MenuDownFragment newInstance() {

        Bundle args = new Bundle();
        MenuDownFragment fragment = new MenuDownFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected void initLayout() {
        mLayoutId = R.layout.fragment_menu_down;
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
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        Fragment newFragment = ContainerFragment.newInstance();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.flMenuDownContainer, newFragment);
        //añadimos la transicion a la pila
        //ft.addToBackStack(null);
        ft.commit();

        if (mBottomNavigation != null) {
            mBottomNavigation.setOnItemSelectedListener(new BottomNavigation.OnItemSelectedListener() {
                @Override
                public void itemSelected(int id) {
                    // Handle screen change
                    switch (id) {
                        case 0:
                            Toast.makeText(getActivity().getApplicationContext(),
                                    R.string.MENU_BUG,
                                    Toast.LENGTH_SHORT).show();

                            Fragment bugFragment = BugFragment.newInstance();
                            FragmentTransaction ft = getFragmentManager().beginTransaction();
                            ft.replace(R.id.flMenuDownContainer, bugFragment);
                            ft.commit();

                            break;
                        case 1:
                            Toast.makeText(getActivity().getApplicationContext(),
                                    R.string.MENU_ANDROID,
                                    Toast.LENGTH_SHORT).show();

                            Fragment androidFragment = AndroidFragment.newInstance();
                            FragmentTransaction ft2 = getFragmentManager().beginTransaction();
                            ft2.replace(R.id.flMenuDownContainer, androidFragment);
                            ft2.commit();

                            break;
                        case 2:
                            Toast.makeText(getActivity().getApplicationContext(),
                                    R.string.MENU_INFO,
                                    Toast.LENGTH_SHORT).show();

                            Fragment infoFragment = InfoFragment.newInstance();
                            FragmentTransaction ft3 = getFragmentManager().beginTransaction();
                            ft3.replace(R.id.flMenuDownContainer, infoFragment);
                            ft3.commit();

                            break;
                    }
                }
            });
        }

        mBottomNavigation.builder()
                .items(
                        new BottomNavigation.NavigationItem(MENU_BUG,
                                getResources().getDrawable(R.drawable.ic_bug_report_white_24dp),
                                getResources().getString(R.string.MENU_BUG),
                                getResources().getColor(R.color.MENU_BUG)),
                        new BottomNavigation.NavigationItem(MENU_ANDROID,
                                getResources().getDrawable(R.drawable.ic_android_white_24dp),
                                getResources().getString(R.string.MENU_ANDROID),
                                getResources().getColor(R.color.MENU_ANDROID)),
                        new BottomNavigation.NavigationItem(MENU_INFO,
                                getResources().getDrawable(R.drawable.ic_info_white_24dp),
                                getResources().getString(R.string.MENU_INFO),
                                getResources().getColor(R.color.MENU_INFO)))
                .withColorChanges(true)
                .hideOnScroll(true)
                .startingPosition(0)
                .build();


        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
