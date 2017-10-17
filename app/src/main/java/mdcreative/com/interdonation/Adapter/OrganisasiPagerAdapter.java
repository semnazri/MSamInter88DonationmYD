package mdcreative.com.interdonation.Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import mdcreative.com.interdonation.R;

/**
 * Created by Semmy
 * mr.shanky08@gmail.com on 10/15/17.
 *
 * @copyright 2016
 * PT.Bisnis Indonesia Sibertama
 */

public class OrganisasiPagerAdapter extends PagerAdapter {
    int images[];
    String events[];
    String lokasis[];
    LayoutInflater layoutInflater;
    private Context mContext;

    public OrganisasiPagerAdapter(Context context) {
        this.mContext = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {


        return view == ((LinearLayout) object);
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView txtitle, txt_subtitle;
        ImageView tximage;

        layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_vp_organisasi, container, false);




        ((ViewPager) container).addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((LinearLayout) object);

    }
}
