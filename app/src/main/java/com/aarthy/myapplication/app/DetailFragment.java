package com.aarthy.myapplication.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by aarthy on 5/4/15.
 */


public  class DetailFragment extends Fragment {

    public DetailFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        String weather_from_main = getActivity().getIntent().getExtras().getString("weather").toString();
        TextView textView = (TextView) rootView.findViewById(R.id.forecast_detail);
        textView.setText(weather_from_main);
        return rootView;
    }
}

