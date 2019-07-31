package com.example.fistyfy;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import Adapter.CocoProductDetailsAdapter;
import me.relex.circleindicator.CircleIndicator;

public class Details4Fragment extends Fragment implements View.OnClickListener {
    View v;
    ViewPager viewPager;
    private CocoProductDetailsAdapter a1;
    CircleIndicator indicator;

    FrameLayout frame1, frame2, frame3, framelayout1, framelayout2, framelayout3,framelayout4;
    TextView text1, text2, text3,text4;

    ImageView image1, image2, image3;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.details4fragment, container, false);


        frame1 = v.findViewById(R.id.frame1);
        frame2 = v.findViewById(R.id.frame2);
        frame3 = v.findViewById(R.id.frame3);

        image1 = v.findViewById(R.id.image1);
        image2 = v.findViewById(R.id.image2);
        image3 = v.findViewById(R.id.image3);

        text1 = v.findViewById(R.id.text1);
        text2 = v.findViewById(R.id.text2);
        text3 = v.findViewById(R.id.text3);
        text4 = v.findViewById(R.id.text4);

        framelayout1 = v.findViewById(R.id.framelayout1);
        framelayout2 = v.findViewById(R.id.framelayout2);
        framelayout3 = v.findViewById(R.id.framelayout3);
        framelayout4 = v.findViewById(R.id.framelayout4);


        frame1.setOnClickListener(this);
        frame2.setOnClickListener(this);
        frame3.setOnClickListener(this);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);


//        text1.setOnClickListener(this);
//        text2.setOnClickListener(this);
//        text3.setOnClickListener(this);
//        text4.setOnClickListener(this);



        framelayout1.setOnClickListener(this);
        framelayout2.setOnClickListener(this);
        framelayout3.setOnClickListener(this);
        framelayout4.setOnClickListener(this);


        viewPager = v.findViewById(R.id.viewPager);

        CircleIndicator indicator = v.findViewById(R.id.indicator);

        a1 = new CocoProductDetailsAdapter(getFragmentManager());

        viewPager.setAdapter(a1);

        indicator.setViewPager(viewPager);

        a1.registerDataSetObserver(indicator.getDataSetObserver());

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.image1:
                frame1.setBackgroundResource(R.drawable.dashedline_rectangle_full_with_radius);
                frame2.setBackgroundResource(R.drawable.grey_rectangle_full_with_radius);
                frame3.setBackgroundResource(R.drawable.grey_rectangle_full_with_radius);
                break;

            case R.id.image2:
                frame1.setBackgroundResource(R.drawable.grey_rectangle_full_with_radius);
                frame2.setBackgroundResource(R.drawable.dashedline_rectangle_full_with_radius);
                frame3.setBackgroundResource(R.drawable.grey_rectangle_full_with_radius);
                break;

            case R.id.image3:
                frame1.setBackgroundResource(R.drawable.grey_rectangle_full_with_radius);
                frame2.setBackgroundResource(R.drawable.grey_rectangle_full_with_radius);
                frame3.setBackgroundResource(R.drawable.dashedline_rectangle_full_with_radius);
                break;

            case R.id.framelayout1:
                framelayout1.setBackgroundResource(R.drawable.red_rectangle_full_with_radius);
                framelayout2.setBackgroundResource(R.drawable.darkgrey_rectangle_full_with_radius);
                framelayout3.setBackgroundResource(R.drawable.darkgrey_rectangle_full_with_radius);
                framelayout4.setBackgroundResource(R.drawable.darkgrey_rectangle_full_with_radius);


                text1.setTextColor(Color.parseColor("#d44334"));
                text2.setTextColor(Color.parseColor("#666666"));
                text3.setTextColor(Color.parseColor("#666666"));
                text4.setTextColor(Color.parseColor("#666666"));


                break;

            case R.id.framelayout2:
                framelayout1.setBackgroundResource(R.drawable.darkgrey_rectangle_full_with_radius);
                framelayout2.setBackgroundResource(R.drawable.red_rectangle_full_with_radius);
                framelayout3.setBackgroundResource(R.drawable.darkgrey_rectangle_full_with_radius);
                framelayout4.setBackgroundResource(R.drawable.darkgrey_rectangle_full_with_radius);


                text1.setTextColor(Color.parseColor("#666666"));
                text2.setTextColor(Color.parseColor("#d44334"));
                text3.setTextColor(Color.parseColor("#666666"));
                text4.setTextColor(Color.parseColor("#666666"));

                break;

            case R.id.framelayout3:
                framelayout1.setBackgroundResource(R.drawable.darkgrey_rectangle_full_with_radius);
                framelayout2.setBackgroundResource(R.drawable.darkgrey_rectangle_full_with_radius);
                framelayout3.setBackgroundResource(R.drawable.red_rectangle_full_with_radius);
                framelayout4.setBackgroundResource(R.drawable.darkgrey_rectangle_full_with_radius);


                text1.setTextColor(Color.parseColor("#666666"));
                text2.setTextColor(Color.parseColor("#666666"));
                text3.setTextColor(Color.parseColor("#d44334"));
                text4.setTextColor(Color.parseColor("#666666"));


                break;
            case R.id.framelayout4:
                framelayout1.setBackgroundResource(R.drawable.darkgrey_rectangle_full_with_radius);
                framelayout2.setBackgroundResource(R.drawable.darkgrey_rectangle_full_with_radius);
                framelayout3.setBackgroundResource(R.drawable.darkgrey_rectangle_full_with_radius);
                framelayout4.setBackgroundResource(R.drawable.red_rectangle_full_with_radius);


                text1.setTextColor(Color.parseColor("#666666"));
                text2.setTextColor(Color.parseColor("#666666"));
                text3.setTextColor(Color.parseColor("#666666"));
                text4.setTextColor(Color.parseColor("#d44334"));
                break;
        }
    }
}
