package com.example.fistyfy;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentCate extends Fragment {


View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v= inflater.inflate(R.layout.fragment_fragment_cate, container, false);



        return v;
    }


}
