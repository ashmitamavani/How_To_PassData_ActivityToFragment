package com.example.how_to_passdata_activitytofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Once_Fragment extends Fragment {
    TextView t1,t2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_once_, container, false);
       t1=view.findViewById(R.id.t1);
       t2=view.findViewById(R.id.t2);

       Bundle bundle=this.getArguments();

       t1.setText(bundle.getString("userMobile"));
       t2.setText(bundle.getString("userEmail"));


        return view;
    }
}