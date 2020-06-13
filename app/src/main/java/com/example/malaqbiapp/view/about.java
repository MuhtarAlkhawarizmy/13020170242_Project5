package com.example.malaqbiapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

import com.example.malaqbiapp.R;

public class about extends AppCompatActivity {
    private Toolbar toolbarAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        toolbarAbout=findViewById(R.id.toolbarAbout);
        toolbarAbout.setTitle("About Us");
        setSupportActionBar(toolbarAbout);
        toolbarAbout.setNavigationIcon(R.drawable.btn_back);
        toolbarAbout.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}