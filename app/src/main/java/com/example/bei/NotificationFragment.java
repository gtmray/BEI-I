package com.example.bei;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class NotificationFragment extends Fragment {
public NotificationFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);
        //Button btnOpen = (Button) view.findViewById(R.id.btnOpen);
        Intent in = new Intent(getActivity(),SubActivity.class);

                startActivity(in);
return view;
    }
}