package mdcreative.com.interdonation;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import mdcreative.com.interdonation.Fragment.Fragment_Categories;
import mdcreative.com.interdonation.Fragment.Fragment_categories_view;

/**
 * Created by Semmy
 * mr.shanky08@gmail.com on 11/6/17.
 *
 * @copyright 2016
 * PT.Bisnis Indonesia Sibertama
 */

public class ActivityCategories extends AppCompatActivity {

    private ImageView img_back, img_magnifier, img_dot;
    public static int int_items = 6;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.container_categories, new Fragment_Categories());
//        fragmentTransaction.commit();

        img_back = (ImageView) findViewById(R.id.img_back);
        img_magnifier = (ImageView) findViewById(R.id.img_magnifier);
        img_dot = (ImageView) findViewById(R.id.img_dot);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        img_magnifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast();
            }
        });

        img_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast();
            }
        });

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.photos_viewpager);
//        img_back = (ImageView) view.findViewById(R.id.)
        viewPager.setAdapter(new Adapter(getSupportFragmentManager()));
        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });
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


    private void toast() {
        Toast.makeText(this, "Tada", Toast.LENGTH_SHORT).show();
    }


}
