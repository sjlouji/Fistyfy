package com.example.fistyfy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import Adapter.RecycleAdapterCocoCart;
import Model.CocoCartModel1;

public class CartActivity extends AppCompatActivity {
    private ArrayList<CocoCartModel1> navigationModelClasses;
    private RecyclerView recyclerView;
    private RecycleAdapterCocoCart mAdapter;

    String rupees[]={"$329","$450","$90"};
    String phoneName[]={"Iphone X | 128 GB, Black | 6 GB ram |\n" +
            "12000 mAh battry","Mi Mix 2 (Black, 128 GB) 6GB Ram \n" +
            "with 5000 mAh…","Food container, set of 3 container,\n" +
            "yellow color"};
    Integer phoneImage[]={R.drawable.mobile1, R.drawable.mobile2, R.drawable.mobile1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        recyclerView = (RecyclerView)findViewById(R.id.recycler1);
        navigationModelClasses = new ArrayList<>();
        for (int i = 0; i < rupees.length; i++) {
            CocoCartModel1 beanClassForRecyclerView_contacts = new CocoCartModel1(phoneName[i],rupees[i],phoneImage[i]);

            navigationModelClasses.add(beanClassForRecyclerView_contacts);
        }
        mAdapter = new RecycleAdapterCocoCart(getApplicationContext(),navigationModelClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
