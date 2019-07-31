package com.example.fistyfy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import Adapter.CocoProductListGrideAdapter;
import Adapter.MSliderAdapter;
import Adapter.PicassoImageLoadingService;
import Model.CocoProductListGridmodel;
import ss.com.bannerslider.Slider;
import ss.com.bannerslider.event.OnSlideClickListener;


public class FragmentHome extends Fragment {
    Integer mobi[] = {R.drawable.img1,R.drawable.img1,R.drawable.img1,R.drawable.img1};

    private RecyclerView recyclerView;
    private CocoProductListGrideAdapter coco_product_list_gride_adapter;
    private ArrayList<CocoProductListGridmodel> coco_product_list_gride_models;
    View v;
    LinearLayout lo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_fragment_home, container, false);
        recyclerView = v.findViewById(R.id.product);
        lo=v.findViewById(R.id.louji);
        lo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getContext(),Explore.class);
                startActivity(i);
            }
        });
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setNestedScrollingEnabled(false);

        coco_product_list_gride_models = new ArrayList<>();

        for (int i = 0; i < mobi.length; i++) {
            CocoProductListGridmodel ab = new CocoProductListGridmodel(mobi[i]);
            coco_product_list_gride_models.add(ab);
        }
        coco_product_list_gride_adapter = new CocoProductListGrideAdapter(getContext(), coco_product_list_gride_models);
        recyclerView.setAdapter(coco_product_list_gride_adapter);

        PicassoImageLoadingService picassoImageLoadingService = new PicassoImageLoadingService(getContext());
        Slider.init(picassoImageLoadingService);
        Slider slider = v.findViewById(R.id.banner);
        slider.setAdapter(new MSliderAdapter());
        slider.setOnSlideClickListener(new OnSlideClickListener() {
            @Override
            public void onSlideClick(int position) {

            }
        });
        ImageView cat=v.findViewById(R.id.cart_navigation);
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getContext(),CartActivity.class);
                startActivity(i);
            }
        });
        return v;
    }


}
