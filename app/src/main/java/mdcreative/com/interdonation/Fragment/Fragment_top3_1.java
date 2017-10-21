package mdcreative.com.interdonation.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import mdcreative.com.interdonation.Adapter.Adapter_top6;
import mdcreative.com.interdonation.Model.Top6;
import mdcreative.com.interdonation.R;

/**
 * Created by Semmy on 10/21/2017.
 */

public class Fragment_top3_1 extends Fragment {

    private View view;
    private RecyclerView rv;
    private GridLayoutManager glm;
    private List<Top6> list_top6;
    private Adapter_top6 adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_top6, container,false);
        rv= (RecyclerView) view.findViewById(R.id.rv_edisi);

        list_top6 = getData();
        rv.setHasFixedSize(true);
        glm = new GridLayoutManager(getActivity().getApplication().getApplicationContext(),3);
        rv.setLayoutManager(glm);
        adapter = new Adapter_top6(getActivity(),list_top6);
        rv.setAdapter(adapter);

        return view;
    }

    private List<Top6> getData() {
        List<Top6> tp = new ArrayList<>();
        tp.add(new Top6(R.drawable.pmi));
        tp.add(new Top6(R.drawable.baznas));
        tp.add(new Top6(R.drawable.rumah_zakat));

        return tp;
    }
}
