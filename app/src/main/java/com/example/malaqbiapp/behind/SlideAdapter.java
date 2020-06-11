package com.example.malaqbiapp.behind;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import com.example.malaqbiapp.R;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SlideAdapter(Context context) {
        this.context = context;

    }

    public int[] slide_imges = {
            R.drawable.img_splash1,
            R.drawable.splash2,
            R.drawable.img_splash3
    };

    public String[] slide_descs = {
      "Hadir untuk memperkenalkan Budaya mandar",
      "Menambah wawasan seputar Budaya Mandar",
      "Untuk Menjaga dan Melestarikan Budaya Mandar"
    };

    @Override
    public int getCount() {
        return slide_imges.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==(RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView sliImageView=(ImageView) view.findViewById(R.id.slide_image);
        TextView slTextView=(TextView) view.findViewById(R.id.slide_desc);

        sliImageView.setImageResource(slide_imges[position]);
        slTextView.setText(slide_descs[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
