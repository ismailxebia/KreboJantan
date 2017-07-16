package xebia.ismail.krebojantan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import xebia.ismail.krebojantan.adapter.AdapterTrashed;
import xebia.ismail.krebojantan.adapter.ModelTrashed;

/**
 * Created by Admin on 1/11/2017.
 */
public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    private AdapterTrashed adapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_home, container, false);

        final List<ModelTrashed> data = fill_with_data();
        recyclerView = (RecyclerView) v.findViewById(R.id.list_trashed);
        recyclerView.setHasFixedSize(true);
        adapter = new AdapterTrashed(data, getActivity());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return v;
    }

    public List<ModelTrashed> fill_with_data() {

        List<ModelTrashed> data = new ArrayList<>();

        data.add(new ModelTrashed("20.3 Kg","Sun, 17 Feb 2016","35 SP", R.drawable.avab));
        data.add(new ModelTrashed("21.0 Kg","Sun, 10 Feb 2016","30 SP", R.drawable.avab));
        data.add(new ModelTrashed("3.4 Kg","Sun, 8 Feb 2016","10 SP", R.drawable.avab));
        data.add(new ModelTrashed("1.2 Kg","Sun, 1 Jan 2016","5 SP", R.drawable.avab));
        return data;
    }
}
