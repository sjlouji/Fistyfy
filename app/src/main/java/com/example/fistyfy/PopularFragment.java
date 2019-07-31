package com.example.fistyfy;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Adapter.RecycleAdapteProductGrid;
import Model.ProductGridModellClass;


public class PopularFragment extends Fragment {
    private ArrayList<ProductGridModellClass> productGridModellClasses;
    private RecyclerView recyclerview;
    private RecycleAdapteProductGrid mAdapter2;
    private Integer image1[]={R.drawable.iphnx,R.drawable.iphnx,R.drawable.iphnx,R.drawable.iphnx,R.drawable.iphnx,R.drawable.iphnx};


    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_popular, container, false);
        //      New Arrival Kitchen  Recyclerview Code is here

        recyclerview = (RecyclerView)v.findViewById(R.id.recyclerview);

        productGridModellClasses = new ArrayList<>();



        for (int i = 0; i < image1.length; i++) {
            ProductGridModellClass beanClassForRecyclerView_contacts = new ProductGridModellClass(image1[i]);
            productGridModellClasses.add(beanClassForRecyclerView_contacts);
        }



        mAdapter2 = new RecycleAdapteProductGrid(getActivity(),productGridModellClasses);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(),2);
        recyclerview.setLayoutManager(mLayoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.setAdapter(mAdapter2);


        return v;
    }


}
