package com.example.fistyfy;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Whishlist extends Fragment {
View v;
    TextView txt1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_whishlist, container, false);
        txt1=(TextView)v.findViewById(R.id.txt1);
        txt1.setText("Whishlist");
        return v;
    }


}
