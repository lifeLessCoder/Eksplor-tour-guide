package com.livelyc0der.eksplor.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
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
public class NearByFragment extends Fragment {


    public NearByFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_place, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        List<Place> places = new ArrayList<>();
        places.add(new Place(R.string.st_mary_island, R.drawable.st_marys_island));
        places.add(new Place(R.string.karkala, R.drawable.karkala));
        places.add(new Place(R.string.agumbe, R.drawable.agumbe));
        places.add(new Place(R.string.kudremukh, R.drawable.kudremukh));
        places.add(new Place(R.string.turtle_bay, R.drawable.turtle_bay));
        PlaceAdapter adapter = new PlaceAdapter(places);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        return rootView;
    }

}
