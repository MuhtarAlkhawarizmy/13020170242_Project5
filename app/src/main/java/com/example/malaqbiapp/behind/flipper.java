package com.example.malaqbiapp.behind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.malaqbiapp.R;

public class flipper extends AppCompatActivity {
    private Button btn_Daftar, btn_Login;
    private ViewPager mSlideViewPager;
    private LinearLayout mDotlaLayout;
    private SlideAdapter slideAdapter;
    private TextView[] mDots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipper);

        btn_Daftar=findViewById(R.id.btnGoDaftar);
        btn_Login=findViewById(R.id.btnGoLogin);

        mSlideViewPager=(ViewPager) findViewById(R.id.slideViewPager);
        mDotlaLayout=(LinearLayout) findViewById(R.id.dotsLayout);

        slideAdapter=new SlideAdapter(this);
        mSlideViewPager.setAdapter(slideAdapter);
        addDotsIndicator(0);
        mSlideViewPager.addOnPageChangeListener(viewListener);

        btn_Daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goDaftar1= new Intent(flipper.this, daftar.class);
                startActivity(goDaftar1);
            }
        });

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goLogin1=new Intent(flipper.this, login.class);
                startActivity(goLogin1);
            }
        });
    }

    private void addDotsIndicator(int position){
        mDots=new TextView[3];
        mDotlaLayout.removeAllViews();

        for (int i=0; i<mDots.length; i++){
            mDots[i]=new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            mDotlaLayout.addView(mDots[i]);
        }
        if (mDots.length>0){
            mDots[position].setTextColor(getResources().getColor(R.color.colorPrimary));
        }
    }

    ViewPager.OnPageChangeListener viewListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDotsIndicator(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}