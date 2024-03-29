package com.example.fistyfy;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Adapter.RecycleAdapteHomeBanner;
import Adapter.RecycleAdapteKitchen;
import Adapter.RecycleAdapteTopTenHome;
import Model.HomeBannerModelClass;
import Model.TopTenModelClass;


public class NewArrivalFragment extends Fragment {


    private ArrayList<HomeBannerModelClass> homeBannerModelClasses;
    private RecyclerView recyclerView;
    private RecycleAdapteHomeBanner mAdapter;
    private Integer image[] ={R.drawable.image95,R.drawable.image95,R.drawable.image95,R.drawable.image95};




    private ArrayList<TopTenModelClass> topTenModelClasses;
    private RecyclerView top_ten_crecyclerview;
    private RecycleAdapteTopTenHome mAdapter2;
    private Integer image1[]={R.drawable.ac,R.drawable.headphones,R.drawable.ac,R.drawable.headphones};
    private String title1[] ={"Vigo Atom Personal Air Condi....","Bosh Head Phone Blue Color","Vigo Atom Personal Air Condi....","Bosh Head Phone Blue Color",};
    private String type[] = {"Kitenid","HeadPhones","Kitenid","HeadPhones"};




    private ArrayList<TopTenModelClass> topTenModelClasses1;
    private RecyclerView kitchen_crecyclerview;
    private RecycleAdapteKitchen mAdapter3;
    private Integer image2[]={R.drawable.gas,R.drawable.box,R.drawable.gas,R.drawable.box,R.drawable.gas,R.drawable.box};
    private String title2[] ={"Stove, Black color 4 sided","Kitchen Container","Stove, Black color 4 sided","Kitchen Container",
            "Stove, Black color 4 sided","Kitchen Container"};
    private String type2[] = {"Kitchen","Kitchen","Kitchen","Kitchen","Kitchen","Kitchen"};



View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_new_arrival, container, false);
        recyclerView = (RecyclerView)v.findViewById(R.id.recyclerview);

        homeBannerModelClasses = new ArrayList<>();



        for (int i = 0; i < image.length; i++) {
            HomeBannerModelClass beanClassForRecyclerView_contacts = new HomeBannerModelClass(image[i]);

            homeBannerModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new RecycleAdapteHomeBanner(getActivity(), homeBannerModelClasses);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);


        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);






        //        Top Ten  Recyclerview Code is here

        top_ten_crecyclerview = (RecyclerView)v.findViewById(R.id.top_ten_recyclerview);

        topTenModelClasses = new ArrayList<>();



        for (int i = 0; i < image1.length; i++) {
            TopTenModelClass beanClassForRecyclerView_contacts = new TopTenModelClass(image1[i],title1[i],type[i]);

            topTenModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter2 = new RecycleAdapteTopTenHome(getActivity(), topTenModelClasses);
        RecyclerView.LayoutManager mLayoutManager2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        top_ten_crecyclerview.setLayoutManager(mLayoutManager2);


        top_ten_crecyclerview.setLayoutManager(mLayoutManager2);
        top_ten_crecyclerview.setItemAnimator(new DefaultItemAnimator());
        top_ten_crecyclerview.setAdapter(mAdapter2);



        //        Top Ten  Recyclerview Code is here

        kitchen_crecyclerview = (RecyclerView)v.findViewById(R.id.kitchen_recyclerview);

        topTenModelClasses1 = new ArrayList<>();



        for (int i = 0; i < image2.length; i++) {
            TopTenModelClass beanClassForRecyclerView_contacts = new TopTenModelClass(image2[i],title2[i],type2[i]);

            topTenModelClasses1.add(beanClassForRecyclerView_contacts);
        }

//
//        mAdapter3 = new RecycleAdapteTopTenHome(getActivity(), topTenModelClasses1);
//        RecyclerView.LayoutManager mLayoutManager3 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
//        kitchen_crecyclerview.setLayoutManager(mLayoutManager3);


        mAdapter3 = new RecycleAdapteKitchen(getActivity(),topTenModelClasses1);

        RecyclerView.LayoutManager mLayoutManager4 = new GridLayoutManager(getActivity(),3);

        kitchen_crecyclerview.setLayoutManager(mLayoutManager4);
        kitchen_crecyclerview.setItemAnimator(new DefaultItemAnimator());
        kitchen_crecyclerview.setAdapter(mAdapter3);



        return v;
    }


}
