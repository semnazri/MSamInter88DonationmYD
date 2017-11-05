package mdcreative.com.interdonation.Fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mdcreative.com.interdonation.R;

/**
 * Created by Semmy
 * mr.shanky08@gmail.com on 11/6/17.
 *
 * @copyright 2016
 * PT.Bisnis Indonesia Sibertama
 */

public class Fragment_Categories extends Fragment {

    public static int int_items = 6;
    private View view;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_categories_, container, false);
        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        viewPager = (ViewPager) view.findViewById(R.id.photos_viewpager);
//        img_back = (ImageView) view.findViewById(R.id.)
        viewPager.setAdapter(new Adapter(getChildFragmentManager()));
        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
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
                    return new Fragment_categories_view();
                case 1:
                    return new Fragment_categories_view();
                case 2:
                    return new Fragment_categories_view();
                case 3:
                    return new Fragment_categories_view();
                case 4:
                    return new Fragment_categories_view();
                case 5:
                    return new Fragment_categories_view();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return int_items;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "Bencana Alam";
                case 1:
                    return "Aksi Sosial";
                case 2:
                    return "Orangtua Asuh";
                case 3:
                    return "Dhuafa";
                case 4:
                    return "Budaya";
                case 5:
                    return "Agama";

            }
            return null;
        }
    }
}
