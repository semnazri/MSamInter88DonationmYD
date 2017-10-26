package mdcreative.com.interdonation.Fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import mdcreative.com.interdonation.Adapter.OrganisasiPagerAdapter;
import mdcreative.com.interdonation.Adapter.ViewPagerAdapter;
import mdcreative.com.interdonation.MainActivity;
import mdcreative.com.interdonation.R;

import static mdcreative.com.interdonation.MainActivity.mDrawerLayout;

/**
 * Created by Semmy
 * mr.shanky08@gmail.com on 10/14/17.
 *
 * @copyright 2016
 * PT.Bisnis Indonesia Sibertama
 */

public class Fragment_Home extends Fragment {

    private View view;
    Toolbar mToolbar;
    private ViewPager pager,pager_organisasi;
    private int[] image  = {R.drawable.image_home,R.drawable.image_home,R.drawable.image_home};
    private String[] headline = {"Donasi Gn. Sinabung 1","Donasi Gn. Sinabung 2","Donasi Gn. Sinabung 1"};
    private String[] lokasi = {"Sumatra Utara, Indonesia 1","Sumatra Utara, Indonesia 2", "Sumatra Utara, Indonesia 3"};
    private ViewPagerAdapter adapter;
    public static TabLayout tabLayout;
    private OrganisasiPagerAdapter adapter_organisasi;
    public static int int_items = 2;
    private LinearLayout ll;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
        mToolbar.setTitle("");
        ((AppCompatActivity) getActivity()).setSupportActionBar(mToolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        MainActivity.toggle = new ActionBarDrawerToggle(
                getActivity(), mDrawerLayout, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        MainActivity.toggle.syncState();
        MainActivity.toggle.setDrawerIndicatorEnabled(false);
        MainActivity.toggle.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
        MainActivity.toggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
                    mDrawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    mDrawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });
        pager = (ViewPager) view.findViewById(R.id.photos_viewpager);
        pager_organisasi = (ViewPager) view.findViewById(R.id.organisasi_viewpager);
        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
//        tabLayout.setupWithViewPager(pager, true);

        TabLayout tabl_organisasi = (TabLayout) view.findViewById(R.id.oraganisasi_tab_layout);
        tabl_organisasi.setupWithViewPager(pager_organisasi,true);

        adapter = new ViewPagerAdapter(getActivity(),image, headline, lokasi);
        pager.setAdapter(adapter);

        pager_organisasi.setAdapter(new Adapter(getChildFragmentManager()));
        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(pager, true);            }
        });

        ll = (LinearLayout) view.findViewById(R.id.linear_bencana_alam);
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }

    static class Adapter extends FragmentPagerAdapter {

        public Adapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Fragment_top3_1();
                case 1:
                    return new Fragment_top3_1();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return int_items;
        }
    }
}
