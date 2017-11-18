package mdcreative.com.interdonation.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import mdcreative.com.interdonation.Activity_detail_donation;
import mdcreative.com.interdonation.Model.EventModel;
import mdcreative.com.interdonation.R;
import mdcreative.com.interdonation.ViewHolder.EventViewHolder;

/**
 * Created by Semmy
 * mr.shanky08@gmail.com on 11/9/17.
 *
 * @copyright 2016
 * PT.Bisnis Indonesia Sibertama
 */

public class Categories_Adapter extends RecyclerView.Adapter<EventViewHolder> {
    private Context mContext;
    private List<EventModel> mValues;

    public Categories_Adapter(Context context, List<EventModel> items) {
        mContext = context;
        mValues = items;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_donation, parent, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, Activity_detail_donation.class);
                mContext.startActivity(i);
            }
        });

        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        String title = mValues.get(position).getTitle();
        holder.title.setText(title);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }
}
