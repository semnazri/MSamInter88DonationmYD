package mdcreative.com.interdonation.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import mdcreative.com.interdonation.Adapter.Categories_Adapter;
import mdcreative.com.interdonation.Model.EventModel;
import mdcreative.com.interdonation.R;

/**
 * Created by Semmy
 * mr.shanky08@gmail.com on 11/6/17.
 *
 * @copyright 2016
 * PT.Bisnis Indonesia Sibertama
 */

public class Fragment_categories_view extends Fragment {

    private View view;
    private List<EventModel> eventModels;
    private RecyclerView rv;
    private LinearLayoutManager lm;
    private Categories_Adapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.categories_view, container, false);
        rv = (RecyclerView) view.findViewById(R.id.rv_categories);

        eventModels = getEvent();
        rv.setHasFixedSize(true);
        lm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(lm);
        adapter = new Categories_Adapter(getActivity(), eventModels);
        rv.setAdapter(adapter);

        return view;
    }

    private List<EventModel> getEvent() {

        List<EventModel> tp = new ArrayList<>();
        tp.add(new EventModel("Layanan Air Bersih Untuk NTT"));
        tp.add(new EventModel("Layanan Air Bersih Untuk NTT"));
        tp.add(new EventModel("Layanan Air Bersih Untuk NTT"));
        tp.add(new EventModel("Layanan Air Bersih Untuk NTT"));
        tp.add(new EventModel("Layanan Air Bersih Untuk NTT"));
        tp.add(new EventModel("Layanan Air Bersih Untuk NTT"));
        return tp;
    }
}
