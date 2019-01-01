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
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_place, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        List<Place> places = new ArrayList<>();
        places.add(new Place(R.string.dollops, R.drawable.dollops));
        places.add(new Place(R.string.the_egg_factory, R.drawable.the_egg_factory));
        places.add(new Place(R.string.saiba, R.drawable.saiba));
        places.add(new Place(R.string.eye_of_the_tiger, R.drawable.eye_of_the_tiger));
        places.add(new Place(R.string.sizzlers_ranch, R.drawable.sizzlers_ranch));
        PlaceAdapter adapter = new PlaceAdapter(places);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        return rootView;
    }

}
