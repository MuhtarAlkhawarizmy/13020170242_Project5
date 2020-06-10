package com.example.malaqbiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {
    private final int NUM_PAGES = 3;
    private ViewPager2 page;
    private MeowBottomNavigation BtmNav;
    private ScreenSlidePagerAdapter adptr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        page = findViewById(R.id.ViewPager);
        adptr=new ScreenSlidePagerAdapter(this);
        BtmNav = findViewById(R.id.bottomNavigation);
        page.setAdapter(adptr);
        page.setCurrentItem(0);
        page.setUserInputEnabled(false);
        BtmNav.show(1,true);

        BtmNav.add(new MeowBottomNavigation.Model(1, R.drawable.img_home));
        BtmNav.add(new MeowBottomNavigation.Model(2, R.drawable.img_daftar));
        BtmNav.add(new MeowBottomNavigation.Model(3, R.drawable.img_akun));

        BtmNav.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                switch (item.getId()) {
                    case 1:
                        page.setCurrentItem(0);
                        break;
                    case 2:
                        page.setCurrentItem(1);
                        break;
                    case 3:
                        page.setCurrentItem(2);
                        break;
                    default:
                        page.setCurrentItem(0);
                        break;
                }
            }
        });

        BtmNav.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                //
            }
        });

        BtmNav.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                //
            }
        });
    }


    private class ScreenSlidePagerAdapter extends FragmentStateAdapter {
        public ScreenSlidePagerAdapter(FragmentActivity fa) {
            super(fa);
        }

        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return new Home();
                case 1:
                    return new Daerah();
                case 2:
                    return new Akun();
                default:
                    return new Home();
            }
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }
}