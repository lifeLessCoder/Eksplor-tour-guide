package com.livelyc0der.eksplor.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.livelyc0der.eksplor.R;
import com.livelyc0der.eksplor.adapters.PlaceAdapter;
import com.livelyc0der.eksplor.models.Place;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeachFragment extends Fragment {


    public BeachFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_place, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        List<Place> places = new ArrayList<>();
        places.add(new Place(R.string.malpe_beach, R.drawable.malpe_beach));
        places.add(new Place(R.string.kapu_beach, R.drawable.kapu_beach));
        places.add(new Place(R.string.kodi_beach, R.drawable.kodi_beach));
        places.add(new Place(R.string.mattu_beach, R.drawable.mattu_beach));
        places.add(new Place(R.string.padubidri_beach, R.drawable.padubidri_beach));
        PlaceAdapter adapter = new PlaceAdapter(places);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        return rootView;
    }

}
