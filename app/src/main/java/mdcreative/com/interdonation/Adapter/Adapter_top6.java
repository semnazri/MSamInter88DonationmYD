package mdcreative.com.interdonation.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import mdcreative.com.interdonation.Model.Top6;
import mdcreative.com.interdonation.R;
import mdcreative.com.interdonation.ViewHolder.Top6ViewHolder;

/**
 * Created by Semmy on 10/21/2017.
 */

public class Adapter_top6 extends RecyclerView.Adapter<Top6ViewHolder> {
    private Context mContext;
    private List<Top6 > mValues;

    public Adapter_top6(Context context, List<Top6> items) {
        mContext = context;
        mValues = items;
    }

    @Override
    public Top6ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_top6, parent, false);

        return new Top6ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(Top6ViewHolder holder, int position) {
        Glide.with(mContext).load(mValues.get(position).getDummy_image()).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }
}
