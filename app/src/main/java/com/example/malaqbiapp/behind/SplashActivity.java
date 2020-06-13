package com.example.malaqbiapp.behind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.malaqbiapp.R;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=1200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gofliper=new Intent(SplashActivity.this, flipper.class);
                startActivity(gofliper);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}