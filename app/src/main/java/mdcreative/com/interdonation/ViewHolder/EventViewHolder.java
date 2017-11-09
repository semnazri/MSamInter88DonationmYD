package mdcreative.com.interdonation.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import mdcreative.com.interdonation.R;

/**
 * Created by Semmy
 * mr.shanky08@gmail.com on 11/9/17.
 *
 * @copyright 2016
 * PT.Bisnis Indonesia Sibertama
 */

public class EventViewHolder extends RecyclerView.ViewHolder {
    public TextView title;

    public EventViewHolder(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.title_donation);
    }
}
