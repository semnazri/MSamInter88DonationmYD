package mdcreative.com.interdonation.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import mdcreative.com.interdonation.R;

/**
 * Created by Semmy on 10/21/2017.
 */

public class Top6ViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;

    public Top6ViewHolder(View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.top6_image);
    }
}
