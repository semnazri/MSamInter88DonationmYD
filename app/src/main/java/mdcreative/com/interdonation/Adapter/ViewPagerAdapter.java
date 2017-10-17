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
 * mr.shanky08@gmail.com on 10/14/17.
 *
 * @copyright 2016
 * PT.Bisnis Indonesia Sibertama
 */

public class ViewPagerAdapter extends PagerAdapter {
    int images[];
    String events[];
    String lokasis[];
    LayoutInflater layoutInflater;
    private Context mContext;


    public ViewPagerAdapter(Context context, int[] image, String[] headline, String[] lokasi) {
        this.mContext = context;
        this.events = headline;
        this.images = image;
        this.lokasis = lokasi;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return images.length;
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
        View view = layoutInflater.inflate(R.layout.item_vp_new, container, false);

        ImageView image = (ImageView) view.findViewById(R.id.imageVP);
        TextView event = (TextView) view.findViewById(R.id.img_title);
        TextView lokasi = (TextView) view.findViewById(R.id.img_subtitle);

        image.setImageResource(images[position]);
        event.setText(events[position]);
        lokasi.setText(lokasis[position]);


        ((ViewPager) container).addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((LinearLayout) object);

    }
}
